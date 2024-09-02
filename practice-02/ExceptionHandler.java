public class ExceptionHandler {
  public static void main(String[] args) {
    try {
      int result = divide(10, 0);
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: Cannot divide by zero. " + e.getMessage());
    } finally {
      System.out.println("The 'finally' block always executes.");
    }
  }

  public static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }
}
