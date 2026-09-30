class Solution {
    public static int convertFive(int n) {
    if (n ==0 ) return 5;
    int ans  =0;
    int place =1;
    while(n>0){
        int digit  = n%10;
        if(digit ==0){
            digit = 5;
            
        }
        ans = ans +digit*place;
        place *= 10;
        n/=10;
    }
        return ans;
    }
}
public class Q35 {
     public static void main(String[] args){
          int x = Solution.convertFive(10000000);
          System.out.println(x);   
     }
}
