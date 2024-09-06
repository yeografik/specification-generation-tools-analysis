#!/bin/bash

function create_results_folder() {
    rm -r -f $tmp_output_dir        #delete previous iteration results
    mkdir -p $tmp_output_dir        #create directory to save results
    log=$tmp_output_dir/OASIslog.txt
    touch $log
}

function add_libraries() {
    libraries=""

    local file_count=$(ls subjects/$1/libs/ | wc -l)
    if [ $file_count -eq "0" ]; then
        return
    fi

    for lib in subjects/$1/libs/*.jar; do
        if [ -z "$libraries" ]; then
            libraries="${PWD}/$lib"
        else
            libraries="${PWD}/$lib:$libraries"
        fi
    done
}

function clean_old_results_on_first_iteration() {
    if [ $1 -eq 1 ]; then
        rm -r -f $output_dir
    fi
}

function check_results() {
    if [ $(grep "^False Positive Detected" $log | wc -l) -ge 1 ]; then
        remove_from_subject_list $1
        save_results
    elif [ $(grep "^False Negative Detected" $log | wc -l) -ge 1 ]; then
        save_results
    elif [ ! -f "$output_dir/OASIslog.txt" ]; then
        save_results
    fi
}

function remove_from_subject_list() {
    grep -vwE "$1" $next_subjects_to_check > tmp_subjects_swap_var.txt
    cp tmp_subjects_swap_var.txt $next_subjects_to_check
}

function save_results() {
    rm -r -f $output_dir
    cp -r $tmp_output_dir $output_dir
}

function clean_temporal_files() {
    rm -r $tmp_output_dir
    rm $subjects_to_check
    rm $next_subjects_to_check
    rm tmp_subjects_swap_var.txt
}

#$1 indicates the testing tool used

if [[ $1 != "randoop" && $1 != "evosuite" ]]; then
    echo -e "\n\n\n${RED}invalid testing tool provided, expected randoop or evosuite, but received $1 ${NORMAL}\n"
    exit
fi

base_output_dir=$PWD/OASIs_results
#create a list of the subjects to analize
subjects_to_check=resources/subjects_to_check.txt
next_subjects_to_check=resources/next_subjects_to_check.txt
cp resources/subject_names.txt $next_subjects_to_check


file="$subjects_to_check"
IFS=';' #setting ; as delimiter
for i in {1..3}; do
    cp $next_subjects_to_check $subjects_to_check
    while read -ra line; do
        echo -e "\n\n\n${YELLOW}Checking false positives/negatives on ${line[0]} for ${i}th time${NORMAL}\n"
        
        assertions_file="assertions/${line[0]}/$1/${line[0]}.java"
        if [[ ! -f "$assertions_file" ]]; then
            echo -e "\n${RED}there are no assertions for ${line[0]} with $1${NORMAL}\n"
            continue
        fi
        
        package_as_path="$( echo "${line[1]}" | tr  '.' '/'  )"
        
        tmp_output_dir=$PWD/tmp_results/"${line[0]}"/$1
        log=""
        create_results_folder
        echo -e "log: $log"
        add_libraries "${line[0]}"
        
        cp "$assertions_file" "subjects/${line[0]}/src/main/java/$package_as_path/${line[2]}.java"
        bash scripts/utils/OASIs_mod.sh "${line[1]}.${line[2]}" "subjects/${line[0]}/src/main/java" "${line[3]}" "$tmp_output_dir" "$package_as_path" "$libraries" > $log
        cp "original_subject_classes/${line[0]}/${line[2]}.java" "subjects/${line[0]}/src/main/java/$package_as_path/${line[2]}.java"

        output_dir=$base_output_dir/"${line[0]}"/$1
        clean_old_results_on_first_iteration $i
        check_results "${line[0]}"
    done <$file
    
    clean_temporal_files

done