package Recursion;
import java.util.Scanner;

public class SeriesSum {
    static int sum(int n){
        if(n==0) return 0;
       return sum(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
    
}
