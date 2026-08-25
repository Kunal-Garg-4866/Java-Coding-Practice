package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of elements you want to add : ");
        n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
         }
         Stack<Integer> rt = new Stack<>();
             while(st.size() > 0){
            rt.push(st.pop());
        }
        st.push(5);
        while(rt.size() > 0){
            st.push(rt.pop());
        }
        System.out.println(st);
        
        sc.close();   
        
    }
    
}
