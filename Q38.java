class Solution {
    public static int search(int arr[], int x) {
        // code here
        for(int i =0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}

public class Q38 {
     public static void main(String[] args){
          int[] arr = {12,3,12,4,3,12,4,6,223,4};
          int x = 3;
          int result = Solution.search(arr,x);
          System.out.print(result);
     }
}
