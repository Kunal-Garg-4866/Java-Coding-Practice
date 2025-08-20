package Practice;
import java.util.Scanner;

public class SortPosNeg {
     static void display(int[] arr) {
       for(int val: arr){
        System.out.print(val + " ");
       } 
    }
    public  static void swap (int [] arr , int l , int r ){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    static void partion(int [] arr ){
        int n = arr.length;
        int l = 0;
        int r = n-1;

        while(l<r){
            while(arr[l]<0) l++;
            while(arr[r]>=0) r--;
            if(l<r){
                swap(arr,l,r);
                l++;
                r--;

            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the element of array:");
        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        partion(arr);
        display(arr);
        sc.close();

        
    }
}
