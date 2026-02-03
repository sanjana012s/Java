import java.util.Scanner;
class name{
     public static void printnames(String name){
      System.out.println(name);
      return;
    }

  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    printnames(name);

  }
}