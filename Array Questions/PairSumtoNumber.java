import java.util.Scanner;
    public class PairSumtoNumber{
    public static int pairsum(int arr[],int x){
        int n = arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    ans++;
                  
        }
            }
            
    }
    return ans;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter the Target:");
        int x = sc.nextInt();
        System.out.println("Total number of pair are : "+pairsum(arr,x));
        sc.close();
        
    }
}