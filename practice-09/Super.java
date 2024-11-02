class Abuelo {
  public void quienSoy() {
    System.out.println(this.yoSoy());
  }

  /*
   * final public String yoSoy() {
   * return "soy el abuelo";
   * }
   */

  public String yoSoy() {
    return "soy el abuelo";
  }
}

class Padre extends Abuelo {
  public String yoSoy() {
    return "soy el padre";
  }
}

class Hijo extends Padre {
  public String yoSoy() {
    System.out.println("quien es super: " + super.yoSoy());
    return "soy el hijo";
  }
}

class TestSuper {
  public static void main(String[] args) {
    Padre a = new Hijo();
    a.quienSoy();

    Hijo h = new Hijo();
    h.quienSoy();

    Padre b = new Padre();
    a = b;
    a.quienSoy();
  }
}
