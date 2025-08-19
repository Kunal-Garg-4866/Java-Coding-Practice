 import java.util.Scanner;

public class Radix {
    static void display(int [] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i =0 ; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void BasicCountsort(int [] arr){ // 2 4 2 2 
        int n = arr.length;
        int max = findMax(arr);
        int [] count = new int[n];
        for(int i=0;i<arr.length;i++){
            /* 
           // freqency    0 0 3 0  1
           // index       0 1 2 3 4
             */
            count[arr[i]]++;

        }
        int k=0;
        for(int i=0;i<count.length;i++){ // 0 2 0 3 1 2 
            for(int j = 0;j< count[i] ;j++){
                arr[k++]=i;
            }
        }
       

    }
    static void Radixsort(int [] arr){
        int max = findMax(arr);

        for(int place = 1; max/place > 0; place += 10){
            countsort(arr,place); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }




    
}
