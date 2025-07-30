package Recursion;
import java.util.Scanner;

public class ArrayPrint {
    static void printArray(int[] arr , int idx){
        if(idx == arr.length) return ;
        System.out.println(arr[idx]); 
        printArray(arr ,  idx+1);


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the numeber:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println ("Enter"+ n +"Element:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        printArray(arr, idx );
        sc.close();


    }
    
    
}
