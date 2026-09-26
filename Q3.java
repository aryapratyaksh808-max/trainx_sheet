import java.util.*;
public class Q3 {
     public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int lastDigit;
     if(n>=0){
     lastDigit = n%10;}
    else{
        lastDigit = (-n)%10; 
    }
   System.out.print(lastDigit);
      


     }
}
