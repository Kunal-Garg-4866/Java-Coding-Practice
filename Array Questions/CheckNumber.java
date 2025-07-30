import java.util.Scanner;

public class CheckNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i=0;i<=arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
}