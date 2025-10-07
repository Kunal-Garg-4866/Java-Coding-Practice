package Practice;
import java.util.Scanner;

public class LexicographicalOrder {
    static void sortFruits(String[] fruits){
        int n = fruits.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j =i+1;j<n;j++){
                if(fruits[j].compareTo(fruits[min_index])< 0){
                    min_index = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] fruits = new String[n];
        for(int i = 0; i < n; i++) {
            fruits[i] = sc.next();
            }
            sortFruits(fruits);
            for(String s : fruits) {
                System.out.println(s);
                }
        sc.close();
    }
    
}
