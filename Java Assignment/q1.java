import java.util.Scanner;

public class q1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a % 2 != 0)
      System.out.println("Its an odd number");
    else
      System.out.println("Its an even number");
  }
}