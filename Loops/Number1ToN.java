import java.util.Scanner;

public class Number1ToN {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}