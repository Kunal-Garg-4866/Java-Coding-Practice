
import java.util.Scanner;

public class DivisibleBy5And3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the  number: ");
        int num = input.nextInt();
       
        if (num%3==0 && num%5==0){
            System.out.println("Divisible by 3 and 5 ");
        }
        else{
            System.out.println("Not divisible by 3 and 5");
        }
        input.close();

    }
}