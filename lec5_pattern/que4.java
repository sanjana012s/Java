/**
 inverted half pyramid

 ***
 **
 * 
 
 */

import java.util.*;
class que4{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the no:");
    int n=sc.nextInt();
    int i,j;
    for(i=1;i<=n;i++){
      for(j=1;j<=n-i+1;j++){
        System.out.print("*");
      }
      System.out.println();
    }

  }
}