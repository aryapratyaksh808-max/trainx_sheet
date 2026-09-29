class Solution {
    public static int countDigits(int n) {
        if(n==0) return 1;
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;
    }
}
public class Q12 {
     public static void main(String[] args){
          int n=00012;

          int x = Solution.countDigits(n);
          System.out.println(x);

     }    
}
