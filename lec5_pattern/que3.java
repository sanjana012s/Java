/**
 half pyramid
 * 
 **
 ***
 ****

 */
import java.util.*;
class que3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enetr the no:");
    int n=sc.nextInt();
    int i,j;
    for(i=1;i<=n;i++){
      for(j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}