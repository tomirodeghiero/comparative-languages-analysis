### Ejercicio 12: Definir predicados en Prolog.

#### (a) `length(L, N)`. Donde `N` es la longitud de la lista `L`.

```prolog
length([], 0).
length([_|T], N) :- length(T, N1), N is N1 + 1.
```

#### (b) `append(A, B, C)`. Verifica si `C` es la concatenación de `A` y `B`.

```prolog
append([], L, L).
append([H|T], L, [H|R]) :- append(T, L, R).
```

#### (c) Unión y diferencia de conjuntos.

Para la **unión**:

```prolog
union([], L, L).
union([H|T], L, U) :- member(H, L), union(T, L, U).
union([H|T], L, [H|U]) :- not(member(H, L)), union(T, L, U).
```

Para la **diferencia**:

```prolog
diferencia([], _, []).
diferencia([H|T], L, R) :- member(H, L), diferencia(T, L, R).
diferencia([H|T], L, [H|R]) :- not(member(H, L)), diferencia(T, L, R).
```

Con esto, tienes los códigos y las explicaciones de los ejercicios que aparecen en la imagen. Si necesitas más detalles o ayuda adicional, no dudes en pedírmelo.
