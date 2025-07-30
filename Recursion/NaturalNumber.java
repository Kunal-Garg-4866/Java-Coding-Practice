package Recursion;


import java.util.Scanner; // This import is crucial and present

public class NaturalNumber {

    // Recursive method to print numbers from 1 to n in increasing order
    static void printIncreasing(int n) {
        // Base case: When n becomes 1, print it and stop
        if (n == 1) {
            System.out.println(n);
            return; // Exit the current recursive call
        }
        // Recursive step: Call printIncreasing for n-1
        // This ensures numbers 1 to n-1 are printed first
        printIncreasing(n - 1);

        // After the recursive call returns (meaning 1 to n-1 are printed),
        // print the current value of n
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        System.out.print("Enter a positive integer: "); // Prompt the user for input
        int n = sc.nextInt(); // Read the integer input from the user

        // Call the recursive method to print numbers
        printIncreasing(n);

        sc.close(); // Close the scanner to release system resources
    }
}