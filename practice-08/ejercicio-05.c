#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr = (int *)malloc(sizeof(int));
    *ptr = 100;

    int *anotherPtr = (int *)malloc(sizeof(int));
    *anotherPtr = 200;

    ptr = anotherPtr;

    return 0;
}
