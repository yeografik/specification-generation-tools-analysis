#!/bin/sh

#  FPInstrumentation.sh
#  
#
#  Created by Gunel Jahangirova on 30/03/17.
#

#$1 class with package, $2 src location, $3 method name, $4 project output dir, $5 additional libs (optional)
orig_dir=$PWD;
root_dir=$OASIS_DIR;

cd $root_dir

class_full_name=$1;
src_location=$orig_dir/$2;
bin_location=$orig_dir/$2;
#src_location=$PWD/$2;

#bin_location=$PWD/$3;
target_method=$3;
#evosuite_location=/Users/guneljahangirova/Documents/evosuite_oai/master/target/evosuite-#master-1.0.5-SNAPSHOT.jar;
evosuite_location=$root_dir/tools/evosuite.jar;

class_name=${class_full_name##*.};
#echo $class_name

classname_path="$( echo "$class_full_name" | tr  '.' '/'  )";
#echo $classname_path;

d=$(date +%Y%m%d%H%M%S)

mkdir -p $root_dir/output/FP/$class_name/$d;
mkdir -p $root_dir/output/FP/$class_name/$d/instrumented/;

cp $src_location/$classname_path.java $root_dir/output/FP/$class_name/$d/$class_name.java;

mkdir -p $root_dir/$d/;
mkdir -p $root_dir/$d/src/;
mkdir -p $root_dir/$d/bin/;

additional_libs=""
if [ ! -z $5 ]; then
    additional_libs=":$5"
fi

cp -R $src_location/* $root_dir/$d/src/;
# cp -R $root_dir/$bin_location/ $root_dir/$d/bin/;

new_src_location=$root_dir/$d/src/;
new_bin_location=$root_dir/$d/bin/;

#rm -r $bin_location/$classname_path.class;
javac -cp $new_bin_location$additional_libs/daikon.jar -d $new_bin_location $new_src_location/$classname_path.java;
line_list="$(java -jar $root_dir/tools/fp.jar $new_src_location/$classname_path.java $target_method)";

cp $new_src_location/$classname_path.java $root_dir/output/FP/$class_name/$d/instrumented/$class_name.java;

#rm -r $bin_location/$classname_path.class;
javac -cp $new_bin_location$additional_libs/daikon.jar -d $new_bin_location $new_src_location/$classname_path.java;

cd $root_dir/output/FP/$class_name/$d/;
#$root_dir/FP/$class_name/$d/evo.txt

echo "Checking for False Positives...";
evo_output="$(java -jar $evosuite_location -generateTests -Dsearch_budget=60 -Dcriterion=branch -Dassertions=false -Dstrategy=onebranch -Dtest_comments=true -Djunit_suffix='_'$target_method'_Test' -Dline_list=$line_list -Dtarget_method_prefix=$target_method -projectCP $new_bin_location$additional_libs/ -class $class_full_name)";

cp $root_dir/output/FP/$class_name/$d/$class_name.java $src_location/$classname_path.java;

test="_"$target_method"_Test.java";
scaffolding="_"$target_method"_Test_scaffolding.java";

#rm -f $bin_location/$classname_path.class;
javac -cp $new_bin_location$additional_libs/daikon.jar -d $new_bin_location $new_src_location/$classname_path.java;

if [[ ($evo_output != *"Generated 0"*)  && ($evo_output == *"Resulting test suite"*) ]]; then
    cp $root_dir/output/FP/$class_name/$d/evosuite-tests/$classname_path$test $src_location/$classname_path$test;
    cp $root_dir/output/FP/$class_name/$d/evosuite-tests/$classname_path$scaffolding $src_location/$classname_path$scaffolding;

    echo "False Positive Detected!";
else
    if [[ $evo_output == *"Resulting test suite"* ]]; then
        echo "No False Positive Detected!";

        mkdir -p $root_dir/output/FN/$class_name/$d;
        mkdir -p $root_dir/output/FN/$class_name/$d/instrumented/;

        #rm -r $bin_location/$classname_path.class;
        rm -r $root_dir/$d/bin/$classname_path.class;
        rm -r $root_dir/$d/src/$classname_path.java;
        cp -R $src_location/* $root_dir/$d/src/;
        cp -R $bin_location/* $root_dir/$d/bin/;


        cp -R $src_location/* $root_dir/$d/;
        cp -R $bin_location/* $root_dir/$d/;

        new_src_location=$root_dir/$d/src/;
        new_bin_location=$root_dir/$d/bin/;
        
        cp $src_location/$classname_path.java $root_dir/output/FN/$class_name/$d/$class_name.java;

        line_list="$(java -jar $root_dir/tools/fn.jar $new_src_location/$classname_path.java $target_method)";
        line_array=($line_list)
        read -a line_array <<< "$line_list"
        #echo ${line_array[0]}
        #echo ${line_array[1]}
        #rm -r $bin_location/$classname_path.class;
        cp $new_src_location/$classname_path.java $root_dir/output/FN/$class_name/$d/instrumented/$class_name.java;
        javac -cp $new_bin_location$additional_libs/daikon.jar -d $new_bin_location $new_src_location/$classname_path.java;

        cd $root_dir/output/FN/$class_name/$d/;


        echo "Checking for False Negatives..."
        evo_fn_output="$(java -jar $evosuite_location -generateTests -Dsearch_budget=225 -Dtest_archive=false -Dminimize=true -Dcriterion=strongmutation -Dtest_comments=true -Dmutated_line_list=${line_array[0]} -Djunit_suffix='_'$target_method'_Test' -Dmutation_replacement_list=${line_array[1]} -Dassertions=false -Dtarget_method_prefix=$target_method -projectCP $new_bin_location$additional_libs/ -class $class_full_name)";

        #cp $root_dir/FN/$class_name/$d/$class_name.java $src_location/$classname_path.java;
        test="_"$target_method"_Test.java";
        scaffolding="_"$target_method"_Test_scaffolding.java";

        cp $root_dir/output/FN/$class_name/$d/evosuite-tests/$classname_path$test $src_location/$classname_path$test;
        cp $root_dir/output/FN/$class_name/$d/evosuite-tests/$classname_path$scaffolding $src_location/$classname_path$scaffolding;

        #rm -f $bin_location/$classname_path.class;
        javac -cp $new_bin_location$additional_libs/daikon.jar -d $new_bin_location $new_src_location/$classname_path.java;

        if [[ ($evo_fn_output != *"Generated 0"*) && ($evo_fn_output == *"Resulting test suite"*) ]]; then
            echo "False Negative Detected!"
        elif [[ $evo_fn_output == *"Resulting test suite"* ]]; then
            echo "No False Negative Detected!"
        fi
    fi
fi

rm $src_location/$classname_path\_$target_method\_Test.java
rm $src_location/$classname_path\_$target_method\_Test_scaffolding.java
rm -r $root_dir/$d/;

mkdir $4/FP/
cp -r $root_dir/output/FP/$class_name/$d/ $4/FP/
mkdir $4/FN/
cp -r $root_dir/output/FN/$class_name/$d/ $4/FN/

cd $orig_dir