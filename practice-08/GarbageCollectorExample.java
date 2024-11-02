public class GarbageCollectorExample {

  private static int objectCount = 0;

  public GarbageCollectorExample() {
    objectCount++;
  }

  @Override
  protected void finalize() throws Throwable {
    try {
      System.out.println("Finalizando objeto: " + this);
    } finally {
      super.finalize();
    }
  }

  public static void main(String[] args) {
    try {
      while (true) {
        new GarbageCollectorExample();
        System.gc();
        System.runFinalization();
      }
    } catch (OutOfMemoryError e) {
      System.out.println("Se alcanzó el límite de memoria.");
    } finally {
      System.out.println("Cantidad total de objetos creados: " + objectCount);
      System.out.println("Esperando la finalización de todos los objetos...");
    }

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Todos los objetos finalizaron.");
  }
}
