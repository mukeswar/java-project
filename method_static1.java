//method overloading
class demo {
  static int x = 100;

  static void display() {
    System.out.println(x);
  }
}

class method_static1 {
  public static void main(String ar[]) {
    // demo d = new demo();
    // d.display();
    demo.display();
  }
}