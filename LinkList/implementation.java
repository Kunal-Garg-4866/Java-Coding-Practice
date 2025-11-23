package LinkList;


public class implementation {
    
    public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
    public static class linklist{
        Node head = null;
        Node tail = null;
        int size =0;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
               
            }
            else{
                tail.next = temp;
                
            }
            tail = temp;
            size++;

        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp; 
                tail = temp;
            }
            else{ // Non Empty list
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx , int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("Invalid Index");
                return;
            }   
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;

        }
        int  GetAtElement(int idx){
               if(idx<0 || idx>size){
                System.out.println("Invalid Index");
                return -1;
            }   
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            
            if(idx==0){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
        void display(){
            Node temp = head ;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();

        }
        // NOT REQUIRED AS WE HAVE SIZE VARIABLE it tales 0(n) time
        // int size(){ // 
        //     Node temp = head;
        //     int count = 0;
        //     while (temp!=null){
        //         count ++;
        //         temp=temp.next;
        //     }
        //     return count;
        // }
    }
    public static void main(String[] args) {
         linklist ll = new linklist();
         ll.insertAtEnd(4);
         ll.display();
         ll.insertAtEnd(7);
         ll.display();
         ll.insertAtHead(2);
         ll.display();
         ll.insertAtHead(7);
         ll.display();
         ll.insertAt(2   , 5);
         ll.display();
         ll.insertAt(5,6);
         ll.display();
         System.out.println(ll.tail.data);
         ll.insertAt(0,100);
         ll.display();
         System.out.println(ll.GetAtElement(3));
         ll.deleteAt(0);
         ll.display();


         
         // System.out.println(ll.size);
        
    }
    
}
