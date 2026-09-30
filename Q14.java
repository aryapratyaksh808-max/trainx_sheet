class Solution {
    public static boolean isPalindrome(int n) {
        if(n<0) n = -n;
        if(n%10 == n) return true;
        // code here
        int rev = 0;
        int temp = n;
        while(temp<0)
        {
            int last  = temp%10;
            temp = temp/10;
            rev  = rev *10 +last;
        }
        
        if(rev == temp){
            return true;
        }
       return false;
    }
}
public class Q14 {
     public static void main(String[] args){
          bool s = Solution.isPalindrome(-8778);
          
     }
}
