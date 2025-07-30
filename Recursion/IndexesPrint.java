package Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexesPrint {
    static ArrayList<Integer> allIndeces(int [] arr , int n , int target , int idx){
        //base case
        if(idx >= n){ // ans = {0}
            return new ArrayList<Integer>(); //return empty arraylist
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        // self work
        if(arr[idx] == target){
            ans.add(idx);
        }
        // recursive work 
         ArrayList<Integer> smallans=allIndeces(arr,n,target,idx+1);
         ans.addAll(smallans);
         return ans;  

    }

    // static void FindIndex(int [] arr , int target , int idx){
    //     if(idx >= arr.length){
    //         return ;
    //     }
    //     // self work 
    //     if(arr[idx] == target) System.out.println(idx);

    //     // recursive work 
    //     FindIndex(arr, target, idx + 1);
    // }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of the array: ");
        int [] arr = new int[sc.nextInt()];
        System.out.print("Enter the elements of the array: ");
        int n = arr.length;
        for(int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the value of target:");
        int target = sc.nextInt();
       int idx = 0 ;
       ArrayList<Integer> ans = allIndeces(arr,n,target,idx);
       for (Integer i: ans){
        System.out.println(i);
       }
        sc.close();
    }
    
}
