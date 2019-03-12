package recursion.java;
/*Using recursion:
6) Print 1 to 10
*/
import java.util.Scanner;
public class RECURSION_PRINT_1_10{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println(print(1));
  }
 public static int print(int n){
  if(n==10){
    return 10;
  }else{
    System.out.println(n);
    return print(n+1);
  }
 }
}