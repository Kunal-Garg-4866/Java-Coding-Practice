package Recursion;
import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n-1);

        // int smallans = factorial(n-1);

        // // big problem - self work
        // int ans = n * smallans;
        // return ans;
        }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
   

    }
    
}
