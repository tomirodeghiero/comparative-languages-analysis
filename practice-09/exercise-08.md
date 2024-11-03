### Ejercicio 8

Vamos a analizar las llamadas en `main` en el contexto de `A`, `B` y `C`.

```java
public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.type(b);       // (1)
        b.type(a);       // (2)
        b.type(b);       // (3)
        c.type(b);       // (4)
        c.type((A) c);   // (5)
        c.type((C) c);   // (6)
    }
}
```

#### Explicación y Resultados

1. **`a.type(b)`**
   - `a` es de tipo `A`, por lo que se llama a `type(A a)` en `A`.
   - Dentro de `type(A a)`, se llama a `a.type()`.
   - `a` es de tipo `B`, por lo que se invoca `type()` en `B`, que imprime `"Soy B"`.
   - **Salida esperada**: `"Soy B"`.

2. **`b.type(a)`**
   - `b` es de tipo `B`, pero no tiene un método `type(A a)`, así que llama a `type()` en `A`.
   - `a` es de tipo `A`, por lo que se invoca `type()` en `A`, que imprime `"Soy A"`.
   - **Salida esperada**: `"Soy A"`.

3. **`b.type(b)`**
   - `b` es de tipo `B` y tiene el método `type()`, por lo que se invoca `type()` en `B`.
   - Esto imprime `"Soy B"`.
   - **Salida esperada**: `"Soy B"`.

4. **`c.type(b)`**
   - `c` es de tipo `C`, y tiene un método `type(B b)`, por lo que se invoca `type(B b)` en `C`.
   - Dentro de `type(B b)`, se llama a `b.type()`.
   - `b` es de tipo `B`, por lo que se invoca `type()` en `B`, que imprime `"Soy B"`.
   - **Salida esperada**: `"Soy B"`.

5. **`c.type((A) c)`**
   - `c` es de tipo `C`, y al hacer `type((A) c)`, el método `type(A a)` de `A` se llama.
   - Dentro de `type(A a)`, se llama a `a.type()`.
   - `a` es de tipo `C`, por lo que se invoca `type()` en `C`, que imprime `"Soy C"`.
   - **Salida esperada**: `"Soy C"`.

6. **`c.type((C) c)`**
   - `c` es de tipo `C` y tiene un método `type()`, así que llama a `type()` en `C`.
   - Esto imprime `"Soy C"`.
   - **Salida esperada**: `"Soy C"`.

---

### Resumen de Resultados Esperados

**Ejercicio 8**:
1. `"Soy B"`
2. `"Soy A"`
3. `"Soy B"`
4. `"Soy B"`
5. `"Soy C"`
6. `"Soy C"`
