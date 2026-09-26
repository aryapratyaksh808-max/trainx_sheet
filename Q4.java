import java.util.*;
class Solution {
    static boolean isEven(int n) {
        // code here
        if(n%2 ==0){
            return true;
               
        }
        else {
            return false;
        }
    }
}
public class Q4 {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          Solution ss = new Solution();
          boolean answer = ss.isEven(n);
          System.out.println(answer);

     }
     
}
