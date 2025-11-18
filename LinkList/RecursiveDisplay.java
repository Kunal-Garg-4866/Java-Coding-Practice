package LinkList;

public class RecursiveDisplay {
    // public  static void display(Node head){
    //     if(head==null) return;
    //     System.out.print(head.data+" ");
    //     display(head.next);
           


    // }
    public  static int length(Node head){
       int count = 0;
       while (head!=null){
        count++;
        head = head.next;
       }
       return count;
    }
public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    public static void main(String[] args) {
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
      //  display(a); 
        System.out.println(length(a));
    }
    
}
}
