import java.util.Scanner;
// Problem: Check karo ki diya gaya integer even hai ya odd.
class ParityChecker {
    static boolean isEven(int number) {
        // Even number ko 2 se divide karne par remainder zero hota hai.
        return number % 2 == 0;
    }
}
public class Q4 {
    public static void main(String[] args) {
        // Input lekar parity ka boolean result print karte hain.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(ParityChecker.isEven(scanner.nextInt()));
        }
    }
}
