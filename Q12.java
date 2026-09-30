import java.util.Scanner;

// Problem: Diye gaye integer mein total decimal digits count karo.
class DigitCounter {
    public static int countDigits(int number) {
        // Long conversion Integer.MIN_VALUE ka absolute value safely handle karti hai.
        long remaining = Math.abs((long) number);
        int count = 0;
        do {
            remaining /= 10;
            count++;
        } while (remaining > 0);
        return count;
    }
}
public class Q12 {
    public static void main(String[] args) {
        // Runtime input se leading-zero confusion aur hard-coded example hat jata hai.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(DigitCounter.countDigits(scanner.nextInt()));
        }
}
