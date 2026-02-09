import java.util.*;
class function{
  public static void main(String args[]){
    StringBuilder sb=new StringBuilder("sanjna");
    System.out.println(sb);
    // charAt method
      System.out.println(sb.charAt(0));
    // setCharAt method
      sb.setCharAt(0,'r');
      System.out.println(sb);
    // insert method
      sb.insert(0,'a');
      System.out.println(sb);
    // delete method
      sb.delete(0,1);
      System.out.println(sb);
    // append method
      sb.append("anu");
      System.out.println(sb);
    // reverse method
      sb.reverse();
      System.out.println(sb);
      
    }
  }


