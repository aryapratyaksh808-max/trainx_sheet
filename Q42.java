import java.util.*;

class Solution {
    public static int getSecondLargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        if (arr[n - 2] != arr[n - 1]) {
            return arr[n - 2];
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }

        return -1;
    }
}
public class Q42 {
     public static void main(String[] args){
          int[] arr  = {2,2,3,12,4,2,35,23,3,52,52};
          int n= Solution.getSecondLargest(arr);
          System.out.println(n);
     }
}
