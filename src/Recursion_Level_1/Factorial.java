// Here, in this question, we're given a number and
// we've to calculate the factorial of the number using recursion.

package Recursion_Level_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println("Factorial:- " + factorial);
    }

    private static int factorial(int n) {
        if (n == 0) {                   // Base case, if n becomes 0,
            return 1;                   // return 1
        }
        return n * factorial(n - 1);    // Make the call for n - 1 after multiplying to n
    }
}