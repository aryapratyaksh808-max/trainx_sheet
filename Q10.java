
import java.util.Scanner;

// Problem: Check karo ki integer prime hai ya nahi; prime ke exactly do positive divisors hote hain.
class PrimeChecker {
    static boolean isPrime(int number) {
        // 2 se chhote numbers prime nahi; sqrt(n) tak divisors check karna enough hai.
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
}
public class Q10 {
    public static void main(String[] args) {
       // Input value ka prime status print karte hain.
       try (Scanner scanner = new Scanner(System.in)) {
          int number = scanner.nextInt();
          System.out.println(PrimeChecker.isPrime(number) ? "Yes" : "No");
       }
}
