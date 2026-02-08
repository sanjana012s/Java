import java.util.*;
class Strfunction{
    public static void main(String[] args) {
        // concatenation
        String str1 = "sanjna";
        String str2 = "anu";
        String str=str1+str2;
        System.out.println(str);
        // length function
        System.out.println(str.length());
        //charAt function
        for(int i=0;i<str.length();i++){
          System.out.println(str.charAt(i));
        }
         //compair function
        //  also chack less and greater
         if(str1.compareTo(str2)==0){
          System.out.println("string are same");
         }
         else{
          System.out.println("not same");
         }
         // substring function
         System.out.println(str.substring(1,6));

    }
}