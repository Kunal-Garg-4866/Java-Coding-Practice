package SORTING.Practice;
import java.util.Scanner;

// Leet code question 283 : Move Zeroes to the end of the array // Done using bubble sort 
// also we can use two pointer approach to solve this problem in O(n) time complexity
public class MovesZeroes {
    static void Zeroes(int [] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]== 0 && arr[j+1] !=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
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
        Zeroes(arr);
        System.out.println("Array after moving zeroes to end");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            }

        sc.close();
}
    
}
