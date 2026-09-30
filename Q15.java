class Solution {
    public static int gcd(int a, int b) {
        return b==0?a:gcd(a%b,a);
    }

    public static int findGCD(int[] nums) {
        int smaller = 1233;
        int larger = 1;

        for (int num : nums) {
            if (smaller >= num) {
                smaller = num;
            }

            if (larger <= num) {
                larger = num;
            }
        }

        return gcd(smaller,larger);
    }
}
public class Q15 {
     public static void main(String[] args){
          int[] nums  = {1,2,3,4,5,6};
          int result = Solution.findGCD(nums);
          System.out.println(result);
     }
     
}
