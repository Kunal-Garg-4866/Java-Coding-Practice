package BinaryJavaSearch;
import java.util.Scanner;

public class Target {
    static boolean BinarySearch(int[] a , int target){
        int n = a.length;
        int st=0 , end =n-1;
        while (st<=end){
            int mid=(st+end)/2;
            if(a[mid]==target){
                return true;
            }
            else if(target<a[mid]){
                end = mid-1;

            }
            else{
                st = mid+1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if array:");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
             a[i] = sc.nextInt();
        }
        System.out.print("Enter the target:");
        int target = sc.nextInt();
        System.out.println(BinarySearch(a,target));
        sc.close();

    
    
    }
    
}
