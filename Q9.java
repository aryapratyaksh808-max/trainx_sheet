import java.math.BigInteger;
import java.util.Scanner;
// Problem: Pehle n natural numbers ke cubes ka sum n^3 + ... + 1^3 nikalo.
class SumOfCubes {
     static BigInteger calculate(int n) {
          // Formula n^2 * (n + 1)^2 / 4 hai; BigInteger large input par overflow rokta hai.
          BigInteger count = BigInteger.valueOf(n);
          BigInteger nextCount = count.add(BigInteger.ONE);
          return count.multiply(count)
                    .multiply(nextCount)
                    .multiply(nextCount)
                    .divide(BigInteger.valueOf(4));
     }
}
public class Q9 {
     public static void main(String[] args) {
          // Yeh formula non-negative n ke liye define hai.
          try (Scanner scanner = new Scanner(System.in)) {
               int n = scanner.nextInt();
               if (n < 0) {
                    throw new IllegalArgumentException("n must be non-negative");
               }
               System.out.println("Sum of cubes = " + SumOfCubes.calculate(n));
          }
}
