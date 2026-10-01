class Solution{
     static int minDist(int arr[] , int x, int y){
          if(x==y) return 0;
          int lastX = -1,lastY = -1;
          int min = Integer.MAX_VALUE;
          for(int i=0;i<arr.length;i++){
               if(arr[i] ==x) lastX =i;
               if(arr[i] == y) lastY = i;

               if(lastX != -1 && lastY != -1){
                    min = Math.min(min, Math.abs(lastX - lastY));
               }
          }
          return min;
     } 
}
public class Q43 {
     public static void main(String[] args) {
          int arr[] = {1, 2, 3, 2, 1, 4, 5, 6, 4, 5};
          int x = 2;
          int y = 4;
          System.out.println(Solution.minDist(arr,x,y));
     }
}
