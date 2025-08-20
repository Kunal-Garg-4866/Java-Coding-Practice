package Practice;
import java.util.Scanner;

public class TwoSwapped {
    static void display(int[] arr) {
       for(int val: arr){
        System.out.print(val + " ");
       } 
    }
    static void swap( int [] arr,int x , int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y] = temp;
    }
    static void sortarray(int [] arr){
        int n = arr.length;
        int x = -1;
        int y=-1;

        //process all adjacent element
        for (int i =1;i<n;i++){
            if(arr[i-1] > arr[i]){
                if(x == -1){
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
        }
        if(x!=-1 && y!=-1){
        swap(arr,x,y);
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the element of array:");
        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        sortarray(arr);
        display(arr);
        sc.close();
    }


    
}
