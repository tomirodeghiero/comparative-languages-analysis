El **problema del rombo** (o **problema de la herencia diamante**) ocurre en programación orientada a objetos cuando una clase hereda de dos clases que, a su vez, heredan de una misma clase base. Esto puede crear ambigüedades en la jerarquía de herencia, especialmente cuando se trata de métodos o atributos que están definidos en la clase base.

A continuación, se muestra cómo resolver este problema en C++ y en Python.

---

### Resolución del Problema del Rombo en C++

En C++, el problema del rombo se resuelve utilizando la **herencia virtual**. Al declarar una clase base como `virtual`, C++ asegura que solo haya una copia de los miembros de esa clase en la jerarquía de herencia, evitando así la ambigüedad.

**Ejemplo en C++:**

**Nombre del archivo**: `ejercicio6_cpp.cpp`

```cpp
#include <iostream>
using namespace std;

class A {
public:
    void display() {
        cout << "Clase A" << endl;
    }
};

class B : virtual public A {
};

class C : virtual public A {
};

class D : public B, public C {
};

int main() {
    D obj;
    obj.display(); // Llama a `display` de `A` sin ambigüedad
    return 0;
}
```

**Comandos para compilar y ejecutar:**

1. Compilar el archivo:
   ```bash
   g++ -o ejercicio6_cpp ejercicio6_cpp.cpp
   ```

2. Ejecutar el archivo:
   ```bash
   ./ejercicio6_cpp
   ```

**Salida esperada**:
```
Clase A
```

**Explicación**: La palabra clave `virtual` en las declaraciones de `B` y `C` indica que `A` debe ser tratada como una clase virtual, evitando que `D` herede dos copias de `A` (una a través de `B` y otra a través de `C`). Esto resuelve la ambigüedad.

---

### Resolución del Problema del Rombo en Python

En Python, el problema del rombo se maneja a través del **Orden de Resolución de Métodos (MRO)**, que utiliza el algoritmo C3 Linearization. Esto significa que Python tiene un orden específico en el que busca los métodos en la jerarquía de clases, evitando duplicados.

Podemos ver el MRO en Python con el método `mro()` o `__mro__`.

**Ejemplo en Python:**

**Nombre del archivo**: `ejercicio6_python.py`

```python
class A:
    def display(self):
        print("Clase A")

class B(A):
    pass

class C(A):
    pass

class D(B, C):
    pass

# Crear una instancia de D
obj = D()
obj.display()  # Llama al método de A sin ambigüedad

# Ver el orden de resolución de métodos
print(D.__mro__)
```

**Comandos para ejecutar:**

1. Ejecutar el archivo en Python:
   ```bash
   python3 ejercicio6_python.py
   ```

**Salida esperada**:
```
Clase A
(<class '__main__.D'>, <class '__main__.B'>, <class '__main__.C'>, <class '__main__.A'>, <class 'object'>)
```

**Explicación**: En este ejemplo, cuando llamamos a `obj.display()`, Python sigue el MRO y encuentra el método `display` en la clase `A` sin ambigüedad. Gracias al MRO, Python evita duplicados al asegurarse de que cada clase en la jerarquía se evalúe en el orden correcto.

---

### Resumen

- **C++**: Resuelve el problema del rombo mediante **herencia virtual**.
- **Python**: Resuelve el problema mediante el **Orden de Resolución de Métodos (MRO)**, que define un orden de búsqueda y evita ambigüedades. 

Ambos enfoques permiten resolver el problema del rombo y asegurar que no haya ambigüedades al acceder a métodos o atributos en clases con herencia múltiple.
