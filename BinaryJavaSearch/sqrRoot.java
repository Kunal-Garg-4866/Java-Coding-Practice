package BinaryJavaSearch;
import java.util.Scanner;

public class sqrRoot {
   
    static int mySqrt(int x) {
        if(x==0) return  0;
        int st =1;
        int end = x;
        int ans =-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            long val =  (long)mid*mid;
            if(val==x){
                System.out.println("hi");
                return mid;
            }
            else if(val<x){
                ans = mid ;
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println("hi");
        return ans ;
        
    }


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the value of target:");
        int x = sc.nextInt();
       System.out.println(mySqrt(x));
        sc.close();
        
    }
    
}
