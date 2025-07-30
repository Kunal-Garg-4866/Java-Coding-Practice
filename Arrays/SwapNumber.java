import java.util.Scanner;

public class SwapNumber{
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a = "+a+" b = "+b);
    }
    static void SwapWithoutTemp(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping without temp  a = "+a+" b = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();


        swap(a,b);
        SwapWithoutTemp(a,b);
 
    }
}