#include <stdio.h>
#include <stdlib.h>

int* sumaFilas(int* arr, int p,int q) {
    int* sumaArray = (int*)malloc(p * sizeof(int));

    for(int i = 0; i < p; i++) {
        int suma = 0;
        for(int j = 0; j < q; j++) {
            suma +=  *(arr + i * q + j);
        }
        *(sumaArray + i) = suma;
    }

    return sumaArray;
}

int main() {
    int p = 3, q = 3;
    int arr[3][3] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    int* resultado = sumaFilas((int*) arr, p, q);

    printf("Suma de las filas:\n");
    for (int i = 0; i < p; i++) {
        printf("Fila %d: %d\n", i, *(resultado + i));
    }

    printf("\n");

    free(resultado);
    
    return 0;
}
