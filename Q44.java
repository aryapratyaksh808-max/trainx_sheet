class Solution{
     public static int minDistEven(int arr[] ){
         int firsteven = -1, lasteven = -1;
         int min = Integer.MAX_VALUE;
         for(int i=0;i<arr.length;i++){
               if(arr[i] % 2 == 0){
                    if(firsteven == -1) firsteven = i;
                    else{
                         lasteven = i;
                         min = Math.min(min, Math.abs(lasteven - firsteven));
                         firsteven = lasteven;
                    }
               }
         }
         return min;
     }
}
public class Q44 {
     public static void main(String[] args){
          int arr[] = {1, 2, 3, 2, 1, 4, 5, 6, 4, 5};
          System.out.println(Solution.minDistEven(arr));
     }
}
