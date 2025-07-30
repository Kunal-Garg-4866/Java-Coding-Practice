// import java.util.Scanner;


// public class AlphabetSquare{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int m= sc.nextInt();

//         for( int i=1;i<=m;i++){
//             for(int j=1;j<=m;j++){
//                 System.out.print((char)(j+64) +" " );
//             }
//             System.out.println();
//         }
    
//     }
// } 



/// Something different

import java.util.Scanner;


public class AlphabetSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int m= sc.nextInt();

        for( int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                System.out.print((char)(i+64) +" " );
            }
            System.out.println();
        }
        sc.close();
        
    
    }
} 