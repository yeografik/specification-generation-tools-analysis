#!/bin/bash
#$1 file containing class dependencies

#removes dependencies that are trivial to be tested

sed -i '/java.lang.Object/d' $1
sed -i '/java.lang.Integer/d' $1
sed -i '/java.lang.Boolean/d' $1
sed -i '/java.util.HashMap/d' $1
sed -i '/java.util.ArrayList/d' $1
sed -i '/java.util.HashSet/d' $1
sed -i '/java.util.Set/d' $1
sed -i '/examples._Type328393/d' $1