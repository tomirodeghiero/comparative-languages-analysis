### Ejercicio 11: Considerando el predicado `pertenece(L, L1)`.

Si se requiere construir el árbol SLD de la consulta `?pertenece(X, [1,2,1,3])`, se deben desarrollar ambas versiones del predicado, una eficiente con corte y otra sin corte.

#### Predicado sin corte:

```prolog
pertenece(X, [X|_]).
pertenece(X, [_|L]) :- pertenece(X, L).
```

#### Predicado con corte:

```prolog
pertenece(X, [X|_]) :- !.
pertenece(X, [_|L]) :- pertenece(X, L).
```

El corte (`!`) detendrá la búsqueda una vez que el primer elemento coincida.
