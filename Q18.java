
class Solution {
    public static long sumOfCubes(int n) {
        // code here
         return n*n*(n+1)*(n+1)/4;
        
    }
    public static long sumOfSquare(int n){
     return n*(n+1)*(2*n+1)/6;
    }
    public static long sumOfNaturalNumber(int n){
     return n*(n+1)/2;
    }

}
public class Q18 {
     public static void main(String[] args){
          int n=10;
          long x = Solution.sumOfCubes(n);
          System.out.println(x);
          long y = Solution.sumOfSquare(n);
          System.out.println(y);
          long z = Solution.sumOfNaturalNumber(n);
          System.out.println(z);

     }     
}
