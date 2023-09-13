#!/bin/bash
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

#get line numbers where there is a return
return_lines=()
return_lines+=($(grep -n return $1 | grep -v @return | sed 's/^\([0-9]\+\):.*$/\1/'))
post_conds=("${return_lines[@]/*/}")
pre_cond=""

source scripts/utils/extract_specs.sh

#run AssertionInserter
java -cp /tmp/:libs/javaparser-core-3.25.5-SNAPSHOT.jar:libs/javaparser-symbol-solver-core-3.25.5-SNAPSHOT.jar java_classes/specs/AssertionInserter $1 $2 $3 "$pre_cond" "${post_conds[@]}"