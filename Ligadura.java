class A {
  void f(A x) {
    System.out.println("Soy A desde A");
  }
}

class B extends A {
}

class C extends B {
  void f(A x) {
    System.out.println("Soy A desde C");
  }
}

class D extends C {
  void f(B x) {
    System.out.println("Soy D-B");
  }

  void f(C x) {
    System.out.println("Soy D-C y ");
    x.f(this);
  }
}

public class Ligadura {
  public static void main(String[] args) {
    D d = new D();
    C c = new C();
    A a = c;

    d.f(c); // Llamada 1
    d.f((B) a); // Llamada 2
    a.f(c); // Llamada 3
  }
}
