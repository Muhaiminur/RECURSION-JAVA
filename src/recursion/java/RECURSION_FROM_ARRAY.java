package recursion.java;
/*10) Sum 10 numbers found in an array*/
import java.util.Scanner;
public class RECURSION_FROM_ARRAY{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int[]a={1,2,3,4,5,6};
    System.out.println(sum(a,0));
    }
  public static int sum(int[]b,int n){
    if(n==b.length){
      return 0;
      }else{
        return b[n]+sum(b,n+1);
      }
  }
}