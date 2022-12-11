#!/bin/bash

sed -i '/java.lang.Object/d' $1
sed -i '/java.lang.Integer/d' $1