import java.util.Scanner;

public class Multiplication {
    static void multiplication(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible");
            return;
        }

        int[][] ans = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        printmatrix(ans);
    }

    static void printmatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first matrix
        System.out.println("Enter rows and columns for the first matrix:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter rows and columns for the second matrix:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Result of matrix multiplication:");
        multiplication(a, r1, c1, b, r2, c2);
        sc.close();
    }
}
