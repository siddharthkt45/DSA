// Here, in this question, we're given the number of stairs and
// we can climb down either 1 or 2 or 3 steps at once.
// We have to print all the paths formed by these combinations.

package Recursion_Level_1;

import java.util.Scanner;

public class Print_Stairs_Paths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs:- ");
        int n = sc.nextInt();
        System.out.println("The stairs paths possible are:- ");
        printStairsPaths(n, "");
    }

    private static void printStairsPaths(int n, String ans) {
        if (n == 0) {                   // Base case, when n becomes 0
            System.out.println(ans);    // print the answer
            return;                     // return
        } else if (n < 0) {         // else, when n becomes less than 0
            return;                 // return because no possible solution
        }

        printStairsPaths(n - 1, ans + "1");     // Make the call to n - 1 & add "1" to ans
        printStairsPaths(n - 2, ans + "2");     // Make the call to n - 2 & add "2" to ans
        printStairsPaths(n - 3, ans + "3");     // Make the call to n - 3 & add "3" to ans
    }
}