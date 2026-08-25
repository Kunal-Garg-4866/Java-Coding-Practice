package Stacks;

public class LinklistImplementation {
    public static class Node{ // use defiined data type 
        int val;
        Node next;
        Node(int val){
            this.val = val;

        }

    }
    public static class Stack{ // user defined data strucuture 
    private Node head = null;
      private   int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
               
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;

        }
        int peek(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val + " ");
        }
        void display(){
            displayrec(head);
            System.out.println();

        }
        void displayres(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.val + "");
            }
         System.out.println();
        }
        int size(){ // getter method
            return size;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
    }
}
