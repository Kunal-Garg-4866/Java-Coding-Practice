import java.util.Scanner;

public class ProfitLoss{
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the cost price of the item:");
        int CP = input.nextInt();
        System.out.print("Enter the selling price of the item:");
        int SP = input.nextInt();
        int profit = SP - CP;
        if(SP>CP){
            System.out.println("Profit is: "+profit);

        }
        else{
            System.out.println("Loss is: "+profit);
        }
        
    }

}