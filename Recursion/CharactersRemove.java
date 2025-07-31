package Recursion;
import java.util.Scanner;

public class CharactersRemove {

         //Method 1 
        static String Remove(String s , int idx){
        if(idx == s.length()) return "";
        // recursive work 
        String smallans = Remove(s,idx+1);
        char currChar = s.charAt(idx);
        // self work 
        if(currChar != 'a') return currChar + smallans;
        else return smallans;
    }

    // Method 2 with more compateble without idx 
     static String Remove2(String s ){

        if(s.length() == 0) return "";
        String smallAns = Remove2(s.substring(1));
        char currChar = s.charAt(0);
        if(currChar != 'a') return currChar + smallAns;
        else return smallAns;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // System.out.println(s); 
        //  char ch = s.charAt(0);
        //  System.out.println(ch);
        //  for(int i =0; i< s.length();i++){
        //     System.out.println(s.charAt(i));
        //  }
        //  System.out.println(s.substring(2,4)); // 2 ,3 
        String s = sc.nextLine();
        int idx = 0;
        System.out.println(Remove(s,idx));
        System.out.println(Remove2(s));
        sc.close();
    }
}
 