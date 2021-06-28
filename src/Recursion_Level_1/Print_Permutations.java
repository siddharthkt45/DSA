// Here, in this question, we're given a string and
// we've to print all the permutations of that string.

package Recursion_Level_1;

import java.util.Scanner;

public class Print_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:- ");
        String str = sc.nextLine();
        System.out.println("All the permutations possible for the string are:- ");
        printPermutations(str, "");
    }

    private static void printPermutations(String ques, String ans) {
        if (ques.length() == 0) {       // Base case, when ques.length() == 0
            System.out.println(ans);    // print the answer and
            return;                     // return
        }

        for (int i = 0; i < ques.length(); i++) {   // iterate over ques.length()
            char ch = ques.charAt(i);               // Take out the ith character
            String leftPart = ques.substring(0, i); // Take out the substring on left of ith char
            String rightPart = ques.substring(i + 1);// Take out the substring on right of ith ch
            String roq = leftPart + rightPart;      // concat both the strings & store in roq var
            printPermutations(roq, ans + ch);   // Make the call for roq & add ch to answer
        }
    }
}