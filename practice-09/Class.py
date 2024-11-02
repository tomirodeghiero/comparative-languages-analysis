from typing import Generic, TypeVar

# Definimos un tipo genérico T
T = TypeVar('T')

# Clase genérica Caja que contiene un elemento de tipo T
class Caja(Generic[T]):
    def __init__(self, contenido: T):
        self.contenido = contenido

    def obtener_contenido(self) -> T:
        return self.contenido

    def actualizar_contenido(self, nuevo_contenido: T) -> None:
        self.contenido = nuevo_contenido

# Ejemplo de uso con diferentes tipos
caja_entero = Cajaontenido de caja_entero:", caja_entero.obtener_contenido())  # 123

caja_cadena = Caja[str]("hola")
print("Contenido de caja_cadena:", caja_cadena.obtener_contenido()) 
caja_entero.actualizar_contenido(27)
print("Nuevo contenido de caja_entero:", caja_entero.obtener_contenido()) 
