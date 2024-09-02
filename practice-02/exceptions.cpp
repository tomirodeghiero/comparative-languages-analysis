#include <iostream>
#include <stdexcept> // for std::runtime_error

// Function that divides two integers and throws an exception if the denominator is zero
void divide(int numerador, int denominador) {
    if (denominador == 0) {
        // throw std::runtime_error("Error: Division by Zero");
        throw std::runtime_error("Error: Division by Zero");
    }
    std::cout << "Result: " << numerador / denominador << std::endl;
}

int main() {
    try {
        divide(10, 2);  // Example of a call that will not throw an exception
        divide(10, 0);  // Example of a call that will throw an exception
    } catch (const std::runtime_error& e) {
        // Capture the exception and print the error message
        std::cerr << "Error: " << e.what() << std::endl;
    }

    return 0;
}
