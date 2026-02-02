import java.util.*;
class que4{
  public static void main(String args[]){
    Scanner  sc=new Scanner(System.in);
    System.out.print("enetr the no:");
    int n=sc.nextInt();
    int i;
    for(i=1;i<=10;i++){
      System.out.println("table of "+ n+" is "+n+" x"+i+"="+ i*n);
    }
  }
}