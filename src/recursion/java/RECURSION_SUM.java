package recursion.java;
/*9) Take 10 numbers from the user and print sum*/
import java.util.Scanner;
public class RECURSION_SUM{
  static int sum1=0;
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    sum(10);
  }
 public static void sum(int n){
   Scanner abir1=new Scanner(System.in);
   if(n==0){
     System.out.println(sum1);
   }else{
       System.out.println("enter");
       int m=abir1.nextInt();
       sum1=sum1+m;
       sum(n-1);
   }
 }
}