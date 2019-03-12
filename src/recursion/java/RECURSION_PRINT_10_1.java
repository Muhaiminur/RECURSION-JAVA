package recursion.java;
/*7) Print 10 to 1*/
import java.util.Scanner;
public class RECURSION_PRINT_10_1{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println(print(10));
  }
 public static int print(int n){
  if(n==1){
    return 1;
  }else{
    System.out.println(n);
    return print(n-1);
  }
 }
}