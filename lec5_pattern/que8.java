// 1
// 01
// 101
// 0101



import java.util.*;
class que8{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the no:");
    int n=sc.nextInt();
    int i,j;
    for(i=1;i<=n;i++){
      for(j=1;j<=i-1+1;j++){
        if((i+j)%2==0){
          System.out.print("1");
        }
        else{
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }
}