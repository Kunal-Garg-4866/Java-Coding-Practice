package Recursion;
import java.util.Scanner;

public class KeypadCombination {
    static void combination(String dig , String[] kp , String res ){
        if(dig.length()==0){
            System.out.println(res);
            return;
        }
        int currNum = dig.charAt(0)-'0';
        String currChoices = kp[currNum];
        for(int i=0;i<currChoices.length();i++){
            combination(dig.substring(1),kp,res+currChoices.charAt(i));
            }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Stirng Number:");
        String dig = sc.nextLine();
          String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vw"};
         combination(dig, kp, "");  // ✅ Added this call
        sc.close();
    }
    
    
}
