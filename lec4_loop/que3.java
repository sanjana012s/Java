/*sum of n natural no*/
import java.util.*;
class que3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the no:");
    int n=sc.nextInt();
    int i;
     int sum=0;
    for(i=1;i<=n;i++){
      sum=sum+i;
    }
    System.out.print(sum);
  }
}