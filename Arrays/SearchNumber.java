import java.util.Scanner;

public class SearchNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int x = sc.nextInt();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                System.out.println("Index of number "+arr[i]+" is "+i);
                break;
            }
            else{
                System.out.println(-1);
                break;
            }
        }
    }
}l0p-  







+
70p