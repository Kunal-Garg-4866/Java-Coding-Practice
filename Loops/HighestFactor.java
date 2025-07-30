import java.util.Scanner;

public class HighestFactor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int hf = 1;
        for (int i=n-1;i>=1;i--){
            if(n%i==0){
                hf = i;
                break;
            }
        }
        System.out.println("The highest factor of " + n + " is " + hf);

    }
}