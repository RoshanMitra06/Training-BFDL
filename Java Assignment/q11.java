import java.util.Scanner;

public class q11 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 1;
    if (n == 0 || n == 1)
      System.out.println("factorial of " + n + " is: " + ans);
    else {
      for (int i = 1; i <= n; i++) {
        ans = ans * i;
      }
      System.out.println("factorial of " + n + " is: " + ans);
    }
  }
}
