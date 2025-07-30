import java.util.Scanner;

public class FirstRepeater{
    static int Repeater(int [] arr){
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
               
    }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int n = sc.nextInt();

         int [] arr = new int[n];
        System.out.println("Ente the element of array:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(" First Repeater is: "+ Repeater(arr));
    }
}