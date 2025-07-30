import java.util.Scanner;

public class Even1ToN{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
                
            }
            
        }
        }
    }


import java.util.Scanner;

public class Even1ToN{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        for(int i=2;i<=n;i+=2){
           
                System.out.println(i);
                
            
            
        }
        }
    }
