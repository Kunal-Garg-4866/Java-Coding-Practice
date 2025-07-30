

import java.util.Scanner;

public class NumberOfOccurence{
    public static void countOccurrence(int[] arr,int x){
        int count = 0;
         
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println("Number of occurrence of "+x+" is "+count);
    
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
        

        
       System.out.println("Count is: ");
       countOccurrence(arr,x);


    }
}

