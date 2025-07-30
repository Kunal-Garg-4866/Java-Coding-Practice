package Recursion;
import java.util.Scanner;

public class SumOfDigit {
    static int SOD(int n ){
        if(n>=0 && n<10){
            return n;
        }
        return SOD(n/10) + n%10;
}
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println(SOD(n));


        sc.close();
    }
    
}
