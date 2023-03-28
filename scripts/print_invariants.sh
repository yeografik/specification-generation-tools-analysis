#!/bin/bash
#$1 invariants path, $2 full class package, $3 objective method, $4 output dir
#$1 package, $2 class name, $3 name of class that contains tests, $4 objective method

java -cp $DAIKONDIR/daikon.jar daikon.PrintInvariants $1 --ppt-select-pattern="$2:::OBJECT|$2.$3" > $4

#provisory usage print_invariants.sh RegressionTestDriver.inv.gz DataStructures.StackAr push invariantes.txt