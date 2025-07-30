import java.util.Scanner;

public class Sorting{
    static void SortZerosAndOne(int[]arr){
        int n = arr.length;
        int Zeros = 0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                Zeros++;
            }
        }

        for(int i=0;i<n;i++){
            if(i<Zeros){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }

    static void  printarray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[]arr= new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }

        SortZerosAndOne(arr);
        printarray(arr);
    }
}


// Another Apporch more optimize


import java.util.Scanner;

public class Sorting{

    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void SortZerosAndOne(int[]arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left < right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
        }
     static void  printarray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[]arr= new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }

        SortZerosAndOne(arr);
        printarray(arr);
    }
}


