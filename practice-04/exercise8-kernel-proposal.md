### Ejercicio 8
**Proponer cambios en la sintaxis y semántica del lenguaje kernel para convertirlo en un lenguaje funcional puro.**

Con el objetivo de convertir un lenguaje kernel en un **lenguaje funcional puro**, propongo los siguientes cambios:

1. **Eliminar estado mutable:**
   - En un lenguaje funcional puro, no puede haber variables mutables. Todas las variables deben ser inmutables. Cualquier modificación se debe realizar retornando nuevas versiones de las estructuras de datos, en lugar de modificar las existentes.
   - Esto implicaría que cualquier operación sobre el estado tenga que retornar un nuevo estado sin alterar el original.

2. **Recursión en lugar de iteración:**
   - Debe eliminarse la iteración explícita (como los bucles `for` o `while`) y utilizar solo recursión. Esto asegura que el flujo de control se maneje exclusivamente mediante funciones y no mediante control de flujo imperativo.
   - Además, para evitar problemas de rendimiento y desbordamientos de pila, se deben usar optimizaciones de recursión en cola.

3. **Funciones puras y sin efectos colaterales:**
   - Todas las funciones en el lenguaje deben ser puras, lo que significa que no deben depender de nada fuera de su entrada ni producir efectos secundarios (como la escritura en variables globales o la modificación de entradas externas).
   - Esto aseguraría que la salida de una función dependa solo de sus parámetros de entrada.

4. **Incorporar evaluación diferida (lazy evaluation):**
   - La evaluación perezosa puede implementarse para asegurar que los valores solo se computen cuando son estrictamente necesarios. Esto también facilita la creación de estructuras de datos infinitas, como listas infinitas.

5. **Introducir soporte para funciones de orden superior:**
   - Las funciones deben ser capaces de tomar otras funciones como parámetros y retornar funciones como resultados, permitiendo así una mayor abstracción y flexibilidad.

Con estos cambios, se podría transformar el lenguaje kernel en un lenguaje funcional puro.