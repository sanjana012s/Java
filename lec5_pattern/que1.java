/* print solid ractangle

*****
*****
*****
*****
*/
import java.util.*;
class que1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the no:");
    int n=sc.nextInt();
    int i;
    for(i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        System.out.print("*");
      }
      System.out.println();
  }
}
}