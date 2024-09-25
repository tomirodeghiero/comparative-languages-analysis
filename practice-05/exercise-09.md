
### Ejercicio 9: Dar un ejemplo del problema de la negación en Prolog.

Un problema típico con la negación en Prolog es la **negación por fallo**, que implica que Prolog asume que algo es falso si no puede probar que es verdadero. Un ejemplo:

```prolog
gato(tom).
gato(felix).

perro(X) :- not(gato(X)).
```

Al hacer la consulta `perro(tom)`, Prolog devolverá `false` porque puede probar que `tom` es un gato. Sin embargo, si consultamos `perro(rex)`, Prolog devolverá `true`, pero esto no significa que Rex sea un perro, simplemente que no es un gato.
