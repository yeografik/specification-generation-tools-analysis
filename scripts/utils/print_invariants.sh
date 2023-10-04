#!/bin/bash
#$1 invariants path, $2 full class package, $3 objective method, $4 output dir

java -cp $DAIKONDIR/daikon.jar daikon.PrintInvariants $1 --format Java --ppt-select-pattern="$2:::OBJECT|$2.$3\(" > $4

#example usage ./scripts/utils/print_invariants.sh RegressionTestDriver.inv.gz DataStructures.StackAr push invariantes.txt