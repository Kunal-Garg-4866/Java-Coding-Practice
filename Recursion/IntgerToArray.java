package Recursion;
import java.util.Scanner;


public class IntgerToArray {
     static void displayArr(int [] arr){
        for(int val: arr){
            System.out.print(val+" ");
            

        }
    }
    public static int count(int n){
        int count = 0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int FillArray(int n , int [] arr , int index){
        if(n==0) return index;

        index = FillArray(n/10,arr,index);
        arr[index] = n%10;
        return index+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int [] arr = new int[count(n)];
        FillArray(n,arr,0);
        displayArr(arr);

        sc.close();
    }
    
}
