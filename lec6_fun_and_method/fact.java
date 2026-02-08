import java.util.*;
class fact{
  //function 
  public static int facts(int n){
    if(n==0 || n==1){
      return 1;
    }
    else{
      return n*facts(n-1);
    }

   
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the no:");
    int n=sc.nextInt();
    System.out.print(facts(n));


  }
}