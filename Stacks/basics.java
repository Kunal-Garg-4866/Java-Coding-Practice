package Stacks;
import java.util.Stack;

public class basics {
    public static void main(String[] args) {
         // int[] arr = new int[5];
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34); 
        // // peek
        //  // System.out.println(st.peek());
        // // System.out.println(st);
        // // st.pop(); 
        // System.out.println(st);
        // System.out.println("Size of stack : " + st.size());
 
        // while(st.size() > 1){
        //     st.pop();
        // }
        // System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println();
    }
    

}
