import java.util.Scanner;

public class Transpose {
      static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] findtranspose(int[][] a , int r , int c){
        int[][] ans = new int [c][r];

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j] = a[j][i];
                
            }
        }
        return ans;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();
        int [][] a = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
    sc.close();
    findtranspose(a,r,c);
    int[][] ans = findtranspose(a,r,c);
    printArray(ans);

}

}
