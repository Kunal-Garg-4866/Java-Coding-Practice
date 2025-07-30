package Recursion;
import java.util.Scanner;

public class MaximumArray {
    static int MaximumElement(int[] arr , int idx){
    
        if(idx==arr.length-1) return arr[idx];
        int max = MaximumElement(arr,idx+1);
        return Math.max(arr[idx],max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int [] arr = new int[sc.nextInt()];
        System.out.print("enter the elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int idx = 0; 
        System.out.println(MaximumElement(arr,idx));
        sc.close();
    }
    
}
