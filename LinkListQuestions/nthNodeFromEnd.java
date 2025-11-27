package LinkListQuestions;

public class nthNodeFromEnd {
    public static Node nthNode(Node head , int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size-n+1;
        // mth node from start
        for(int i=1;i<=m-1;i++){
            head = head.next;
        }
        return head;
    }
    // better approch in just one triversal 
    public static Node nthNode2(Node head ,  int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
          slow = slow.next;
          fast = fast.next;  
        }
        return slow;
    }
    public static Node deleteNthFromEnd(Node head, int n) {
    Node slow = head;
    Node fast = head;

    // Move fast n steps
    for (int i = 1; i <= n; i++) {
        fast = fast.next;

        // If fast becomes null, delete the head
        if (fast == null) {
             head=head.next; 
             return head;
        }
    }

    // Move both until fast reaches last node
    while (fast.next != null) {
        slow = slow.next;
        fast = fast.next;
    }

    // Delete slow.next
    slow.next = slow.next.next;

    return head;
}

    public static void display(Node head){
        Node temp = head ;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        // linking nodes
        a.next = b; // 100 -> 13 4 5 12 10
        b.next = c; // 100 -> 13 -> 4 5 12 10
        c.next = d; // 100 -> 13 -> 4 -> 5 12 10
        d.next = e; // 100 -> 13 -> 4 -> 5 ->
        e.next = f; // 100 -> 13 -> 4 -> 5 -> 12 -> 10
        // Node temp = nthNode2(a,2);
        // System.out.println(temp.data);
        display(a);
      a=   deleteNthFromEnd(a,6);
        display(a);
        
    
    }
    
}
