import java.util.Scanner;
import java.io.*;

public class q3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int max = Math.max(a, Math.max(b, c));
    System.out.println("Maximum of " + a + " " + b + " " + c + " is: " + max);
  }

}