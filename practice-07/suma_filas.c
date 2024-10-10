#include <stdio.h>

void sumaFilas(int arr[][3], int p, int* sumas) {
    for (int i = 0; i < p; i++) {
        sumas[i] = 0;
        for (int j = 0; j < 3; j++) {
            sumas[i] += arr[i][j];
        }
    }
}

int main() {
    int arr[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int sumas[3];
    
    sumaFilas(arr, 3, sumas);
    
    printf("Suma de las filas: ");
    for (int i = 0; i < 3; i++) {
        printf("%d ", sumas[i]);
    }
    printf("\n");
    
    return 0;
}
