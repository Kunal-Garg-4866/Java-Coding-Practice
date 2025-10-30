
package Backtracking;
import java.util.Scanner;

public class RatInMaze 

{
    public static int maze(int sr , int sc , int er , int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;


        int downWays = maze(sr+1,sc,er,ec);
        int rigthWays = maze(sr,sc+1,er,ec);

        int totalways = downWays + rigthWays; 
        return totalways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int count = maze(1,1,rows,cols);
        System.out.println(count);
        sc.close();

    }
    
}
