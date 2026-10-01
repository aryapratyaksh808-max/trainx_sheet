// for in absolute substraction put arr1 first and arr2 next and in other case for absolute substraction put arr2 first or arr1 whatever you want but answer will be always positive among the two numbers...
class Solution{
     public static int[] substraction(int[] arr1,int[] arr2){
          int[] result = new int[Math.max(arr1.length,arr2.length)];
          for(int i=0;i<result.length;i++){
               // if(arr1[i]>=arr2[i]){
               //      result[i] = arr1[i]-arr2[i];
               // }
               // else{
               //      result[i] = arr2[i]-arr1[i];
               // }
               result[i] = arr1[i]-arr2[i];
          }
          return result;
     }
     public static int[] AbsoluteSubstraction(int[] arr1,int[] arr2){
          int[] result = new int[Math.max(arr1.length,arr2.length)];
          for(int i=0;i<result.length;i++){
               if(arr1[i]>=arr2[i]){
                    result[i] = arr1[i]-arr2[i];
               }
               else{
                    result[i] = arr2[i]-arr1[i];
               }
               
          }
          return result;
     }
}
public class Q48 {
     public static void main(String[] args){
     int[] arr1 = {5, 10, 15};
     int[] arr2 = {3, 12, 8};
     int[] result = Solution.AbsoluteSubstraction(arr1, arr2);
     System.out.print("Result: ");
     for(int i=0;i<result.length;i++){
          System.out.print(result[i] + " ");
     }
     }
}
