import java.util.Scanner;

// Problem: Check karo ki array ko ulta karne par bhi elements ka order same rehta hai ya nahi.
class ArrayPalindromeChecker {
    static boolean isPalindrome(int[] values) {
        // Outer pair compare karke har step par center ki taraf move karte hain.
        int left = 0;
        int right = values.length - 1;
        while (left < right) {
            if (values[left] != values[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class Q51 {
    public static void main(String[] args) {
        // Array size aur elements input lekar palindrome result print karte hain.
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt();
            int[] values = new int[size];
            for (int index = 0; index < size; index++) {
                values[index] = scanner.nextInt();
            }
            System.out.println(ArrayPalindromeChecker.isPalindrome(values));
        }
    }
}
