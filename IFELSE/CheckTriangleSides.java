import java.util.Scanner;

public class CheckTriangleSides{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Enter the first side: ");
        int a = input.nextInt();
        System.out.print("Enter the  second side : ");
        int b = input.nextInt();
        System.out.print("Enter the  third side: ");
        int c = input.nextInt();

        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
       
    }
}
