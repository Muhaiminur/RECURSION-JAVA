package recursion.java;
/*13) Fibonacci*/
import java.util.Scanner;
public class FIBONACCI_RECURSION{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int c=0;
    while(c<=10){
      System.out.print(Fibonacci(c)+" ");
      c++;
    }
    System.out.println();
  }
  public static int Fibonacci(int n){
    if((n==0)||(n==1)){
      return 1;
      }else{
        return Fibonacci(n-1)+Fibonacci(n-2);
      }
  }
}