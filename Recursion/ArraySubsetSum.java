package Recursion;
import java.util.Scanner;
public class ArraySubsetSum {
    static void subsetSum(int [] arr , int n , int idx,int sum){
        if(idx >= n){
            System.out.println(sum);
            return;
        }


        // curr idx  + sum 
        subsetSum(arr , n , idx +1 , sum + arr[idx] );
        // curr idx - sum
        subsetSum(arr , n , idx +1 , sum  );

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        subsetSum(arr , arr.length, 0 , 0);

        sc.close();
}
}
