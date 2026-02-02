import java.util.*;
class odd_even_no{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the no:");
    int n=sc.nextInt();
    if(n%2==0){
      System.out.print("no is even");
    }
    else{
      System.out.print("odd no");
    }
  }
}