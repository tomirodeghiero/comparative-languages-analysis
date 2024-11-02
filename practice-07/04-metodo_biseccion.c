#include <stdio.h>
#include <math.h>

double f(double x) {
    return x*x - 4;
}

void biseccion(double a, double b, double tol) {
    double c;
    while ((b - a) / 2.0 > tol) {
        c = (a + b) / 2.0;
        if (f(c) == 0.0) {
            break;
        } else if (f(c) * f(a) < 0) {
            b = c;
        } else {
            a = c;
        }
    }
    printf("La raíz aproximada es: %.5f\n", c);
}

int main() {
    double a = 0, b = 3, tol = 0.00001;
    biseccion(a, b, tol);
    return 0;
}
