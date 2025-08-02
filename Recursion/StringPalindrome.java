package Recursion;
import java.util.Scanner;

public class StringPalindrome {
   static String Reverse(String  s , int idx){
        if(idx == s.length()) return "";
       
        String smallAns = Reverse(s,idx+1);
        
         return smallAns + s.charAt(idx);
       

    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Character: ");
       String s = sc.nextLine();
       int idx = 0;
       String rev = Reverse(s,idx);
       if(rev.equals(s)) System.out.println("  The String is Palindrome");
       else System.out.println(" The String is not Palindrome");
       sc.close();
    }
       
    
    
}
