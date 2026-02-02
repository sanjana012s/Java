/**
 
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1



 */

import java.util.*;
class que7{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.print("enetr the no:");
    int n=sc.nextInt();
    int i,j;
    for(i=1;i<=n;i++){
      for(j=1;j<=n-i-1;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }

  }
}