import java.util.Scanner;
// Problem: Diye gaye integer ka last digit print karo; negative sign count nahi hota.
public class Q3 {
  public static void main(String[] args) {
    // Remainder par abs lagane se MIN_VALUE ke liye bhi overflow nahi hota.
    try (Scanner scanner = new Scanner(System.in)) {
      int number = scanner.nextInt();
      System.out.println(Math.abs(number % 10));
    }
  }
}
