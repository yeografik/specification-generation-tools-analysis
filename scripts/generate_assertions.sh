#!/bin/bash


#$1 indicates the testing tool used

file="resources/subject_names.txt"

if [[ $1 != "randoop" && $1 != "evosuite" ]]; then
    echo -e "\n\n\n${RED}invalid testing tool provided, expected randoop or evosuite, but received $1 ${NORMAL}\n"
    exit
fi

IFS=';' #setting ; as delimiter
while read -ra line; do
    echo -e "\n\n\n${YELLOW}Generating assertions for ${line[0]}${NORMAL}\n"
    package_as_path="$( echo "${line[1]}" | tr  '.' '/'  )"
    ./scripts/utils/insert_assertion.sh subjects/"${line[0]}"/src/main/java/$package_as_path/"${line[2]}".java "${line[2]}" "${line[3]}" "${line[0]}" $1
    
    output_dir=assertions/"${line[0]}"/$1/
    mkdir -p $output_dir        #create directory to save assertions
    rm -f $output_dir/*.java    #delete old assertions if any

    #save the modified class into results and restore the original
    cp "subjects/${line[0]}/src/main/java/$package_as_path/${line[2]}.java" "$output_dir/${line[0]}.java"
    cp "original_subject_classes/${line[0]}/${line[2]}.java" "subjects/${line[0]}/src/main/java/$package_as_path/${line[2]}.java"
done <$file
