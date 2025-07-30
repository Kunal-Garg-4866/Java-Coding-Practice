package Recursion;
import java.util.Scanner;


public class IndexSearch {
      static int FindIndex(int [] arr , int target , int idx){
        if(idx >= arr.length){
            return -1;
        }
        // self work 
        if(arr[idx] == target) return idx;

        // recursive work 
       return FindIndex(arr, target, idx + 1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of the array: ");
        int [] arr = new int[sc.nextInt()];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the value of target:");
        int target = sc.nextInt();
        int idx = 0;
        System.out.println(FindIndex(arr,target,idx));
        sc.close();
    }
    
}
