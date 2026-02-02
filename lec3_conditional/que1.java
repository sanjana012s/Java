import java.util.*;
class que1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("press the button 1 or 2 or 3");
    int button=sc.nextInt();
    if(button==1){
      System.out.print("hello");
    }
    else if(button==2){
      System.out.print("Namasate");
    }
    else{
      System.out.print("Bonjour");
    }
  }
}