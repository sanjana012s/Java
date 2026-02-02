/**
 inverted half pyramid (rotated by 180 deg)
    *
   ** 
  ***
 */

import java.util.*;
class que5{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the no:");
    int n=sc.nextInt();
    int i,j,k;
    for(i=1;i<=n;i++){
      for(j=1;j<=n-i+1;j++)
      {
        for(k=1;k<i-1;k++){
        System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }
}