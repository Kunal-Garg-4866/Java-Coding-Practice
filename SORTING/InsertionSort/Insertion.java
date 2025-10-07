package InsertionSort;
import java.util.Scanner;

public class Insertion {
    static void insertionsort(int [] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while( j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionsort(arr);
        for(int val : arr){
            System.out.print(val+" ");
        }
        sc.close();

    }
    
}
