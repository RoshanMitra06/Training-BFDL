import java.util.Scanner;

public class q4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
    System.out.println("Using If else:");
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
      System.out.println(c + " is a vowel");
    else
      System.out.println(c + " is a consonant");

    System.out.println("Using switch-case:");

    switch (c) {
      case 'a':
        System.out.println(c + " is a vowel");
        break;
      case 'e':
        System.out.println(c + " is a vowel");
        break;
      case 'i':
        System.out.println(c + " is a vowel");
        break;
      case 'o':
        System.out.println(c + " is a vowel");
        break;
      case 'u':
        System.out.println(c + " is a vowel");
        break;
      default:
        System.out.println(c + " is a consonant");
        break;
    }
  }
}
