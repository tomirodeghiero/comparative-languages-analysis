class Counter {
    private int countA; // contador de invocaciones de A

    public synchronized void A() {
        countA++; // Incrementa el contador en cada invocación de A
        notifyAll(); // Notifica a otros hilos que el estado ha cambiado
    }

    public synchronized int B() {
        return countA; // Retorna el valor actual del contador
    }
}

public class CounterExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Hilo que invoca al método A() para incrementar el contador
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.A();
                System.out.println("Incrementado por A(), valor actual: " + counter.B());
                try {
                    Thread.sleep(100); // Simula tiempo de trabajo
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Hilo que invoca al método B() para leer el valor del contador
        Thread readThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Leído por B(), valor actual: " + counter.B());
                try {
                    Thread.sleep(150); // Simula tiempo de trabajo
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Iniciar los hilos
        incrementThread.start();
        readThread.start();

        // Esperar a que ambos hilos terminen
        try {
            incrementThread.join();
            readThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Número final de invocaciones a A(): " + counter.B());
    }
}
