package MergeSort;
import java.util.Scanner;


public class Merge {
    static void displayArr(int [] arr){
        for(int val: arr){
            System.out.print(val + " ");

        }
    }
    static void  merge(int[] arr , int l , int mid , int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int [] left = new int[n1];
        int [] right = new int[n2];
        for(int i=0;i<n1;i++) left[i] = arr[l+i];
        for(int j=0;j<n2;j++) right[j] = arr[mid+1+j];
       int  i=0;
       int  j=0;
       int  k=l;

        while(i <n1 && j <n2){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++]=right[j++];
            }

         
        }
           while(i<n1){
                arr[k++] =left[i++];
            }
            while(j<n2){
                arr[k++]=right[j++];
                }



    }
    static void mergeSort(int [] arr , int l , int r){
        if(l>=r) return;
        int mid = (l+r)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
       

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
            mergeSort(arr,0,n-1);
            System.out.println("Array after sorting");
            displayArr(arr);

        sc.close();
    }
    
}
