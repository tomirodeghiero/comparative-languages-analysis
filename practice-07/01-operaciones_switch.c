#include <stdio.h>

int main() {
    char operador;
    int num1, num2;
    
    printf("Ingrese un operador (+, -, *, /): ");
    scanf(" %c", &operador);
    printf("Ingrese dos números enteros: ");
    scanf("%d %d", &num1, &num2);
    
    switch(operador) {
        case '+':
            printf("Resultado: %d\n", num1 + num2);
            break;
        case '-':
            printf("Resultado: %d\n", num1 - num2);
            break;
        case '*':
            printf("Resultado: %d\n", num1 * num2);
            break;
        case '/':
            if (num2 != 0)
                printf("Resultado: %d\n", num1 / num2);
            else
                printf("Error: División por cero\n");
            break;
        default:
            printf("Error: Operador inválido\n");
    }
    
    return 0;
}
