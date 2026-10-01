class Solution {
    public static int[] countOddEven(int[] arr) {
        int even = 0;
        int odd = 0;
        // Code here
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                even ++;
                
                
            }
            else {
                odd++;
            }
        }
        return new int[] {odd,even};
    }
}
public class Q40 {
     public static void main(String[] args){
          int[] arr = {233,23,32,21,2,4,5,3,2,3,55,23};
          int[] ans = Solution.countOddEven(arr);
          System.out.println(ans[0]+"   "+ans[1]);

     }    
}
