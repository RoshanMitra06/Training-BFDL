import java.util.Scanner;

public class q13 {
  public static boolean check_prime(int n) {
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    for (int i = 2; i <= 100; i++) {
      if (check_prime(i))
        System.out.print(i + " ");
    }
  }
}
