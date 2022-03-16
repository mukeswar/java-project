
class demo {
  void display(int x) {
    System.out.println(x + x);
  }

  void display(float y) {
    System.out.println(y + y);
  }

  void display(int p, int q) {
    System.out.println(p + q);
  }
}

class method_over {
  public static void main(String[] args) {
    float val1 = 56.4f;
    demo d = new demo();
    d.display(100);
    d.display(val1);
    d.display(200, 300);
  }
}