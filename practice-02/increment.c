#include <stdio.h>

int x = 10;

int increment() {
    x += 1;
    return x;
}

int main() {
    int result1 = increment();
    int result2 = increment();

    printf("result1: %d\n", result1);
    printf("result2: %d\n", result2);

    return 0;
}
