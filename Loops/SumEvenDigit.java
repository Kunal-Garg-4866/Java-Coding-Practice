import java.util.Scanner;

public class SumEvenDigit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int sum = 0;
        while(n!=0){
            if(n%2==0){
            sum = sum + n%10;
        }
            n = n/10;

        }
        System.out.println("Sum of digits is: "+sum);
    }
}