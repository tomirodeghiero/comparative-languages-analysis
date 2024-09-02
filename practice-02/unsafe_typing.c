#include <stdio.h>

int main() {
    int a = 65;
    char *pointer;

    // Force the conversion of an integer to a char pointer
    pointer = (char *) &a;

    // Modify the value through the char pointer
    *pointer = 'B';

    printf("a Value: %d\n", a);  // Print the value of 'a'
    printf("a Valor as char: %c\n", *pointer);  // Print the first byte of 'a'

    return 0;
}
