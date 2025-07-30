import java.util.Scanner;

public class RangeQuery {

    static int[] makeprefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];  // Maintain the same size (1-based indexing)
        prefix[1] = arr[1];  // Initialize prefix sum from index 1

        for (int i = 2; i < n; i++) {  // Start from 2 to maintain 1-based indexing
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    static void printarray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {  // Start from 1
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n + 1];  // Extra space to handle 1-based indexing
        
        System.out.println("Enter the elements of array:");
        for (int i = 1; i <= n; i++) {  // Start input from index 1
            arr[i] = sc.nextInt();
        }

        int[] prefix = makeprefixSum(arr);

        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            // Use 1-based indexing directly
            int ans = prefix[r] - prefix[l - 1];
            System.out.println("Sum: " + ans);
        }

        sc.close();
    }
}
