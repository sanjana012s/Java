import java.util.*;
class updateBit{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int opr=sc.nextInt();
    int n=5;
    int pos=1;
    int Bitmarks=1<<pos;
    if(opr==1){
      int newNo=Bitmarks | n;
      System.out.println(newNo);
    }
    else{
      int notbit=~(Bitmarks);
      int newNo= notbit & n;
      System.out.println(newNo);
    }
  }
}