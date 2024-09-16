

### Ejercicio 3
Dada la expresión lambda `λ x. x x)((λ x. x) y`:

#### a) Reducir a forma normal usando orden normal.

1. `λ x. x x)((λ x. x) y)`
2. Primero se aplica la parte externa:
   ```
   = ((λ x. x) y)((λ x. x) y)
   ```
3. Reducimos la primera parte:
   ```
   = y((λ x. x) y)
   ```
4. Finalmente:
   ```
   = y y
   ```

#### b) Reducir a forma normal usando orden aplicativo.

1. `λ x. x x)((λ x. x) y)`
2. Evaluamos el argumento primero:
   ```
   = λ x. x x) y
   ```
3. Aplicamos `λ x. x x`:
   ```
   = y y
   ```

#### c) ¿Cuál estrategia es más eficiente en este caso?

En este caso, la estrategia **aplicativa** es más eficiente porque reduce directamente a la expresión `y y` sin necesidad de evaluar todo el argumento antes. **Sin embargo**, si bien el orden aplicativo es más eficiente en general, si la expresión tiene una forma normal, solo la estrategia normal puede encontrarla, por lo que la estrategia **normal** es la más adecuada para garantizar que se llegue a la forma normal de una expresión.
