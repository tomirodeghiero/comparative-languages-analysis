class Animal {
  void sound() {
    System.out.println("Some sound");
  }
}

class Dog extends Animal {
  @Override
  void sound() {
    System.out.println("Bark");
  }
}

public class ejercicio4_java {
  public static void main(String[] args) {
    Animal myAnimal = new Dog(); // La referencia es de tipo Animal, pero el objeto es de tipo Dog
    myAnimal.sound(); // Llama al método `sound` de `Dog` (dynamic dispatching)
  }
}
