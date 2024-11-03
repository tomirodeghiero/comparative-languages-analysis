### Ejercicio 7

Analizamos cada llamada en `main` para ver el resultado esperado.

```java
public class Ejercicio7 {
    public static void main(String[] args) {
        A2 a = new A2();
        A2 b2 = new B();
        B b3 = new B();

        System.out.println(a.m2(b3));       // (1)
        System.out.println(b2.m2(b2));      // (2)
        System.out.println(b3.m2((B) b2));  // (3)
        System.out.println(b3.m2(a));       // (4)
    }
}
```

#### Explicación y Resultados

1. **`a.m2(b3)`**
   - `a` es de tipo `A2`, por lo que se invoca el método `m2` en `A2` con `A2 x`.
   - El método `m2` en `A2` retorna: `"Paso por A - m2(A2) " + this.m1(x)`.
   - `this.m1(x)` llama a `m1` de `A2`, que retorna `"AA2"`.
   - **Salida esperada**: `"Paso por A - m2(A2) AA2"`.

2. **`b2.m2(b2)`**
   - `b2` es de tipo `A2`, pero la instancia es de `B`, por lo que se usa el método `m2` en `B` debido a **dynamic dispatching**.
   - Llama al método `m2(A2 x)` en `B`, que retorna: `"Paso por B - m2(A2) " + this.m1(this)`.
   - `this.m1(this)` llama a `m1(B x)` en `B`, que retorna `"BA2"`.
   - **Salida esperada**: `"Paso por B - m2(A2) BA2"`.

3. **`b3.m2((B) b2)`**
   - `b3` es de tipo `B`, por lo que se invoca el método `m2(B x)` en `B`.
   - El método `m2(B x)` retorna: `"Paso por B - m2(B) " + this.m1(x)`.
   - `this.m1(x)` llama a `m1(B x)` en `B`, que retorna `"BA2"`.
   - **Salida esperada**: `"Paso por B - m2(B) BA2"`.

4. **`b3.m2(a)`**
   - `b3` es de tipo `B`, y `a` es de tipo `A2`, por lo que se invoca el método `m2(A2 x)` en `B`.
   - El método `m2(A2 x)` en `B` retorna: `"Paso por B - m2(A2) " + this.m1(this)`.
   - `this.m1(this)` llama a `m1(B x)` en `B`, que retorna `"BA2"`.
   - **Salida esperada**: `"Paso por B - m2(A2) BA2"`.

---

### Resumen de Resultados Esperados

**Ejercicio 7**:
1. `"Paso por A - m2(A2) AA2"`
2. `"Paso por B - m2(A2) BA2"`
3. `"Paso por B - m2(B) BA2"`
4. `"Paso por B - m2(A2) BA2"`
