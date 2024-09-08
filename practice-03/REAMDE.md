# Resolución de la Práctica 03
### **Ejercicio 1: Análisis y Salida**

**Código Fuente:**

```pseudo
local X in
    local Y in
        local Z in
            X = person(name: "George", age: Y)
            Z = 26
            Z = Y
            {Browse Y}
        end
    end
    {Browse X}
end
```

**Descripción del Proceso:**

El programa declara tres variables locales, `X`, `Y` y `Z`, en diferentes niveles de ámbito local. Dentro del ámbito más anidado:

1. Se intenta asignar a `X` una estructura `person` que contiene un nombre y una edad. El nombre se asigna correctamente como "George". La edad se asigna como `Y`, pero en este punto, `Y` no ha sido inicialmente definido.
2. Se asigna el valor 26 a `Z`.
3. Inmediatamente después, `Z` se reasigna a `Y`, estableciendo el valor de `Y` como 26.
4. Se ejecuta `{Browse Y}`, lo cual muestra el valor de `Y` (26) en pantalla.

Al salir de este ámbito y volver al nivel donde se declaró `X`:

5. Se ejecuta `{Browse X}`, mostrando el objeto `person` donde `name` es "George" y `age` es 26, reflejando las asignaciones realizadas previamente.

**Salidas del Programa:**

1. La primera salida es `26`, resultado de `{Browse Y}`.
2. La segunda salida es el objeto `person(name: "George", age: 26)`, resultado de `{Browse X}`.

**Conclusión:**

El programa exhibe dos salidas conforme a las operaciones y asignaciones internas en los diferentes niveles de ámbito. La gestión de variables y su visibilidad en bloques anidados permite mostrar primero el valor numérico de `Y` y luego las propiedades del objeto `X`.

### **Ejercicio 2: Análisis y Resultado**

**Código Fuente:**

```pseudo
local X in
    local Y in
        X = person(name:"George", age:25)
        Y = person(name:"George", age:26)
        X = Y
    end
    {Browse Y}
end
```

**Descripción del Proceso:**

Este programa introduce dos variables locales, `X` y `Y`, dentro de distintos niveles de ámbito local. El flujo del programa es el siguiente:

1. `X` se inicializa con un objeto `person` que tiene el nombre "George" y edad 25.
2. Inmediatamente después, `Y` se inicializa con otro objeto `person`, también llamado "George" pero con edad 26.
3. Luego, `X` se reasigna para referenciar al mismo objeto que `Y`, es decir, `X` ahora apunta al objeto con nombre "George" y edad 26.

Al salir del bloque más interno:

4. Se intenta ejecutar `{Browse Y}` fuera del ámbito donde `Y` fue definida. Dependiendo del lenguaje de programación, esto podría resultar en un error debido a que `Y` no está definida en este nivel de ámbito.

**Resultado Esperado del Programa:**

El programa podría fallar o generar un error en el momento de intentar ejecutar `{Browse Y}` si el lenguaje de programación no permite el acceso a `Y` fuera del bloque donde fue definida. Esto es porque `Y` solo existe dentro del bloque más interno y no está accesible en el ámbito donde se ejecuta `{Browse Y}`.

**Salida del Programa:**

El programa no produce una salida visualizable debido al posible error mencionado, que se relaciona con el ámbito de la variable `Y`. La declaración `{Browse Y}` intenta acceder a una variable que no existe en su contexto actual, lo que resulta en un error de ámbito.

**Conclusión:**

El manejo de ámbitos de las variables es crucial y debe considerarse cuidadosamente para evitar errores de referencia a variables no definidas en un contexto dado. El programa ilustra la importancia de entender cómo las variables están encapsuladas dentro de bloques específicos y cómo las asignaciones pueden influir en la accesibilidad de las mismas fuera de esos bloques.

### **Ejercicio 3: Ejecución Paso a Paso con Máquina Abstracta**

**Código Fuente:**

```pseudo
local X in
    X = 1
    local P in
        P = proc { Y $}
            {Browse X}
        end
        local X in
            X = 2
            {P X}
        end
    end
end
```

**Descripción del Proceso de Ejecución:**

