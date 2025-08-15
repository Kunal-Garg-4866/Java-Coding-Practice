package SORTING.QuickSort;
import java.util.Scanner;

public class Quick {
    static void displayArr(int [] arr){
        for(int val: arr){
            System.out.print(val + " ");

        }
    }
     static void swap(int [] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    
    
    static int partion (int [] arr , int st , int end){
        int pivot = arr[st];
        int cnt = 0;
        for(int i = st+1;i<= end;i++){
            if(arr[i] <= pivot) cnt++;
        }
        // this is the position where we need to put the pivot 
        int pivotIndex = st + cnt;
        // this will set pivot to its correct location  
        swap(arr,pivotIndex,st);

        int i=st ;
         int j=end ;

         // element lesser then pivot -> left side 
         // element greater then pivot -> right side

         while(i<pivotIndex && j>pivotIndex){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
         }

        return pivotIndex;

    }
    static void Quicksort(int [] arr , int st , int end ){
        if(st >= end ) return;
        int pi = partion(arr,st,end);
        Quicksort(arr,st,pi-1);
        Quicksort(arr,pi+1,end);


     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
         System.out.println("Enter element of array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
            Quicksort(arr,0,n-1);
           
            System.out.println("Array after sorting");
            displayArr(arr);
        sc.close();
    }

    
    
}
