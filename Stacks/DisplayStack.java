package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class DisplayStack {
    //  using recursion
    public static void display(Stack<Integer> st){
        if(st.size() == 0) return ;
        int top = st.pop();
        display(st);
        System.out.print(top + " ");
    
       st.push(top);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
       
        System.out.println("Enter the number of elements you want to add : ");
       int   n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
         }
         display(st);
        //  Stack<Integer> rt = new Stack<>();
        //      while(st.size() > 0){
        //     rt.push(st.pop());
        //      }
        //      while(rt.size()>0){
        //         int x = rt.pop();
        //         System.out.print(x + " ");
        //         st.push(x);
        //      }
        // with array

        // int m = st.size();
        // int [] arr = new int[n];
        // for(int i=m-1;i>=0;i--){
        //     arr[i] = st.pop();
        // }
        // for(int i=0;i<m;i++){
        //     System.out.print(arr[i] + " ");
        //     st.push(arr[i]);
        // }

        
             sc.close();
    }
}
