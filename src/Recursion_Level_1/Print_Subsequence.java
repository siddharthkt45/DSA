// Here, in this question, we're given a string and
// we've to print all the possible subsequences of that string.
// We don't have to store them, as it takes too much space.

package Recursion_Level_1;

import java.util.*;

public class Print_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:- ");
        String str = sc.nextLine();
        System.out.println("The subsequences possible are:- ");
        printSubsequence(str, "");
    }

    private static void printSubsequence(String ques, String ans) {
        if (ques.length() == 0) {       // Base case, when ques.length becomes 0
            System.out.println(ans);    // print the answer
            return;                     // and return
        }

        char ch = ques.charAt(0);       // Take out the first char from the main string
        String roq = ques.substring(1); // Take out the rest of string from the main string

        printSubsequence(roq, ans + ch);    // Make the call to next level & add ch to it
        printSubsequence(roq, ans + "");    // Make the call to next level & add "" to it
    }
}