#include <stdio.h>

int* filaConMayorSuma(int arr[][3], int p) {
    int maxSuma = 0, indiceMax = 0;
    
    for (int i = 0; i < p; i++) {
        int suma = 0;
        for (int j = 0; j < 3; j++) {
            suma += arr[i][j];
        }
        if (suma > maxSuma) {
            maxSuma = suma;
            indiceMax = i;
        }
    }
    return arr[indiceMax];
}

int main() {
    int arr[3][3] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int* filaMax = filaConMayorSuma(arr, 3);

    printf("Fila con mayor suma: ");
    for (int i = 0; i < 3; i++) {
        printf("%d ", filaMax[i]);
    }
    printf("\n");
    
    return 0;
}
