#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

int main(int argc, char* argv[]) {
    // Verificar si hay argumentos para ordenar
    if (argc < 2) {
        std::cerr << "Por favor, ingrese al menos un argumento para ordenar.\n";
        return 1;
    }

    // Crear un vector de strings para almacenar los argumentos
    std::vector<std::string> args(argv + 1, argv + argc);

    // Ordenar en orden ascendente usando std::less
    std::sort(args.begin(), args.end(), std::less<std::string>());
    std::cout << "Orden Ascendente:\n";
    for (const auto& arg : args) {
        std::cout << arg << " ";
    }
    std::cout << "\n";

    // Ordenar en orden descendente usando std::greater
    std::sort(args.begin(), args.end(), std::greater<std::string>());
    std::cout << "Orden Descendente:\n";
    for (const auto& arg : args) {
        std::cout << arg << " ";
    }
    std::cout << "\n";

    return 0;
}
