#!/bin/bash
#$1 full class name, $2 src path, $3 target method, $4 subject method, $5 additional lib as jar (optional)

output_dir=generated_specs/$4
mkdir -p $output_dir        #create directory to save generated specs
log=$output_dir/OASIslog.txt
rm -f $log              #delete old log if any
touch $log

bash scripts/utils/OASIs_mod.sh $1 $2 $3 $5 > $log