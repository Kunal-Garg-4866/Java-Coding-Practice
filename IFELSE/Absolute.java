import java.util.Scanner;

public class Absolute{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if(num<0){
            num = num * -1;
        }
        else{
            num = num;
        }
        System.out.println("Absolute value of the number is: "+num);
    }
}