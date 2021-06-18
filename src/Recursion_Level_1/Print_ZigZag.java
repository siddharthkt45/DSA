// Here, in this question, we're given a number and
// we've to make recursive calls to print it in zigzag order.

package Recursion_Level_1;

import java.util.Scanner;

public class Print_ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        pzz(n);
    }

    private static void pzz(int n) {
        if (n == 0) {               // Base case, if n becomes 0,
            return;                 // return
        }
        System.out.println("Pre:- " + n);   // Pre is the area before the first call, print it
        pzz(n - 1);                     // Make the call to n - 1
        System.out.println("In:- " + n);    // In is the area before the first call, print it
        pzz(n - 1);                     // Make the call to n - 1
        System.out.println("Post:- " + n);  // Post is the area before the first call, print it
    }
}