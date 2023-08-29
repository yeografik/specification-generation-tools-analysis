#!/bin/bash

function build_condition() {
    local -n ref=$1
    if [ "$ref" == "" ]; then
        ref="($2)"
    else
        ref="$ref && ($2)"
    fi
}

function join_condition() {
    local -n final_cond=$2
    if [ "$final_cond" == "" ]; then
        final_cond="$1"
    elif [ "$1" != "" ]; then
        final_cond="$final_cond && ($1)"
    fi
}

#$1 java file, $2 class name $3 method name, $4 subject, $5 used tool

specs="generated_specs/$4/$5/$5_inv.txt"

#check specs file exists and it's not empty
if ! [ -f "$specs" ] || [ $(wc -c < "$specs") -le "1" ]; then
    echo -e "\n${RED}file $specs doesn't exist or is empty${NORMAL}\n"
    exit
fi

#check AssertionInserter is compiled, if not compile it
if ! [ -e "/tmp/AssertionInserter.class" ]; then
    #.class file is sent to /tmp/
    javac -cp libs/javaparser-core-3.25.5-SNAPSHOT.jar:libs/javaparser-symbol-solver-core-3.25.5-SNAPSHOT.jar -d /tmp/ scripts/utils/AssertionInserter.java

    if [ $? != 0 ]; then
        echo -e "\n${RED}couldn't compile scripts/utils/AssertionInserter.java${NORMAL}\n"
    fi
fi

#read specs into variables to pass as arguments
class_cond=""
pre_cond=""
post_cond=""
cond=""
while read -r line; do
    if [[ $line == *"OBJECT"* ]]; then
        cond='class_cond'
    elif [[ $line == *"ENTER"* ]]; then
        cond='pre_cond'
    elif [[ $line == *"EXIT"* ]]; then
        cond='post_cond'
    elif [[ $line != *"===="* ]]; then
        build_condition $cond "$line"
    fi
done <$specs

#add class condition to pre and post conditions
join_condition "$class_cond" pre_cond
join_condition "$class_cond" post_cond

#run AssertionInserter
java -cp /tmp:libs/javaparser-core-3.25.5-SNAPSHOT.jar:libs/javaparser-symbol-solver-core-3.25.5-SNAPSHOT.jar AssertionInserter $1 $2 $3 "$pre_cond" "$post_cond"
