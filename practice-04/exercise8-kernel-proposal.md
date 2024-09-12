# Proponer cambios en la sintaxis y semántica del lenguaje kernel

Propuesta de cambios en sintaxis y semántica para un lenguaje funcional puro:

## Sintaxis:
- Cambiar la notación imperativa a una basada en funciones. Por ejemplo, eliminar asignaciones con `=` y reemplazarlas por definiciones de funciones.
- Usar expresiones lambda como base de todas las definiciones.
- Prohibir la mutabilidad de variables, lo que implica que una vez que se defina una variable, su valor no puede cambiar.

## Semántica:
- Introducir evaluación perezosa, es decir, las expresiones solo se evalúan cuando sus valores son requeridos.
- Asegurar que todas las funciones sean puras, lo que implica que no pueden tener efectos secundarios (como modificar variables globales o realizar operaciones de I/O).
- Implementar la semántica de funciones de alto orden, permitiendo que las funciones reciban otras funciones como parámetros y devuelvan funciones como resultado.
