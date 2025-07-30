import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
