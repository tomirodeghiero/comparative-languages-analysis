#!/usr/bin/perl
use strict;
use warnings;

my $var = 42;       # $var is an integer
print "Tipo de \$var: ", ref($var), "\n";  # Print: $var type: SCALAR

$var = "Hola";     # $var now is a string
print "Tipo de \$var: ", ref($var), "\n";  # Print: $var type: SCALAR
