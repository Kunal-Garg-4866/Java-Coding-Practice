import java.util.ArrayList;
import java.util.Collections; // in build reverse method
public class Sorting {

    public static void reverseList(ArrayList<Integer> list) {
        int i = 0 , j = list.size() - 1;

        while (i<j){
            /*
             int temp = a;
             a =b ;
             b=temp;
             */
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List : " + list);
        Collections.sort(list); // in build sorting  method
        System.out.println("Ascending Order List : " + list);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println("Descending Order List : " + list);


    }
}
