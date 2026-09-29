class Solution {
    static int sumOfDigits(int n) {
        // code here
        int sum = 0;
        int temp  =n;
        while(temp>0){
           int lastdigit = temp%10;
            temp = temp/10;
            sum = sum +lastdigit;
        
            
        }
        return sum;
    }
 

}

public class Q13 {
     public static void main(String[] args){
          int n=123123;
          int answer =Solution.sumOfDigits(n);
        
          System.out.println(answer);
     }
}
