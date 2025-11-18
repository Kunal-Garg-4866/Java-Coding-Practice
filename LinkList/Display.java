package LinkList;

public class Display {
    // print with function  
    public static void display(Node head){
        Node  temp = head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static class Node
{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}    public static void main(String[] args) {
     Node a = new Node(5);
        Node b = new Node(9);
        Node c = new Node(4);
        Node d = new Node(6);
        Node e = new Node(2);
        // linking nodes  5  9 4 6 2 
        a.next = b; //  5 -> 9 4 6 2
        b.next = c; // 5 -> 9 -> 4 6 2
        c.next = d; // 5 -> 9 -> 4 -> 6 2
        d.next = e; // 5 -> 9 -> 4 -> 6 -> 2
        e.next = null;

        // display linked list in correct format
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        // better approach using loop
        // Node temp = a;
        // for(int i=1;i<=5;i++){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // } 
        // while(temp != null){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }
        display(a);

        
    }
    
}
