### Ejercicio 4
**Reducir la expresión (λu. u u) ((λx. x) (λx. x)) usando orden:**

#### a) Normal.

1. `(λu. u u) ((λx. x) (λx. x))`
2. Reducimos el argumento primero utilizando la regla normal:
   ```
   (λx. x) (λx. x) → (λx. x)
   ```
   Entonces tenemos:
   ```
   (λu. u u) (λx. x)
   ```
3. Sustituimos `u` por `(λx. x)` en la aplicación:
   ```
   (λx. x) (λx. x) → (λx. x)
   ```

El resultado final de la reducción en orden normal es `λx. x`.

#### b) Aplicativo.

1. `(λu. u u) ((λx. x) (λx. x))`
2. En la reducción aplicativo, primero reducimos el argumento:
   ```
   (λx. x) (λx. x) → (λx. x)
   ```
3. Ahora tenemos:
   ```
   (λu. u u) (λx. x)
   ```
4. Sustituimos `u` por `(λx. x)`:
   ```
   (λx. x) (λx. x) → (λx. x)
   ```

El resultado final de la reducción en orden aplicativo también es `λx. x`.

### Conclusión
Ambos métodos (normal y aplicativo) reducen a la misma expresión `λx. x`.