1. **Inicialización:** Se establece el ámbito inicial `{s}` donde se declara `X`.
2. **Asignación a X:** En el ámbito `{s1}`, se asigna `X = 1`.
3. **Declaración de P:** Dentro de `{s2}`, se introduce un nuevo ámbito para `P`.
4. **Definición de Procedimiento P:** En `{s3}`, se define el procedimiento `P` que al ejecutarse realizará `{Browse X}`, mostrando el valor de `X` del ámbito capturado en el momento de la definición de `P` (captura léxica).
5. **Segundo Ámbito para X:** En `{s4}`, se introduce un nuevo ámbito local para `X` y se asigna `X = 2`.
6. **Invocación de P:** En `{s6}`, se invoca el procedimiento `P` con el nuevo valor de `X`. Sin embargo, `P` utiliza el valor de `X` capturado durante su definición, que es 1.
7. **Resultado de {Browse X}:** Al ejecutar `{P X}`, se ejecuta `{Browse X}` dentro de `P`, mostrando 1, ya que `P` mantiene una referencia al valor de `X` desde su ámbito de definición, no el ámbito de invocación.

**Resultado Final:**

- **Salida del Programa:** Muestra `1` como resultado de la ejecución de `{Browse X}` dentro del procedimiento `P`. Esta salida refleja el uso de cierres y captura léxica en lenguajes que soportan funciones de primera clase o procedimientos como entidades de primera clase.

**Conclusión:**

Este programa ilustra un concepto importante en la programación de funciones y procedimientos, donde el entorno léxico (ámbito) en el que una función o procedimiento es definido impacta su comportamiento cuando se invoca en otro contexto. La capacidad de un procedimiento para "recordar" el ámbito en el que fue definido a través de cierres es crucial para entender cómo funcionan las funciones como ciudadanos de primera clase en muchos lenguajes modernos de programación.

### **Ejercicio 4**

El programa define dos procedimientos `F` y `P` dentro de ámbitos anidados, con `F` invocando a `P`. `P` modifica una variable `Z` capturando el valor de `Y` desde su entorno léxico. Al ejecutar `F` con `X` como argumento, `P` es invocado internamente estableciendo `X` al valor de `Y`, que es 1. La última operación `{Browse X}` muestra `1`.

### **Ejercicio 5**

El programa evalúa una expresión booleana para decidir qué valor imprimir. `X` es 1, `Y` es `2 + X = 3`. Dado que `X` no es mayor que `Y`, imprime `Y`, que es 3.

### **Ejercicio 6**

El procedimiento `Max` determina el máximo entre dos valores y lo asigna a `C` mediante argumentos por referencia. Con `A` y `B` siendo 3 y 2 respectivamente, el valor de `C` se establece en 3, que es el máximo. `{Browse C}` muestra 3.

### **Ejercicio 7**

`P` es un procedimiento que invoca otro procedimiento interno que establece `A` en 10. Al imprimir `A + Y` y dado que `Y` fue el argumento de `P` que originalmente es `X` (1), el resultado es `11`.

### **Ejercicio 8**

Este es un procedimiento recursivo que incrementa un valor `I` hasta que alcanza 5, momento en el cual se detiene la recursión. Dado que `A` comienza en -5, el procedimiento se invoca varias veces hasta que `I` es 5 y la recursión termina sin más acciones.

### **Ejercicio 9**

**9-a:** `Length` calcula la longitud de una lista recursivamente, devolviendo el recuento de elementos.

**9-b:** `ejemplo` es una función que concatena recursivamente elementos de la primera lista al principio de la segunda.

**9-c:** `inversa` invierte una lista mediante la recursividad y la concatenación.

### **Ejercicio 10**

**10-a:** `FoldR` es una función recursiva que reduce una lista desde la derecha con una función binaria, comenzando con un valor neutro. `SumList` y `ProdList` usan `FoldR` para sumar y multiplicar todos los elementos de una lista, respectivamente.

**10-b:** `Some` aplica una operación lógica `or` a una lista de valores booleanos, devolviendo `true` si algún elemento es `true`, de lo contrario `false`.

### **Ejercicio 11**

Define una función `Enteros` que genera números enteros consecutivos infinitamente. `L = {Enteros 5}` crea una secuencia comenzando en 5. La estructura de `case` se utiliza para imprimir los tres números siguientes a 5.

Cada ejercicio ilustra diferentes técnicas de programación funcional y procedimental, desde el manejo de ámbitos y procedimientos hasta la recursividad y funciones de alto orden.