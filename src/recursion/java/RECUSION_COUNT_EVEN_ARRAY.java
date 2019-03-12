package recursion.java;
/*11) Count even numbers found in an array*/
import java.util.Scanner;
public class RECUSION_COUNT_EVEN_ARRAY{
  static int count=0;
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int[]a={1,2,3,4,5,6,4,1};
    System.out.println(sum(a,0));
    }
  public static int sum(int[]b,int n){
    if(n==b.length){
      return count;
      }else{
        if(b[n]%2==0){
          count++;
        }
        return sum(b,n+1);
      }
  }
}