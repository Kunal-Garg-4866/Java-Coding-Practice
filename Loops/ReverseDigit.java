// import java.util.Scanner;

// public class  ReverseDigit{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = input.nextInt();
//         int reverse = 0;
//         int sum = 0;
//         while(n!=0){ 
//         int l = n%10;
       
//         reverse = reverse*10 + l;
//         n = n/10;
 
//         }
//         System.out.println("  reverse of digits is: "+reverse);
        
//     }
// }
import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class ReverseDigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while(n!=0){
            int l = n%10;
            reverse = reverse*10+l;
            n=n/10;
            
        }
        System.out.println(reverse);
        if(original==reverse){
            System.out.println("Equal");
        }
        else{
            System.out.print("Not Equal");
        }
    }
}