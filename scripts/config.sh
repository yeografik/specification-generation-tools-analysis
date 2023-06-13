#!/bin/bash

#colors
export RED=$(tput setaf 1)
export GREEN=$(tput setaf 2)
export YELLOW=$(tput setaf 3)
export NORMAL=$(tput sgr0)

#project_root=$(pwd)
export EVOSUITE_JAR="libs/evosuite-1.0.6.jar"
export RANDOOP_JAR="libs/randoop-all-4.3.1.jar"
export LITERALS="resources/literals.txt"

origdir=$PWD
cd ..
backdir=$PWD
cd $origdir
export OASIS_DIR="$backdir/OASIs"