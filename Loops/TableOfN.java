import java.util.Scanner;

public class TableOfN{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        for (int i=n;i<=n*10;i+=n){
            if(i%n==0){
                System.out.println(i);

            }
          
        }
    

    }
}