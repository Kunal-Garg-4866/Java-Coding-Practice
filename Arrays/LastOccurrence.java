

import java.util.Scanner;

public class LastOccurrence{
    public static void LastOccurrence(int[] arr,int x){
       int last = -1;
         
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                last = i;
            }
        }
        System.out.println("Last occurence of "+x+" is "+last);
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element:");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be Count: ");
        int x =  sc.nextInt();
        
       LastOccurrence(arr,x);


    }
}

