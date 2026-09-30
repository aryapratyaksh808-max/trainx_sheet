// Problem: Integer ke digits reverse karo; overflow hone par 0 return karo.
class IntegerReverser {
    public static int reverse(int number) {
        int reversed = 0;

        // Har iteration mein last digit nikaal kar reversed number mein jodte hain.
        while (number != 0) {
            int digit = number % 10;
            number /= 10;

            // Check overflow before multiplying by 10
            if (reversed > Integer.MAX_VALUE / 10 ||
                (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (reversed < Integer.MIN_VALUE / 10 ||
                (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }
}
public class Q11 {
    public static void main(String[] args) {
        int number = 121212;
        System.out.println(IntegerReverser.reverse(number));
    }
}
