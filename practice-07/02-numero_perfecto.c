#include <stdio.h>

int main() {
    int num, suma = 0;
    
    printf("Ingrese un número entero positivo: ");
    scanf("%d", &num);
    
    for (int i = 1; i < num; i++) {
        if (num % i == 0) {
            suma += i;
        }
    }
    
    if (suma == num) {
        printf("%d es un número perfecto\n", num);
    } else {
        printf("%d no es un número perfecto\n", num);
    }
    
    return 0;
}
