// Here, in this question, we're given a number and
// we've to print all the numbers starting from 1 to the given number in increasing order.
// We've to use recursive approach and NOT iterative.

package Recursion_Level_1;

import java.util.Scanner;

public class Print_Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        printIncreasing(n);
    }

    private static void printIncreasing(int n) {
        if (n == 0) {               // Base case, if n becomes 0,
            return;                 // return
        }
        printIncreasing(n - 1);     // First make the call to n - 1 (Expectation)
        System.out.println(n);         // the print n
    }
}