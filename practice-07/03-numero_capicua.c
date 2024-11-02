#include <stdio.h>

int descomponerNumero(int num, int arr[]) {
    int i = 0;
    while (num > 0) {
        arr[i++] = num % 10;
        num /= 10;
    }
    return i;
}

int esCapicua(int arr[], int len) {
    for (int i = 0; i < len / 2; i++) {
        if (arr[i] != arr[len - 1 - i]) {
            return 0;
        }
    }
    return 1;
}

int main() {
    int num, arr[10], len;
    
    printf("Ingrese un número entero: ");
    scanf("%d", &num);
    
    len = descomponerNumero(num, arr);
    
    if (esCapicua(arr, len)) {
        printf("%d es capicúa\n", num);
    } else {
        printf("%d no es capicúa\n", num);
    }
    
    return 0;
}
