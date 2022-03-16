//method overloading
class demo {
  static int x = 100;

  static void display() {
    x = 500;
    System.out.println(x);
  }
}

class method_static {
  public static void main(String ar[]) {
    // demo d = new demo();
    // d.display();
    demo.display();
  }
}
