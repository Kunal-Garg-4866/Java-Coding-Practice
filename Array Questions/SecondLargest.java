import java.util.Scanner;

public class SecondLargest{
     static int findmax(int [] arr){
            int n = arr.length;
            int mx = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>mx){
                    mx = arr[i];
                }
            }
            return mx;
        }
        static int findsecondmax(int [] arr){
            int mx = findmax(arr);
            int n = arr.length;
            for(int i=0;i<n;i++){
                if(arr[i]==mx){
                    arr[i]= Integer.MIN_VALUE;
                }
            }
            int secondmax = findmax(arr);
            return secondmax;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Ente the element of array:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("max element is "+findsecondmax(arr));
    }
}