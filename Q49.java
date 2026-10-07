class Solution{
     public static int NumSmallerThenX(int[] arr, int X){
          int count = 0;
          for(int ar : arr){
               if(ar<X){
                    count++;
               }
          }
          return count;
     }
}
public class Q49 {
     public static void main(String[] args){
          int[] arr = {2,2,3,12,4,2,35,23,3,52,52};
          int X = 10;
          int result = Solution.NumSmallerThenX(arr, X);
          System.out.println("Number of elements smaller than " + X + ": " + result);
     }
}
