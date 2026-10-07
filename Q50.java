class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
     int i=0,j=arr.length-1;
       while(i<j){
            if(arr[i]!=arr[j]){
                return false;
                
            }
            i++;
            j--;    
        }
        return true;
    }
}

public class Q50 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1,2};
        System.out.println(Solution.isPalindrome(arr));
    }
}
