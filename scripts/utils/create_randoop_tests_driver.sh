#!/bin/bash
#$1 tests path, $2 package

calculate_total_test_count() {
    local last_file_count=$(grep "@Test" $1randoop/$package/RegressionTest$(($test_files_count -1)).java | wc -l)
    local base_count=$((($test_files_count -1) * 500))
    local total_test_count=$(($base_count + $last_file_count))
 
    total_tests_digits=1
    local i=10
    while [[ $total_test_count -ge $i ]]
    do
        i=$(($i*10))
        total_tests_digits=$(($total_tests_digits+1))
    done
}

calculate_test_number() {
    local number=$(($1*500 + $2))
    local digits=1
    local i=10
    while [[ $number -ge $i ]]
    do
        i=$(($i*10))
        digits=$(($digits+1))
    done

    test_num=$number
    local digit_diff=$(($total_tests_digits - $digits))
    while [ $digit_diff -gt 0 ]
    do
        test_num="0$test_num"
        digit_diff=$(($digit_diff-1))
    done
}

package=${2//./\/}   #replace dots with / in package name

main_driver_class=$1randoop/$package/RegressionTestDriver.java
rm $main_driver_class

test_files_count=$(ls -dq $1randoop/$package/*RegressionTest[0-9]* | wc -l)
calculate_total_test_count $1

if [ "$test_files_count" -eq "0" ]; then
    exit
fi

echo "package $2;

public class RegressionTestDriver {

    public static void main(String... args) {" > $main_driver_class

#adding method calls in main
for i in $(seq 0 $(($test_files_count-1)))
do
    echo "        runTests$i();" >> $main_driver_class
done
echo "    }" >> $main_driver_class

#adding methods declarations
for i in $(seq 0 $(($test_files_count-1)))
do
    method_amount=$(grep "@Test" $1randoop/$package/RegressionTest$i.java | wc -l)
    echo "
    private static void runTests$i() {
        boolean hadFailure = false;
        RegressionTest$i t$i = new RegressionTest$i();
" >> $main_driver_class
    for j in $(seq 1 $method_amount)
    do
        calculate_test_number $i $j
        echo "        try {
            t$i.test$test_num();
        } catch (Throwable e) {
            hadFailure = true;
            e.printStackTrace();
        }" >> $main_driver_class
    done
    echo "
        if (hadFailure) {
            Runtime.getRuntime().exit(1);
        }
    }" >> $main_driver_class
done

echo "
}" >> $main_driver_class
