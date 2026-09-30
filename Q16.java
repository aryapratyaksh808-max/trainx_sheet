//Armstrong numbers
import java.util.*;
// Problem: Check karo ki har digit ki digit-count power ka sum original number ke barabar hai.
class ArmstrongNumberChecker {
    static boolean isArmstrongNumber(int number) {
        // Armstrong numbers non-negative hote hain; zero ko bhi valid input maante hain.
        if (number < 0) {
            return false;
        }

        int digitCount = number == 0 ? 1 : 0;
        for (int remaining = number; remaining > 0; remaining /= 10) {
            digitCount++;
        }

        long sum = 0;
        for (int remaining = number; remaining > 0; remaining /= 10) {
            sum += integerPower(remaining % 10, digitCount);
        }
        return sum == number;
    }

    private static long integerPower(int base, int exponent) {
        long result = 1;
        for (int power = 0; power < exponent; power++) {
            result *= base;
        }
        return result;
    }
}
public class Q16 {
    public static void main(String[] args) {
        // User se number lekar Armstrong status print karte hain.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(ArmstrongNumberChecker.isArmstrongNumber(scanner.nextInt()));
        }
    }
}
