// Here, in this question, we're given a number and
// we've to print all the numbers starting from the given number to 1 in decreasing order.
// We've to use recursive approach and NOT iterative.

package Recursion_Level_1;

import java.util.Scanner;

public class Print_Decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        printDecreasing(n);
    }

    private static void printDecreasing(int n) {
        if (n == 0) {               // Base case, if n becomes zero,
            return;                 // return
        }
        System.out.println(n);      // First print n,
        printDecreasing(n - 1);  // then make the call to n - 1 (Expectation)
    }
}