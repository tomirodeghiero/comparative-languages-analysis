### Ejercicio 1
**Aplicar la función PLUS a 1 y 2.**

La función `PLUS` se define como:

```
PLUS ≡ λ m n f x. n f (m f x)
```

Aplicando esto a los numerales de Church 1 y 2:

- 1 se representa como `λ f x. f x`
- 2 se representa como `λ f x. f (f x)`

Al aplicar la función `PLUS 1 2`, se deben seguir los siguientes pasos:

1. `PLUS 1 2 = (λ m n f x. n f (m f x)) 1 2`
2. Sustituimos `m` por 1 y `n` por 2:
   ```
   = λ f x. 2 f (1 f x)
   ```
3. Aplicamos el numeral de Church 1:
   ```
   = λ f x. 2 f (f x)
   ```
4. Aplicamos el numeral de Church 2:
   ```
   = λ f x. f (f (f x))
   ```

Este resultado es el numeral de Church 3, por lo tanto, `PLUS 1 2 = 3`.
