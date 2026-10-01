class Solution{
     public static int indexOflargest(int arr[]){
          int largest = Integer.MIN_VALUE;
          int index = -1;
          for(int i=0;i<arr.length;i++){
               if(arr[i]>largest){
                    largest = arr[i];
                    index = i;
               }
          }
          return index;  
          
     }
}
public class Q46 {
     public static void main(String[] args) {
          int arr[] = {1, 2, 3, 2, 1, 4, 5, 6, 4, 5};
          int x = Solution.indexOflargest(arr);
          System.out.print("Index of largest element is: " + x);
     }     
}
