import java.util.Scanner;

public class Selection {
    static void selectionsort(int [] arr ){
        int n = arr.length; 

        for (int i =0 ;i<n-1;i++){
            int min_index = i ; 

        for (int j =i+1;j<n ;j++){
            if (arr[j]<arr[min_index]) {
                min_index = j ;
            }
        }
        int temp = arr[i];
        arr[i]=arr[min_index];
        arr[min_index]=temp ;
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
        selectionsort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
