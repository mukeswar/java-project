import java.util.Scanner;

public class PrimeArray {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = in.nextInt();
    System.out.println("Enter The array Elements: ");
    int a[] = new int[size];
    for (int i = 0; i < size; i++) {
      a[i] = in.nextInt();
    }
    System.out.println("The aarray elements are: ");
    for (int i = 0; i < size; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println("\nPrime number in the array are: ");
    for (int i = 0; i < size; i++) {
      int count = 0;
      for (int j = 2; j < a[i] - 1; j++) {
        if (a[i] % j == 0) {
          count = count + 1;
        }
      }
      if (count == 0) {
        System.out.print(a[i] + " ");
      }
    }
    in.close();
  }
}
