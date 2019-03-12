public class cse220Lab08task8{
  public static int[] sortarray(int[]a,int p,int q){
    if(p>=q){
      return a;
    }else{
      int temp=a[p];
      int x=p-1;
      while(x>=0&&temp<a[x]){
        a[x+1]=a[x];   
        x--;
      }
      a[x+1]=temp;
      return sortarray(a,p+1,q);
    }
  }
}