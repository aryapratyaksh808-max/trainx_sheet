import java.util.*;
class Solution {
   static double sumOfSeries(int n) {
        // code here
         return n*n*(n+1)*(n+1)/4;
        
    }
}
public class Q9 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n= sc.nextInt();
          double x = Solution.sumOfSeries(n);
          System.out.println("sum iss "+x);
     }
}
