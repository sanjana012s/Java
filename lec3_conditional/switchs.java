import java.util.*;
class switchs{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("press your button 1 or 2 or 3");
    int button=sc.nextInt();
    switch(button){
      case 1:
        System.out.print("hello");
        break;
      case 2:
        System.out.print("Namasate");
        break;
      case 3:
        System.out.print("banjour");
        break;
      default:
        System.out.print("invalid button");
    }
  }
}