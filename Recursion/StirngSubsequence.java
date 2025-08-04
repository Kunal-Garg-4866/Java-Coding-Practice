package Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class StirngSubsequence {
    static ArrayList<String> getSSQ(String s){
    ArrayList<String> ans = new ArrayList<>();
    // base case 

    if(s.length() == 0){
        ans.add("");
        return ans;
    }
    char curr = s.charAt(0);
    ArrayList<String> smallAns = getSSQ(s.substring(1)); // ["bc","b","c",""]
    
    // ans =["bc","b","c","abc","ab","ac","a"]
    for (String ss: smallAns){
        ans.add(ss); // bc
        ans.add(curr + ss); //abc


    }
    return ans;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        String s = sc.nextLine();
        ArrayList<String> ans = getSSQ((s));
        for(String ss : ans){
            System.out.println(ss);
        }

        // also print through this but upper one is better
        // System.out.println(getSSQ(s));
       

        sc.close();
        
    }
            
}
