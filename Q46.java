import java.util.*;

public class Q46 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter number of element in first array");
          int first = sc.nextInt();
          System.out.println("enter number of element in second array");
          int second = sc.nextInt();
          int[] arr1 = new int[first];
          int[] arr2 = new int[second];
          for (int i = 0, j = 0; i < first || j < second; i++, j++) {
               if (i < first) {

                    System.out.print("enter element of first array:");

                    arr1[i] = sc.nextInt();
               }
               if(j<second){
               System.out.print("enter second element : ");
               arr2[j] = sc.nextInt();
          }
          }
          for(int i=0;i<first;i++){
               System.out.print(arr1[i] +" ");
               
          }
          System.out.println();
          
          for(int j=0;j<second;j++){
               System.out.print("arr2 = "+arr2[j] +" ");
               
          }
          
     }
}
     