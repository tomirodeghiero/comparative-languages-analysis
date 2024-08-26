#!/bin/sh
DoExitAsm ()
{ echo "An error occurred while assembling $1"; exit 1; }
DoExitLink ()
{ echo "An error occurred while linking $1"; exit 1; }
OFS=$IFS
IFS="
"
/Library/Developer/CommandLineTools/usr/bin/ld        -x   -multiply_defined suppress -L. -o CallToCV2 `cat link11846.res` -filelist linkfiles11846.res
if [ $? != 0 ]; then DoExitLink ; fi
IFS=$OFS
