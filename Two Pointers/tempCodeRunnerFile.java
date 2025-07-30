 import java.util.Scanner;

// public class PrefixSum{

//     static int[] makeprefixSum(int [] arr) {
//         int n = arr.length;
//         int[] prefix = new int[n];
//         prefix[0] = arr[0];


//         for(int i =1;i<n;i++){
//             prefix[i]=prefix[i-1] + arr[i];
//         }
//         return prefix;
//     }

    
//      static void  printarray(int []arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

   

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int n = sc.nextInt();
//         int[]arr= new int[n];
//         System.out.println("Enter the elements of array:");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
            
//         }
//         int[] prefix = makeprefixSum(arr);

//        printarray(prefix);
//     }
// }