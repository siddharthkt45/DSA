package Strings;

import java.util.Scanner;

public class Palindromic_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        
        palindromicSubstring(s);
    }
    
    private static void palindromicSubstring(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j))) {          // if the substring is a palindrome,
                    System.out.println(s.substring(i, j));      // then print the string
                }
            }
        }
    }
    
    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        
        while (i <= j) {                            // Here, we use the Two-Pointer method to compare the characters
            if (s.charAt(i) == s.charAt(j)) {       // from both sides of the string. If equal,
                i++;                                // then increment the first and
                j--;                                // decrement the second pointer
            } else {                        // if NOT equal,
                return false;               // return false
            }
        }
        
        return true;                // else, return true
    }
}