### Ejemplo en Java (Dynamic Dispatching)

En Java, los métodos son resueltos dinámicamente por defecto, es decir, en tiempo de ejecución. Esto significa que si tenemos una clase base y una clase derivada que sobreescribe un método, la versión del método en la clase derivada será llamada cuando el objeto es de la clase derivada, aunque la referencia sea de la clase base.

```java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // La referencia es de tipo Animal, pero el objeto es de tipo Dog
        myAnimal.sound(); // Llama al método `sound` de `Dog` (dynamic dispatching)
    }
}
```

#### Salida esperada:
```
Bark
```

En este ejemplo, aunque la referencia `myAnimal` es de tipo `Animal`, la JVM en tiempo de ejecución invoca el método `sound` de `Dog` debido a la **resolución dinámica** (dynamic dispatching).

### Ejemplo en C++ (Static Dispatching por defecto)

En C++, las llamadas a métodos son resueltas estáticamente por defecto. Esto significa que si tenemos una clase base y una clase derivada con el mismo método, la versión de la clase base será llamada cuando usamos una referencia o un puntero de la clase base, incluso si el objeto es de la clase derivada.

```cpp
#include <iostream>
using namespace std;

class Animal {
public:
    void sound() {
        cout << "Some sound" << endl;
    }
};

class Dog : public Animal {
public:
    void sound() {
        cout << "Bark" << endl;
    }
};

int main() {
    Animal* myAnimal = new Dog(); // Puntero de tipo Animal, pero el objeto es de tipo Dog
    myAnimal->sound(); // Llama al método `sound` de `Animal` (static dispatching)
    delete myAnimal;
    return 0;
}
```

#### Salida esperada:
```
Some sound
```

En este caso, aunque `myAnimal` apunta a un objeto de tipo `Dog`, el método `sound` de `Animal` es llamado debido a la **resolución estática** (static dispatching) en C++.

### Dynamic Dispatching en C++ (usando `virtual`)

Para hacer que C++ utilice **dynamic dispatching** (también conocido como **polimorfismo en tiempo de ejecución**), necesitamos declarar el método en la clase base como `virtual`. Esto le indica al compilador que utilice una **tabla virtual (vtable)** para resolver el método en tiempo de ejecución.

Aquí está el ejemplo modificado:

```cpp
#include <iostream>
using namespace std;

class Animal {
public:
    virtual void sound() { // Método virtual
        cout << "Some sound" << endl;
    }
};

class Dog : public Animal {
public:
    void sound() override { // Sobreescribimos el método
        cout << "Bark" << endl;
    }
};

int main() {
    Animal* myAnimal = new Dog(); // Puntero de tipo Animal, pero el objeto es de tipo Dog
    myAnimal->sound(); // Llama al método `sound` de `Dog` (dynamic dispatching)
    delete myAnimal;
    return 0;
}
```

#### Salida esperada:
```
Bark
```

Al marcar el método `sound` como `virtual` en la clase `Animal`, C++ utiliza **dynamic dispatching**, lo que hace que se llame al método `sound` de la clase `Dog` cuando el objeto es de tipo `Dog`, incluso si la referencia es de tipo `Animal`.

### Resumen
- En **Java**, el dynamic dispatching es el comportamiento predeterminado para métodos no estáticos.
- En **C++**, el static dispatching es el comportamiento predeterminado. Para habilitar dynamic dispatching, debemos declarar los métodos como `virtual` en la clase base.
