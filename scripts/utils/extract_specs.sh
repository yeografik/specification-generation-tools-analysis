#!/bin/bash

function check_invalid_condition() {
    invalid_condition=false
    if [[ "$1" == "class_cond" && "$2" == "this != null" ]]; then
        invalid_condition=true
    fi
}

#add conditions together with && and puts them in an array index
function build_array_condition() {
    local -n ref=$1
    if [ "${ref[$3]}" == "" ]; then
        ref[$3]="($2)"
    else
        ref[$3]="${ref[$3]} && ($2)"
    fi
}

#add conditions together with &&
function build_condition() {
    check_invalid_condition $1 "$2" $3
    if $invalid_condition ; then
        return
    elif [ $3 -ne -1 ]; then  #there is a valid array index (!=-1)
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

#adds additional conditions to a condition with &&
function join_condition() {
    local -n final_cond=$2
    if [ "$final_cond" == "" ]; then
        final_cond="$1"
    elif [ "$1" != "" ]; then
        final_cond="$final_cond && $1"
    fi
}

#adds additional conditions to a condition in an array with &&
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

#get array index corresponding to the postcondition 
function get_array_pos() {
    local -n line_nums=$2
    exit_num=$(echo "$1" | sed 's/.*[^0-9]//g')
    ind=0
    for line_num in "${line_nums[@]}"
    do
        if [ "$line_num" -eq "$exit_num" ]; then
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
        exit
    fi
}

#read specs into variables to pass as arguments
#precond="" from inset_assertion.sh
#postconds=(return_lines[@].length) from inset_assertion.sh

class_cond=""
post_cond=""
cond=""
index=-1
#loop through specs file and put them in an array
while read -r line; do
    if [[ $line == *"OBJECT"* ]]; then
        cond='class_cond'
    elif [[ $line == *"ENTER"* ]]; then
        cond='pre_cond'
    # elif [[ "$line" =~ EXIT[0-9]+ ]]; then    #case of multiple returns
    #     cond='post_conds'
    #     index=$(get_array_pos "$line" return_lines)
    #     check_index_error $index
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
