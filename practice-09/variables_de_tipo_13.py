from typing import TypeVar, List

# Definimos una variable de tipo genérica T
T = TypeVar('T')

# Función genérica para encontrar el máximo en una lista
def encontrar_maximo(lista: List[T]) -> T:
    maximo = lista[0]
    for elemento in lista[1:]:
        if elemento > maximo:
            maximo = elemento
    return maximo

# Ejemplo de uso
numeros = [1, 5, 3, 9, 2]
palabras = ["manzana", "naranja", "pera", "uva"]

print(encontrar_maximo(numeros))   # Imprime: 9
print(encontrar_maximo(palabras))  # Imprime: uva
