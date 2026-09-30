import java.util.Scanner;
// Problem: Gregorian calendar ke rules se leap year check karo.
class LeapYearChecker {
    static boolean isLeapYear(int year) {
        // 400 se divisible, ya 4 se divisible par 100 se nahi, toh leap year hai.
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
public class Q6 {
    public static void main(String[] args) {
       // Year lekar readable result print karte hain.
       try (Scanner scanner = new Scanner(System.in)) {
          int year = scanner.nextInt();
          System.out.println(LeapYearChecker.isLeapYear(year) ? "Yes, leap year" : "Not a leap year");
       }
   }  
}
