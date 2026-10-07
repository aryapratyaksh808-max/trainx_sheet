     import java.util.*;



class Solution {

    public static boolean isSubsetBruteForce(int a[], int b[]) {

        if (a.length < b.length) {
            return false;
        }

        int count = 0;

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (b[i] == a[j]) {

                    count++;

                    // matched element ko remove/mark
                    a[j] = Integer.MIN_VALUE;

                    break;
                }
            }
        }

        if (count == b.length) {
            return true;
        }

        return false;
    }
  
}

public class ArraySubsetQ55{
     public static void main(String[] args){
          
          int a[] = {11, 1, 13, 21, 3, 7};
          int b[] = {11, 3, 7, 1};

     

          if (Solution.isSubsetBruteForce(a, b)) {
               System.out.println("Yes");
          } else {
               System.out.println("No");
          }

     }


}