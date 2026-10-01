import java.util.*;
class Solution {
    public static int largest(int[] arr) {
        // code here
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}

public class Q39 {
     public static void main(String[] args){
          int[] arr= {12,3,21,2,4,5,2,342,3,2,12,32,600};
          int result = Solution.largest(arr);
          System.out.println(result);

     }     
}
