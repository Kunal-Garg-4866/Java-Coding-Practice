package Recursion;
import java.util.Scanner;

public class fibonacci {
    static int fibb(int n){
        // base
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        // shortcut 
        return fibb(n-1) + fibb(n-2);
        // explanation 5
    //     // sub problem
    //    int prev = fibb(n-1);
    //    int prevPrev = fibb(n-2);
    //    // self work 
    //    return prev + prevPrev ;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println(fibb(n));
        // if ask for nth numbers 
        // for (int i=0;i<=n;i++){
        // System.out.println(fibb(i));
        // }

        sc.close();
        

    }
    
}
