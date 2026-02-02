/**
 
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28


 */

import java.util.*;
class que6{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the no:");
    int n=sc.nextInt();
    int num=0;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        num=num+1;
        System.out.print(num+" "); 
      }
      System.out.println();
    }
  }
}