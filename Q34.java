class Solution {
    static long fact(int n){
        if(n==0||n==1){
            return 1;
        }
        
        return n*fact(n-1);
    }
    public static long nPr(int n, int r) {
        // code here
        long npr = fact(n)/fact(n-r);
        return npr;
        
        
    }
}
public class Q34 {
 public static void main(String[] args){
     long x = Solution.nPr(12,4);
     System.out.println(x);
 }    
}
