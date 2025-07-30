import java.util.Scanner;

public class TakingInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numeber:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter"+ n +"Element:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}