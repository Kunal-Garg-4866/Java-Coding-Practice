package LinkList;

public class reverseList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static Node reverse(Node head){
        if(head.next==null) return head;
        Node newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;

    }
    // public static void displayreverse(Node head){
    //     if(head==null){ // base case 
    //         return;
    //     }
    //     displayreverse(head.next); // recursive call
    //     System.out.print(head.val + " "); // work                  
    //    // display(head.next);
    // }
    public static void display(Node head){
        if(head==null){
            System.out.println();
            return;
        }
        System.out.print(head.val + " ");
        display(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);   
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        display(a);
        a = reverse(a);
        display(a);
    }
    
}
