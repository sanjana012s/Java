import java.util.*;
class searchNo{
  public static void main(String arg[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the no:");
    int size=sc.nextInt();
    int arr[]= new int[size];
    // input
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }

   System.out.print("Search no is :");
   int n=sc.nextInt();
     
    
    for(int i=0;i<size;i++){
      if(arr[i]==n){
        System.out.print("no is found" +i);
        break;
      }
    }
  }
}