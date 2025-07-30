import java.util.Scanner;

public class SumAndReverse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int reverse = 0;
        int sum = 0;
        while(n!=0){ 
        int l = n%10;
        sum = sum + l;
        reverse = reverse*10 + l;
        n = n/10;
 
        }
        System.out.println("  reverse of digits is: "+reverse);
        System.out.println("  sum of digits is: "+sum);
    }
}