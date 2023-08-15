#!/bin/bash
#$1 java file, $2 class name $3 method name, $4 condition to insert

javac -cp libs/javaparser-core-3.25.5-SNAPSHOT.jar:libs/javaparser-symbol-solver-core-3.25.5-SNAPSHOT.jar -d /tmp/ scripts/AssertionInserter.java

java -cp /tmp:libs/javaparser-core-3.25.5-SNAPSHOT.jar:libs/javaparser-symbol-solver-core-3.25.5-SNAPSHOT.jar AssertionInserter $1 $2 $3 "1 == 1" 
