package Backtracking;
import java.util.Scanner;

public class FourDirectionMaze {
     public static void print(int sr, int sc , int er , int ec , String s,boolean[][] isvisited){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isvisited[sr][sc]==true) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isvisited[sr][sc] = true;
        //go rigth 
        print(sr,sc+1,er,ec,s+"R",isvisited);
        // go dowm
        print(sr+1,sc,er,ec,s+"D",isvisited);
        // go left 
        print(sr,sc-1,er,ec,s+"L",isvisited);
        // go up
        print(sr-1,sc,er,ec,s+"U",isvisited);
        // backtracking
        isvisited[sr][sc] = false;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int rows = sc.nextInt();
        int cols = sc.nextInt();
        boolean [][] isvisited = new boolean[rows][cols];
         print(0,0,rows-1,cols-1,"",isvisited);
       
        sc.close();
    }
    
}
