//constructor overloading
class demo {
  int x, y;

  demo() {
    x = 900;
    y = 2000;
  }

  demo(int a) {
    x = a;
    y = a;
  }

  demo(int p, int q) {
    x = p;
    y = q;
  }

  void sum() {
    System.out.println("Sum is : " + (x + y));
  }
}

class cons_over {
  public static void main(String ar[]) {
    demo d = new demo(); // calling default constructor
    d.sum(); // 2900
    demo d1 = new demo(500);
    d1.sum(); // 1000
    demo d2 = new demo(56, 92);
    d2.sum();

  }
}