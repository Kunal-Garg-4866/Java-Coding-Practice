package Recursion;
import java.util.Scanner;

public class GCD {
    // by iteration method 
    // static int iGCD(int x, int y){
    //     while(x%y != 0){
    //        int rem = x%y;
    //        x=y;
    //        y=rem; 
    //     }
    //     return y;
    // }
// By Euclid's Algorithm 
    static int EGCD(int x,int y){
    if(y==0) return x;
    return EGCD(y,x%y);
} 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x:");
        int x = sc.nextInt();
        System.out.print("Enter value of y:");
        int y = sc.nextInt();
        //System.out.println(iGCD(x,y));
        System.out.println(EGCD(x,y));
        sc.close();
    }
    
}
