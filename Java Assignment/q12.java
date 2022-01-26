import java.util.Scanner;

public class q12 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fl = 0;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        fl = 1;
        break;
      }
    }
    if (fl == 1)
      System.out.println("No " + n + " is not a prime");
    else
      System.out.println("Yes " + n + " is a prime");
  }
}
