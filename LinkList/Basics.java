package LinkList;

public class Basics {
    public  static class Node{
        int data ; // value 
        Node next; // address of next node
        Node(int data){
            this.data = data;

        }
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
        System.out.println(a.data); // 5
        System.out.println(a.next.data); // 9
 
    }

    
}
