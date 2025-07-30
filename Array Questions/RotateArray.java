import java.util.Scanner;

public class RotateArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int arr[] =  new int[n];
        System.out.println("Enter the Elements of Array:");
        for(int i=0;i<=arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }
}