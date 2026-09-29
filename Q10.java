
class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i ==0 ){
                return false;
            }
        }
        return true;
    }
}
public class Q10 {
     public static void main(String[] args){
          int n= 13;
          if(Solution.isPrime(n)){
               System.out.println("yes");
          }
          else{
               System.out.println("No");
          }

     }
}
