import java.util.*;

class PalindromeChecker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ek number enter karo: ");
        int num = sc.nextInt();
        
        int original = num;
        int reversed = 0;
        
        // Number ko reverse karo
        while(num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        
        // Check karo palindrome hai ya nahi
        if(original == reversed) {
            System.out.println(original + " palindrome number hai! ✓");
        } else {
            System.out.println(original + " palindrome number nahi hai!");
        }
    }
}
