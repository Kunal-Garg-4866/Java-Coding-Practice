import java.util.ArrayList;
public class wrapper2 {
    public static void main(String[] args) {
    //     Integer i = Integer.valueOf(4);
    //     System.out.println(i);
    // }

    // Syntax of Aarray list

    ArrayList <Integer> l1 = new ArrayList<>();

    // add new element 
    l1.add(5); //5
    l1.add(10); //5 10
    l1.add(6); // 5 10 6 
    l1.add(7); // 5 10 6 7

    // get an element at index i 
    System.out.println(l1.get(1));

    // print with loop 
    for(int i=0;i < l1.size();i++){
        System.out.println(l1.get(i));
    }

    // printing ARRAYLIST Directly 
    System.out.println(l1);


    // addding element at some index i // [5 100 10 6 7]
    l1.add(1,100);
    System.out.println(l1);

    // modifying element atondex i
    l1.set(2,9);
    System.out.println(l1);
    
    //removing an element at index i
    l1.remove(1);
    System.out.println(l1); // 5 9 6 7 

    // remove element e 
    l1.remove(Integer.valueOf(7));
    System.out.println(l1); // 5 9 6

    // checking if an element exist 
    boolean ans = l1.contains(Integer.valueOf(60));
    System.out.println(ans);

    // if you don't specify class , you can put anything inside l 
    // ArrayList l = new ArrayList();
    // l.add("kunal");
    // l.add(10);
    // l.add("true");
    // System.out.println(l);
}
}
