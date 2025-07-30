package Recursion;
import java.util.Scanner;

public class CharactersRemove {
    static String Remove2
    static String Remove(String s , int idx){
        if(idx == s.length()) return "";
        // recursive work 
        String smallans = Remove(s,idx+1);
        char currChar = s.charAt(idx);
        // self work 
        if(currChar != 'a') return currChar + smallans;
        else return smallans;


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
        int idx  = 0;
        System.out.println(Remove(s,idx));
        sc.close();
    }
}
