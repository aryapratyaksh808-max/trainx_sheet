
import java.util.Scanner;


// Problem: Do integer values ko swap karke swapped values print karo.
public class Q5 {
    public static void main(String[] args) {
        // Temporary variable purani value ko swap ke dauran safe rakhta hai.
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            int temporary = first;
            first = second;
            second = temporary;

            System.out.println(first + " " + second);
        }
    }
}
