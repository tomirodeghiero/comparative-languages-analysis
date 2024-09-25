### Ejercicio 8: Dado el programa Prolog:

```prolog
max(X,Y,Y) :- X =< Y.
max(X,Y,X) :- X > Y.
```

#### (a) ¿Es ineficiente? ¿Por qué?
Sí, este programa es ineficiente, ya que tiene dos cláusulas que cubren casos mutuamente excluyentes (`X =< Y` y `X > Y`). Sin embargo, Prolog evaluará ambas cláusulas independientemente, lo que implica una búsqueda innecesaria. En un caso, la segunda regla no será evaluada porque el predicado ya habrá sido satisfecho por la primera. Esto puede ralentizar el proceso cuando se trabaja con grandes conjuntos de datos.

#### (b) Proponer una mejora de su eficiencia.
Una forma de mejorar la eficiencia es utilizar un operador de corte (`!`) para evitar la evaluación innecesaria de la segunda cláusula si la primera ya ha sido satisfecha. El código mejorado sería:

```prolog
max(X,Y,Y) :- X =< Y, !.
max(X,Y,X).
```

Con esto, Prolog no intentará evaluar la segunda cláusula si la primera ya es verdadera.

#### (c) Construir el árbol SLD de ambas versiones con la consulta `?max(2,2,Z)`.

**Versión original sin corte:**

1. Consulta: `max(2,2,Z)`
   - Intenta `max(2,2,2)` porque `2 =< 2`.
   - Se unifica `Z = 2`.

Prolog sigue evaluando ambas cláusulas, pero el resultado final sigue siendo `Z = 2`.

**Versión con corte:**

1. Consulta: `max(2,2,Z)`
   - Intenta `max(2,2,2)` porque `2 =< 2`, y se activa el corte.
   - Se unifica `Z = 2`.

Prolog no busca más soluciones debido al corte, lo que ahorra tiempo.
