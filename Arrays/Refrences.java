import java.util.Scanner;

public class Refrences{
    static void (int [] arr){
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    static void printarr(int [] arr){
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numeber:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+ n +" Element:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Orignal array");
        printarr(arr);



        int [] arr_2 = arr;  // Shallow Copy f
        System.out.println("Copied array");
        printarr(arr_2);
        
    }
}



//  with deep copy  methods 

import java.util.Scanner;

public class Refrences{
    static void Change_value(int[] arr) { // Fixed method name and added return type
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;  // Fixed missing semicolon
        }
    }

    static void printarr(int[] arr) { // Removed duplicate method
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printarr(arr);

        int[] arr_2 = arr.clone(); // Corrected array declaration
        System.out.println("Copied array after modification:");
        Change_value(arr_2);
        printarr(arr_2);

        sc.close(); // Closing Scanner to prevent resource leak
    }
}
