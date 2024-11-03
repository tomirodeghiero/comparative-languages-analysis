class A2 {
  String m1(A2 x) {
    return "AA2";
  }

  String m2(A2 x) {
    return "Paso por A - m2(A2) " + this.m1(x);
  }
}

class B extends A2 {
  String m1(B x) {
    return "BA2";
  }

  String m2(B x) {
    return "Paso por B - m2(B) " + this.m1(x);
  }

  String m2(A2 x) {
    return "Paso por B - m2(A2) " + this.m1(this);
  }
}

public class Ejercicio7 {
  public static void main(String[] args) {
    A2 a = new A2();
    A2 b2 = new B();
    B b3 = new B();

    System.out.println(a.m2(b3)); // (1)
    System.out.println(b2.m2(b2)); // (2)
    System.out.println(b3.m2((B) b2)); // (3)
    System.out.println(b3.m2(a)); // (4)
  }
}
