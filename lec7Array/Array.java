// type[] arrayName=new type [size]

import java.util.*;
public class Array{
  public static void main(String args[]){
    int [] marks= new int [3];
    marks[0]=23;
    marks[1]=34;
    marks[2]=55;
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
    for(int i=0;i<3;i++){
      System.out.println(marks[i]);
    }
  }
}