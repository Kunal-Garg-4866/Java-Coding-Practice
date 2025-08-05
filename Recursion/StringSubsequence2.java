package Recursion;
import java.util.Scanner;

// this is more optimized method to do this question without making arraylist 
public class StringSubsequence2 {
    static void printSSQ(String s , String currAns){ // s ="abc" , currAns = ""
    if(s.length()== 0){
        System.out.println(currAns);
        return;
    }    
    char curr = s.charAt(0); // a
        String remString = s.substring(1); // bc

         // self work // Curr char -> choose to be a part of currAns
        printSSQ(remString ,currAns + curr); // bc , a

         // recursive work // curr char -> choose not to be a part of currAns
        printSSQ(remString , currAns); // bc , ""

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character:");
        String s = sc.nextLine();
        printSSQ(s,"");
        sc.close();
    }
    
}
