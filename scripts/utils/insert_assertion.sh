#!/bin/bash

function build_array_condition() {
    local -n ref=$1
    if [ "${ref[$3]}" == "" ]; then
        ref[$3]="($2)"
    else
        ref[$3]="${ref[$3]} && ($2)"
    fi
}

function build_condition() {
    if [ $3 -ne -1 ]; then  #index is not -1
        build_array_condition $1 "$2" $3
    else
        local -n ref=$1
        if [ "$ref" == "" ]; then
            ref="($2)"
        else
            ref="$ref && ($2)"
        fi
    fi
}

function join_condition() {
    local -n final_cond=$2
    if [ "$final_cond" == "" ]; then
        final_cond="$1"
    elif [ "$1" != "" ]; then
        final_cond="$final_cond && $1"
    fi
}

function join_post_conditions() {
    local -n final_conds=$2
    
    for i in "${!final_conds[@]}";
    do
        if [ "${final_conds[$i]}" == "" ]; then
            final_conds[$i]="$1"
        elif [ "$1" != "" ]; then
            final_conds[$i]="${final_conds[$i]} && ($1)"
        fi
    done
}

function get_array_pos() {
    local -n line_nums=$2
    exit_num=$(echo "$1" | sed 's/.*[^0-9]//g')
    ind=0
    for num in "${line_nums[@]}"
    do
        if [ "$num" -eq "$exit_num" ]; then
            echo $ind
            return 0
        fi
        ((ind++))
    done
    echo -1
}

function check_index_error() {
    if [ $1 -eq -1 ]; then
        echo -e "\n\n${RED}Exit number could not be found in return lines${NORMAL}\n"
    fi
}

#$1 java file, $2 class name $3 method name, $4 subject, $5 used tool

specs="generated_specs/$4/$5/$5_inv.txt"

#check specs file exists and it's not empty
if ! [ -f "$specs" ] || [ $(wc -c < "$specs") -le "1" ]; then
    echo -e "\n${RED}file $specs doesn't exist or is empty${NORMAL}\n"
    exit
fi

#check java classes are compiled, if not compile them
if [[ ! -f "/tmp/java_classes/specs/AssertionInserter.class" ]] && [[ ! -f "/tmp/java_classes/specs/MethodAnalyzer.class" ]] && [[ ! -f "/tmp/java_classes/specs/SpecManipulator.class" ]] && [[ ! -f "/tmp/java_classes/specs/StatementChecker.class" ]] && [[ ! -f "/tmp/java_classes/specs/StatementInserter.class" ]]; then
    echo "compiling assertion inserter classes"
    #.class file is sent to /tmp/java_classes/specs/
    javac -cp libs/javaparser-core-3.25.5-SNAPSHOT.jar:libs/javaparser-symbol-solver-core-3.25.5-SNAPSHOT.jar -d /tmp/ scripts/utils/java_classes/specs/*.java

    if [ $? != 0 ]; then
        echo -e "\n${RED}couldn't compile some classes on scripts/utils/java/${NORMAL}\n"
        exit
    fi
fi

#get return line numbers
return_lines=()
return_lines+=($(grep -n return $1 | grep -v @return | sed 's/^\([0-9]\+\):.*$/\1/'))
# echo "array?: ${return_lines[@]}, array[0]: ${return_lines[0]}, array[1]: ${return_lines[1]}, array[2]: ${return_lines[2]}, length: ${#return_lines[@]}"
post_conds=("${return_lines[@]/*/}")
# echo "post_conds: ${post_conds[@]}fin"

#read specs into variables to pass as arguments
class_cond=""
pre_cond=""
post_cond=""
cond=""
index=-1
while read -r line; do
    if [[ $line == *"OBJECT"* ]]; then
        cond='class_cond'
    elif [[ $line == *"ENTER"* ]]; then
        cond='pre_cond'
    elif [[ "$line" =~ EXIT[0-9]+ ]]; then
        cond='post_conds'
        index=$(get_array_pos "$line" return_lines)
        check_index_error $index
    elif [[ $line == *"EXIT"* ]]; then
        cond='post_cond'
    elif [[ $line != *"===="* ]]; then
        build_condition $cond "$line" $index
    else #case of ===== line
        index=-1
    fi
done <$specs

#add class condition to pre and post conditions
join_condition "$class_cond" pre_cond
join_condition "$class_cond" post_cond
join_post_conditions "$post_cond" post_conds

#run AssertionInserter
java -cp /tmp/:libs/javaparser-core-3.25.5-SNAPSHOT.jar:libs/javaparser-symbol-solver-core-3.25.5-SNAPSHOT.jar java_classes/specs/AssertionInserter $1 $2 $3 "$pre_cond" "${post_conds[@]}"