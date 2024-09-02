#!/usr/bin/perl
use strict;
use warnings;

sub example_scope {
    my $local_var = "I'm local";  # $local_var have a local scope
    print "Inside example_scope: $local_var\n";
}

example_scope();

# Try to access $local_var outside example_scope
print "Fuera de example_scope: $local_var\n";  # This line will throw an error because $local_var is not defined in this scope
