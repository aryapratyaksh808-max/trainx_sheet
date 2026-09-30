// Problem: Check karo ki number ulta padhne par bhi wahi rehta hai ya nahi.
class NumberPalindromeChecker {
    static boolean isPalindrome(int number) {
        // Negative numbers palindrome nahi maane jaate; zero palindrome hai.
        if (number < 0) {
            return false;
        }

        int original = number;
        long reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return original == reversed;
    }
}
public class Q14 {
    public static void main(String[] args) {
        // Sample result ko print karte hain, taaki palindrome check visibly verify ho.
        int number = 8778;
        System.out.println(NumberPalindromeChecker.isPalindrome(number));
    }
}
