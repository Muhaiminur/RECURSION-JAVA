package recursion.java;
/*8) Print 24, 18, 12, 6, 0, -6*/
import java.util.Scanner;
public class RECURSION_PRINT_SERIAL{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println(print(24)+"*/");
  }
 public static int print(int n){
  if(n==-6){
    return -6;
  }else{
    System.out.print(n+",");
    return print(n-6);
  }
 }
}