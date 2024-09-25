
### Ejercicio 10: Considerar el programa:

```prolog
hombre(juan).
hombre(pedro).
mujer(X) :- not(hombre(X)).
```

#### (a) `?mujer(juan)`
Resultado: `false`. Prolog sabe que `juan` es un hombre, así que la consulta `mujer(juan)` falla.

#### (b) `?mujer(X)`
Resultado: `X = mujer(_).` Prolog devolverá `X = mujer(X)` para cualquier cosa que no sea hombre (pero no tiene datos adicionales).

#### (c) `?not(not(hombre(X)))`
Este predicado es equivalente a `hombre(X)`. Prolog simplemente verificará si `X` es un hombre, devolviendo las soluciones para `X = juan` y `X = pedro`, ya que la doble negación no cambia la verdad del predicado.
