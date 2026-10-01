import java.util.Scanner;

// Problem: Do integer arrays input lo aur dono arrays ko alag-alag print karo.
public class Q47 {
     public static void main(String[] args) {
          // Pehle dono arrays ke sizes lekar unke liye storage banate hain.
          try (Scanner scanner = new Scanner(System.in)) {
               System.out.print("Enter number of elements in first array: ");
               int firstSize = scanner.nextInt();
               System.out.print("Enter number of elements in second array: ");
               int secondSize = scanner.nextInt();

               int[] firstArray = new int[firstSize];
               int[] secondArray = new int[secondSize];

               // Dono arrays ko independent loops mein read karne se indexes simple rehte hain.
               for (int index = 0; index < firstArray.length; index++) {
                    System.out.print("Enter first array element: ");
                    firstArray[index] = scanner.nextInt();
               }
               for (int index = 0; index < secondArray.length; index++) {
                    System.out.print("Enter second array element: ");
                    secondArray[index] = scanner.nextInt();
               }

               // Arrays ko alag lines par display karte hain.
               printArray("First array", firstArray);
               printArray("Second array", secondArray);
          }
     }

     private static void printArray(String label, int[] values) {
          System.out.print(label + ": ");
          for (int value : values) {
               System.out.print(value + " ");
          }
          System.out.println();
     }
}
     