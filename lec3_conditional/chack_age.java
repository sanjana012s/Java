import java.util.*;
class chack_age{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the your age:");
    int age=sc.nextInt();
    if(age>=18){
      System.out.print("you are eligible for adult");
    }
    else{
      System.out.print("you are  not eligible for adult");
    }

  }
  
}