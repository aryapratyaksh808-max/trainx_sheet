class Solution {
    static double cToF(int C) {
        // code here
        double f = (C * 9 / 5) + 32;
        return f;
        
    }
    
}

public class Q2 {
   

     
     public static void main(String[] args){
            Solution sc = new Solution();
            double f = sc.cToF(41);
            System.out.println("F = "+ f);
     }
}   