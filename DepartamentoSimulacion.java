class Semaforo {
  private int valor;

  // init(s, n): inicializa el semáforo con el valor n
  public Semaforo(int n) {
    this.valor = n;
  }

  // P(s): intenta decrementar en uno el valor del semáforo
  // Si el valor es positivo, decrementa y continúa
  // Si el valor es 0, el hilo espera hasta que otro hilo lo desbloquee
  public synchronized void P() throws InterruptedException {
    while (valor == 0) {
      wait(); // Bloquea el hilo hasta que el valor sea mayor a 0
    }
    valor--; // Decrementa el valor del semáforo
  }

  // V(s): incrementa en uno el valor del semáforo
  // Si hay hilos bloqueados esperando en P(), desbloquea uno
  public synchronized void V() {
    valor++; // Incrementa el valor del semáforo
    notify(); // Desbloquea a un hilo en espera (si lo hay)
  }
}

class Bano {
  private final int capacidadMaxima;
  private int cantidadPersonas = 0;
  private String generoActual = null; // Puede ser "Hombre" o "Mujer"
  private final Semaforo semaforoEntrada; // Controla el número máximo de personas

  public Bano(int capacidadMaxima) {
    this.capacidadMaxima = capacidadMaxima;
    this.semaforoEntrada = new Semaforo(capacidadMaxima); // Inicializa el semáforo con el límite de capacidad
  }

  // Método para que una persona intente entrar al baño
  public synchronized void entrar(String genero) throws InterruptedException {
    while ((generoActual != null && !generoActual.equals(genero)) || cantidadPersonas >= capacidadMaxima) {
      wait(); // Espera hasta que el baño esté disponible para el mismo género o tenga espacio
    }

    if (generoActual == null) {
      generoActual = genero; // Establece el género actual si está vacío
    }

    cantidadPersonas++;
    semaforoEntrada.P(); // Reduce el permiso en el semáforo
    System.out.println(genero + " entra al baño. Personas en el baño: " + cantidadPersonas);
  }

  // Método para que una persona salga del baño
  public synchronized void salir(String genero) {
    cantidadPersonas--;
    System.out.println(genero + " sale del baño. Personas en el baño: " + cantidadPersonas);

    if (cantidadPersonas == 0) {
      generoActual = null; // Si ya no hay personas, libera el baño para otro género
    }

    semaforoEntrada.V(); // Aumenta el permiso en el semáforo
    notifyAll(); // Notifica a otros hilos que el baño está disponible
  }
}

class Persona extends Thread {
  private final String genero;
  private final Bano bano;

  public Persona(String genero, Bano bano) {
    this.genero = genero;
    this.bano = bano;
  }

  @Override
  public void run() {
    try {
      bano.entrar(genero);
      // Simula el uso del baño
      System.out.println(genero + " está usando el baño...");
      Thread.sleep((long) (Math.random() * 1000)); // Simula el tiempo de uso del baño
      bano.salir(genero);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

public class DepartamentoSimulacion {
  public static void main(String[] args) {
    int capacidadMaxima = 3; // Ejemplo de capacidad del baño
    Bano bano = new Bano(capacidadMaxima);

    // Crear y ejecutar varios hilos de personas
    for (int i = 0; i < 10; i++) {
      String genero = (i % 2 == 0) ? "Hombre" : "Mujer";
      Persona persona = new Persona(genero, bano);
      persona.start();
    }
  }
}
