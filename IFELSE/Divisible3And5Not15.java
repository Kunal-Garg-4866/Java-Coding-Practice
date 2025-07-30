import java.util.Scanner;

public class Divisible3And5Not15{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the  number: ");
        int n = input.nextInt();
       if(n%3==0 || n%5==0){
        if(n%15!=0){
            System.out.println(n+" is divisible by 3 and 5 but not 15");
        }
        else{
            System.out.println(n+" is divisible by 3 and 5 and 15");
        }
       }
        
        input.close();

    }
}