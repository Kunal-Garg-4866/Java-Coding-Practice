
import java.util.Scanner;


class CountSort{
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
        int max = findMax(arr);
        int [] count = new int[max+1];
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();}
        BasicCountsort(arr);
        display(arr);

        sc.close();
    }
}