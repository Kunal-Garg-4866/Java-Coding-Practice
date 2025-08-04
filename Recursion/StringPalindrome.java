package Recursion;
import java.util.Scanner;

public class StringPalindrome {
   // static String Reverse(String  s , int idx){
   //      if(idx == s.length()) return "";
       
   //      String smallAns = Reverse(s,idx+1);
        
   //       return smallAns + s.charAt(idx);
       

   //  }
   //optimized Method 

    public static boolean check(String str, int s ,int e){
      if(s>e){
         return true;
      }
         if(str.charAt(s)!=str.charAt(e)){
            return false;
         }
         return check(str,s+1,e-1);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Character: ");
       String s = sc.nextLine();
       
      //  String rev = Reverse(s,0);
      //  if(rev.equals(s)) System.out.println("  The String is Palindrome");
      //  else System.out.println(" The String is not Palindrome");
        sc.close();

        if(check(s,0,s.length()-1)){
         System.out.println("The String is Palindrome");
        }else{
         System.out.println("The String is not Palindrome");

        }



    }
       
    
    
}
