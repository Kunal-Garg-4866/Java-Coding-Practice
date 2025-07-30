class Node {
    int data; 
    Node next; 

    public Node(int data) {
        this.data = data;
        this.next = null; 
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        // Create three nodes
        Node n1 = new Node(1); 
        Node n2 = new Node(2); 
        Node n3 = new Node(3); 

        
        n1.next = n2; 
        n2.next = n3; 
        n3.next = null; 

        
        Node current = n1;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; 
        }
        System.out.println("null"); 
    
    }
}