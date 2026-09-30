// Problem: Array ke minimum aur maximum elements ka GCD return karo.
class ArrayGcdFinder {
    private static long gcd(long first, long second) {
        // Euclidean algorithm remainders se common divisor ko jaldi reduce karta hai.
        while (second != 0) {
            long remainder = first % second;
            first = second;
            second = remainder;
        }
        return first;
    }

    static long findGCD(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int minimum = numbers[0];
        int maximum = numbers[0];
        for (int number : numbers) {
            minimum = Math.min(minimum, number);
            maximum = Math.max(maximum, number);
        }

        // long absolute values avoid overflow if an element is Integer.MIN_VALUE.
        return gcd(Math.abs((long) minimum), Math.abs((long) maximum));
    }
}
public class Q15 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(ArrayGcdFinder.findGCD(numbers));
    }
     
}
