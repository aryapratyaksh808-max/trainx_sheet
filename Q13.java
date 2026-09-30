import java.util.Scanner;

// Problem: Integer ke sabhi decimal digits ka sum calculate karo.
class DigitSummer {
    static int sumOfDigits(int number) {
        // Long absolute value negative numbers aur MIN_VALUE ko safely handle karti hai.
        long remaining = Math.abs((long) number);
        int sum = 0;
        while (remaining > 0) {
            sum += remaining % 10;
            remaining /= 10;
        }
        return sum;
    }
}

public class Q13 {
    public static void main(String[] args) {
        // Zero ka digit sum bhi zero hota hai; helper us case ko naturally handle karta hai.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(DigitSummer.sumOfDigits(scanner.nextInt()));
        }
    }
}
