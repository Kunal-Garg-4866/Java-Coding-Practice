package Recursion;
import java.util.Scanner;

public class ReverseNaturalNumber {
    static void printDecreasing(int n){
        // base case
        if(n==1){
            System.out.println(1);
            return;
        }
        // self work
        System.out.println(n); // n
        // recursive work
        printDecreasing(n-1); // n-1 , n-2 , n-3 .......

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Natural Number:");
        int n = sc.nextInt();
        printDecreasing(n);
        sc.close();
    }
    
}
