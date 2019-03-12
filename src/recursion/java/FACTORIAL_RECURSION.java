package recursion.java;
/*12) Factorial*/
import java.util.Scanner;
public class FACTORIAL_RECURSION{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println(Factorial(8));
    }
  public static int Factorial(int n){
    if(n==0){
      return 1;
      }else{
        return n*Factorial(n-1);
      }
  }
}