public class ParametrosVariables9 {

  // Método con un número variable de parámetros enteros
  public static int sumar(int... numeros) {
    int suma = 0;
    for (int num : numeros) {
      suma += num;
    }
    return suma;
  }

  public static void main(String[] args) {
    System.out.println(sumar(1, 2, 3)); // Imprime 6
    System.out.println(sumar(10, 20)); // Imprime 30
    System.out.println(sumar(5, 10, 15, 20)); // Imprime 50
  }
}
