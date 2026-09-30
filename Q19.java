class Solution{
     public static int IntiSquareRoot(int n){
          int count =0;
          for(int i=1;i<=n;i++){
               int root = (int)Math.sqrt(i);
               if(root*root == i){
                    count++;

               }
          }
          return count;
     }
}
public class Q19 {
     public static void main(String[] args){
          int n =12;
          int result = Solution.IntiSquareRoot(n);
          System.out.println(result);
     }
}
