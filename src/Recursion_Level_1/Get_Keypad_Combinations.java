// Here, in this question, we're given a keypad code and its reference and
// we've to return all the keypad combinations that are possible
// using the given keypad code in an arraylist.

package Recursion_Level_1;

import java.util.*;

public class Get_Keypad_Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the keypad code:- ");
        String str = sc.nextLine();
        System.out.println("The keypad combinations possible are:- ");
        System.out.println(getKeypadCombinations(str));
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    private static ArrayList<String> getKeypadCombinations(String str) {
        if (str.length() == 0) {    // Base case, if length of str becomes 0
            ArrayList<String> baseResult = new ArrayList<>();   // create a new arraylist
            baseResult.add("");     // add an empty string to the arraylist
            return baseResult;      // return the arraylist
        }

        char ch = str.charAt(0);        // Take out the first character from the main string
        String ros = str.substring(1);  // Take out the rest of string from the main string

        String codeforch = codes[ch - '0']; // Take out the corresponding codes for the char

        ArrayList<String> recResult = getKeypadCombinations(ros);    // Make the call for ros
        ArrayList<String> myResult = new ArrayList<>();     // create a new arraylist

        for (int i = 0; i < codeforch.length(); i++) {  // iterate over codeforch.length()
            char chcode = codeforch.charAt(i);  // Take out the ith character from codeforch
            for (String rstr : recResult) {     // iterate over the recResult arraylist
                myResult.add(chcode + rstr);    // add the stored char to all the elements
            }
        }

        return myResult;        // return the resultant list
    }
}