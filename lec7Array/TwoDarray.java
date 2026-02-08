import java.util.*;
class TwoDarray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the row no:");
    int row=sc.nextInt();
    System.out.println("enter the column no:");
    int col=sc.nextInt();
    int arr[][]=new int[row][col];
    int n=arr.length;
    int m=arr[0].length;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
       System.out.print(" "+arr[i][j]);
      }
      System.out.println();
    }
  }}