import java.util.Scanner;

public class SortedArray {
    static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {  
            if (arr[i] < arr[i - 1]) {  
                return false;
            }
        }
        return true;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = sc.nextInt();
        }

        boolean result = isSorted(arr);
        System.out.println("Is the array sorted? - " + result);

        sc.close(); 
    }
}
