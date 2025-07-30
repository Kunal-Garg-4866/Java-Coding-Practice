import java.util.Scanner;
public class DivisibleBy5{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    if(number%5==0){
        System.out.println("Number is divisible by 5");
    }
    else{
        System.out.println("Number is not divisible by 5");
    }
}
}