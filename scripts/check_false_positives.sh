#!/bin/bash

function create_results_folder() {
    rm -f -r $output_dir       #delete old results if any
    mkdir -p $output_dir        #create directory to save results
    log=$output_dir/OASIslog.txt
    touch $log
}

function add_libraries() {
    libraries=""

    local file_count=$(ls subjects/$1/libs/ | wc -l)
    if [ $file_count -eq "0" ]; then
        return
    fi

    for lib in subjects/$1/libs/*.jar; do
        # echo "adding $lib"
        if [ -z "$libraries" ]; then
            libraries="${PWD}/$lib"
        else
            libraries="${PWD}/$lib:$libraries"
        fi
    done
}

#$1 indicates the testing tool used

file="resources/subject_names.txt"

if [[ $1 != "randoop" && $1 != "evosuite" ]]; then
    echo -e "\n\n\n${RED}invalid testing tool provided, expected randoop or evosuite, but received $1 ${NORMAL}\n"
    exit
fi

IFS=';' #setting ; as delimiter
while read -ra line; do
    echo -e "\n\n\n${YELLOW}Checking false positives for ${line[0]}${NORMAL}\n"
    
    assertions_file="assertions/${line[0]}/$1/${line[0]}.java"
    if [[ ! -f "$assertions_file" ]]; then
        echo -e "\n${RED}there are no assertions for ${line[0]} with $1${NORMAL}\n"
        continue
    fi
    
    package_as_path="$( echo "${line[1]}" | tr  '.' '/'  )"
    
    output_dir=$PWD/OASIs_results/"${line[0]}"/$1
    log=""
    create_results_folder
    add_libraries "${line[0]}"
    
    cp "$assertions_file" "subjects/${line[0]}/src/main/java/$package_as_path/${line[2]}.java"
    bash scripts/utils/OASIs_mod.sh "${line[1]}.${line[2]}" "subjects/${line[0]}/src/main/java" "${line[3]}" "$output_dir" "$package_as_path" "$libraries" > $log
    cp "original_subject_classes/${line[0]}/${line[2]}.java" "subjects/${line[0]}/src/main/java/$package_as_path/${line[2]}.java"
done <$file
