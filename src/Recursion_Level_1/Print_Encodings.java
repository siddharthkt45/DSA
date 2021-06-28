// Here, in this question, we're given a string consisting of numbers and
// each number is encoded to its alphabetic counterpart.
// We can either take single digit or double digit into account
// provided that they are smaller than 26.
// We've to print all such encodings possible.

package Recursion_Level_1;

import java.util.Scanner;

public class Print_Encodings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:- ");
        String str = sc.nextLine();
        System.out.println("The encodings possible are:- ");
        printEncodings(str, "");
    }

    private static void printEncodings(String ques, String ans) {
        if (ques.length() == 0) {       // Base case, when ques.length() == 0
            System.out.println(ans);    // print the answer
        } else if (ques.length() == 1) {    // else, when ques.length() == 1
            char ch = ques.charAt(0);       // Take out the first character from main string

            if (ch != '0') {                // if ch != '0'
                int chv = ch - '0';         // convert the char into integer
                char code = (char) ('a' + chv - 1); // convert the int into corresponding code
                System.out.println(ans + code);     // add to code to the answer and print it
            }
        } else {                            // else
            char ch = ques.charAt(0);       // Take out the first character from the main string
            String roq = ques.substring(1); // Take out the rest of string from the main string

            if (ch == '0') {                // it ch == '0'
                return;                     // return
            } else {                        // else
                int chv = ch - '0';         // convert the char into integer
                char code = (char) ('a' + chv - 1); // convert the int into corresponding code
                printEncodings(roq, ans + code);    // Make the call to roq & add code to ans
            }

            String ch12 = ques.substring(0, 2); // Take out the first 2 char from the main string
            String roq12 = ques.substring(2); // Take out the rest of string from the main string

            int ch12v = Integer.parseInt(ch12); // convert the string into integer

            if (ch12v <= 26) {                         // if the value of char <= 26
                char code = (char) ('a' + ch12v - 1);  // convert the int into corresponding code
                printEncodings(roq12, ans + code);  // Make the call to roq & add code to ans
            }
        }
    }
}