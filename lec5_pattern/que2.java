/** hollow solid
 ******
 *     *
 *     *
 *     *
 ******    
 */
import java.util.*;
class que2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the row no:");
    int r=sc.nextInt();
    System.out.print("enter the col no:");
    int c=sc.nextInt();
    int i,j;
    for( i=1;i<=r;i++){
      for( j=1;j<=c;j++){
        if(i==1 || j==1 || i==r || j==c)
        {
          System.out.print("*");
        }
        else{
          System.out.print(" ");

        }
      }
      System.out.println();
    }
  }
}