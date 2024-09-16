### Ejercicio 2
**Definir la función `IFTHENELSE`, la cual tendrá la semántica de una expresión condicional.**

Podemos definir `IFTHENELSE` como:

```
IFTHENELSE = λ c t e. c t e
```

- Si `c` es `TRUE`, devolverá `t`.
- Si `c` es `FALSE`, devolverá `e`.

En el cálculo lambda, `TRUE` se define como `λ t f. t` y `FALSE` como `λ t f. f`. Entonces, al aplicar `IFTHENELSE`:

- `IFTHENELSE TRUE t e = t`
- `IFTHENELSE FALSE t e = e`