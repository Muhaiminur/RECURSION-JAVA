package recursion.java;
/*14) Given a number, print its factors*/
import java.util.Scanner;
public class FACTORS_RECURSION{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    factors(72);
  }
  public static void factors(int n){
    if((n==0)||(n==1)){
      System.out.println();
      }else{
        int c=1;
        while(c<=n){
          if(n%c==0){
            System.out.print(c+" ");
          }
          c++;
        }
        System.out.println();
      }
  }
}