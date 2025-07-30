package Recursion;
import java.util.Scanner;

public class power {
    static int pow(int p , int q){
    //     if(q==0) return 1;
    //     return pow(p,q-1) * p;
    // }
    // Better  Approch 
    if(q==0) return 1;
    int smallpow = pow (p,q/2);
    if(q%2==0) return smallpow * smallpow ;
    return p * smallpow * smallpow ;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of p: ");
        int p = sc.nextInt();
        System.out.print("Enter the value of q: ");
        int q = sc.nextInt();
        System.out.println(pow(p,q));
        sc.close();
    }
    
}
