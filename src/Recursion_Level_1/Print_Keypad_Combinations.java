// Here, in this question, we're given a keypad code and its reference and
// we've to print all the keypad combinations that are possible
// using the given keypad code.

package Recursion_Level_1;

import java.util.Scanner;

public class Print_Keypad_Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the keypad code:- ");
        String str = sc.nextLine();
        System.out.println("The keypad combinations possible are:- ");
        printKeypadCombinations(str, "");
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    private static void printKeypadCombinations(String ques, String ans) {
        if (ques.length() == 0) {       // Base case, when the length of ques becomes 0
            System.out.println(ans);    // print the answer and
            return;                     // return
        }

        char ch = ques.charAt(0);       // Take out the first character from the main string
        String roq = ques.substring(1); // Take out the rest of string from the main string

        String codeforch = codes[ch - '0']; // Take out the corresponding codes for the char

        for (int i = 0; i < codeforch.length(); i++) {  // iterate over codeforch.length()
            char chcode = codeforch.charAt(i);  // Take out the ith char from codeforch

            printKeypadCombinations(roq, ans + chcode); // Make the call for roq &
        }                                                    // ans + chcode
    }
}