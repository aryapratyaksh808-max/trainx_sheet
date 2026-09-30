class Solution {
    public static boolean isPower(int x, int y) {
        for(int i=0;i<=29;i++){
            if(Math.pow(x,i) == y){
                    System.out.println(i);
                return true;
               
            }
        }
        return false;
        
    }
}
public class Q20 {
     public static void main(String[] args){

          boolean x= Solution.isPower(2,10);
          System.out.println(x);
     }
     
}
