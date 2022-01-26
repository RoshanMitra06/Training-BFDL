import java.util.Scanner;

public class q7 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 2, sum = 0;
    if (a < 2)
      System.out.println(sum);
    else {
      while (a <= n) {
        sum += a;
        a += 2;
      }
      System.out.println("Sum is: " + sum);
    }
  }
}
