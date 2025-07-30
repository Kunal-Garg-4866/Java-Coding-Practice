import java.util.Scanner;

public class ThreeDigitNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n = input.nextInt();
        if(n>99 && n<1000){
            System.out.println("The number is a three-digit number.");
        }
        else{
            System.out.println("The number is not a three-digit number.");
        }
    }
}