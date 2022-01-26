import java.util.Scanner;

public class q9 {
  public static void swap(int a, int b, int[] arr) {
    arr[a] = arr[a] + arr[b];
    arr[b] = arr[a] - arr[b];
    arr[a] = arr[a] - arr[b];
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    for (int i = 0; i < n / 2; i++) {
      swap(i, n - i - 1, arr);
    }
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
  }
}
