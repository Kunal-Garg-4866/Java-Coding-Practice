package BubbleSort;
import java.util.Scanner;

public class BasicSorting {
    // static void bubblesort(int [] arr){
    //     int n = arr.length;
    //      for(int i=0;i< n-1;i++ ){
    //         for(int j=0;j<n-i-1;j++){

    //             if(arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }

    //         }
    //     }

    // optimized method 
    static void bubblesort(int [] arr){
        int n = arr.length;
         for(int i=0;i< n-1;i++ ){
            boolean flag = false; // has any swap happened 
            for(int j=0;j<n-i-1;j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; // 
                 }

            }
            if(flag == false) return;
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
        bubblesort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }

        sc.close();
    }
    
}
