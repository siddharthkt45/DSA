// Here, in this question, we're given a string and
// we've to return all the subsequences of the string in an arraylist.
// A subsequence is when you return all the possible combinations of
// the characters of the string without changing the actual order of characters.

package Recursion_Level_1;

import java.util.*;

public class Get_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:- ");
        String str = sc.nextLine();
        System.out.println("The subsequences possible are:- ");
        System.out.println(getSubsequence(str));
    }

    private static ArrayList<String> getSubsequence(String str) {
        if (str.length() == 0) {    // Base case, if str becomes of 0 length
            ArrayList<String> baseResult = new ArrayList<>();   // create a new arraylist
            baseResult.add("");     // add an empty string to it
            return baseResult;      // return the arraylist
        }

        char ch = str.charAt(0);    // Take out the first char from the string
        String ros = str.substring(1);  // Take out the rest of string from the main string

        ArrayList<String> recResult = getSubsequence(ros);  // Make a call for rest of string
        ArrayList<String> myResult = new ArrayList<>();     // create a new arraylist

        for (String i : recResult) {    // iterate over the recursive result arraylist
            myResult.add("" + i);       // first add an empty string to each element
            myResult.add(ch + i);       // then add the ch taken out at first to each string
        }

        return myResult;    // return the resultant arraylist
    }
}