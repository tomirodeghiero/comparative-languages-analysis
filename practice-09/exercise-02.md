En lenguajes como **Java** y **C++**, hablamos más de **invocaciones a métodos** (o procedimientos) que de **envío de mensajes** en el sentido estricto del paradigma orientado a objetos. Esto se debe a la forma en que estos lenguajes implementan la interacción entre objetos:

1. **Invocación de Métodos (Procedimientos)**: En Java y C++, cuando llamamos a un método de un objeto, estamos realizando una **invocación directa** de ese método en el contexto del objeto. La invocación se realiza utilizando el nombre del objeto y el nombre del método (`objeto.metodo()`), y el compilador resuelve cuál método ejecutar en tiempo de compilación o en tiempo de ejecución (en el caso de polimorfismo). Esta técnica es más cercana a una **llamada a procedimiento** que a un sistema de mensajes, ya que no existe una abstracción que permita enviar un "mensaje" a un objeto sin especificar el método exacto a invocar.

2. **Mensajes en OOP (Ejemplo en Smalltalk)**: En contraste, en lenguajes como **Smalltalk**, los objetos se comunican mediante el envío de **mensajes**. En este caso, el mensaje es una especie de solicitud general que el objeto receptor puede responder de diferentes maneras. Este enfoque es más abstracto y flexible, ya que los objetos pueden responder de forma diferente a los mismos mensajes, e incluso rechazar mensajes que no comprendan.

### Justificación

Entonces, en **Java y C++**, realmente no estamos "enviando mensajes" a los objetos en el sentido estricto del paradigma de objetos como en Smalltalk. En su lugar, estamos realizando invocaciones directas a métodos, que se comportan como **procedimientos o funciones asociadas a un objeto**. Esto se debe a la naturaleza de estos lenguajes, que priorizan la eficiencia y una resolución más estática en la invocación de métodos, a diferencia de lenguajes puramente orientados a objetos que permiten más flexibilidad en el manejo de mensajes.

En resumen:
- En **Java y C++**, lo que ocurre es una **invocación a un procedimiento o método** específico y no un envío de mensaje en el sentido puro de la OOP.
- La invocación directa facilita el uso de polimorfismo y sobrecarga, pero no permite la misma abstracción que el envío de mensajes en lenguajes como Smalltalk.
