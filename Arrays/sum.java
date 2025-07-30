import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr =  {1,4,5,6,1};
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}