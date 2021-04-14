package Strings;

import java.util.Scanner;

public class Palindromic_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
    
        System.out.println(isPalindrome(s));
    }
    
    private static boolean isPalindrome(String s) {
/*
        This code uses extra memory as StringBuilder is used.
        
        StringBuilder rev = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        
        return s.equals(rev.toString());
*/
    
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