package BinaryJavaSearch;
import java.util.Scanner;


public class FirstOccurence {
    static int BinaryFirstOccurence(int[] a , int st , int end , int target){
        int fo = -1;
        if(st>end) return fo;
        int mid = st + (end-st)/2;
        if(a[mid]==target){
            fo=mid;
            end = mid-1;

        }
        else if(target<a[mid]){
            return BinaryFirstOccurence(a,st,mid-1,target);
        }
        else{
            return BinaryFirstOccurence(a,mid+1,end,target);
        }
        return fo;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the element of array:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the value of target:");
        int target = sc.nextInt();
        System.out.println(BinaryFirstOccurence(a,0,n-1,target));
        sc.close();
    }

    
}
