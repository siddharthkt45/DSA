// Here, in this question, we're given a number and
// we've to print all the numbers starting from the given number to 1 in decreasing order &
// and then from 1 to the given number in increasing order.
// We've to use recursive approach and NOT iterative.

package Recursion_Level_1;

import java.util.Scanner;

public class Print_Decreasing_Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        pdi(n);
    }

    private static void pdi(int n) {
        if (n == 0) {           // Base case, if n becomes 0,
            return;             // return
        }
        System.out.println(n);  // Firstly, print n for decreasing order,
        pdi(n - 1);          // then make the call to n - 1 (Expectation)
        System.out.println(n);  // then, again print n for increasing order
    }
}