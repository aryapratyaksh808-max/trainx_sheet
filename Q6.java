import java.util.*;
class Solution {
    static boolean checkYear(int n) {
        // code here
    
     if(n%400 == 0 || n%4 ==0 && n%100!=0){
         return true;
     }
     else{
         return false;
     }
    }
}
public class Q6 {
   public static void main(String[] args){
     Scanner sc  = new Scanner(System.in);
     int n= sc.nextInt();
     
     if(Solution.checkYear(n)){
          System.out.print("Yes leap");
     }
     else {
          System.out.println("Not leap");
     }
   }  
}
