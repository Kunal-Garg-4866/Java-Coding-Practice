package Recursion;
import java.util.Scanner;

public class ArraySum {
    static int Sum(int [] arr , int idx){
        if(idx==arr.length) return 0;
        return arr[idx] + Sum(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int [] arr = new int[sc.nextInt()];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        System.out.println(Sum(arr,idx));
        sc.close();
    }
    
}
