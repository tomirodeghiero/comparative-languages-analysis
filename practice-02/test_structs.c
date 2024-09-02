#include <stdio.h>

// Define a structure to represent a point in the plane
struct PointA {
    int x;
    int y;
};

struct PointB {
    int x;
    int y;
};

void printPoint(struct PointA p) {
    printf("PointA: (%d, %d)\n", p.x, p.y);
}

int main() {
    struct PointA punto1 = {1, 2};
    struct PointB punto2 = {3, 4};

    printPoint(punto1); // this should work

    // Now we try to pass PointB to the function that expects PointA.
    // If C uses structural equivalence, this should work.
    // If it uses nominal equivalence, this should cause a compilation error.
    printPoint(punto2);  // this should not work because punto2 is of type PointB

    return 0;
}

// In practice, C uses nominal equivalence, not structural equivalence.
/* This means that even though struct PointA and struct PointB have the same internal structure,
the compiler considers them to be different types because of their different names.
Therefore, the code should not compile if you try to pass point2 to the function
that expects a struct PointA. */