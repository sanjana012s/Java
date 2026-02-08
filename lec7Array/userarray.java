import java.util.*;
class userarray{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the array no:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    //input
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    //output
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
  }
}