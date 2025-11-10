package Backtracking;

import java.util.Scanner;

public class RatInDeadMaze {
       public static void print(int sr, int sc , int er , int ec , String s){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
       
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        

        //go rigth 
        print(sr,sc+1,er,ec,s+"R");
        // go dowm
      


    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int rows = 4;
        int cols = 6;
         print(1,1,rows,cols,"");
    
        sc.close();
    }
    }
    

