class A {
  public void type() {
    System.out.println("Soy A");
  }

  public void type(A a) {
    a.type();
  }
}

class B extends A {
  public void type() {
    System.out.println("Soy B");
  }
}

class C extends B {
  public void type() {
    System.out.println("Soy C");
  }

  public void type(B b) {
    b.type();
  }
}

public class Test08 {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();

    a.type(b);
    b.type(a);
    b.type(b);
    c.type(b);
    c.type((A) c);
    c.type((C) c);
  }
}
