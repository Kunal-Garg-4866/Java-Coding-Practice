import java.util.Scanner;

public class AP{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        for(int i=1;i<=2*n-1;i+=2){
            System.out.print(i+ " ");
        }
    }
}