//Armstrong numbers
import java.util.*;
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        double arm = 0;
        int t =n;
        while(t>0){
            double lastdigit = t%10;
            arm = arm +Math.pow(lastdigit,3);
            t = t/10;
        }   
       return arm ==n;
    }
}
public class Q16 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n= sc.nextInt();
          boolean x = Solution.armstrongNumber(n);
          System.out.println(x);
     }    
}
