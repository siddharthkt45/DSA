package Strings;

import java.util.Scanner;

public class Palindrome_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int n = s.length();
    
        System.out.println(isPalindrome(s, n));
    }
    
    private static boolean isPalindrome(String s, int n) {
        StringBuilder rev = new StringBuilder();
        for (int i = n-1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
    
        return s.equals(rev.toString());
    }
}