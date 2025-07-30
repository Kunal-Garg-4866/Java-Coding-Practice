import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the  secondnumber: ");
        int b = input.nextInt();
        System.out.print("Enter the  third number: ");
        int c = input.nextInt();
        if(a>b && a>c){
            System.out.println("The greatest number is: " + a);
        }
        else if(b>a && b>c){
             System.out.println("The greatest number is: " + b);

        }
        else{
             System.out.println("The greatest number is: " +c);
        }

    }
}