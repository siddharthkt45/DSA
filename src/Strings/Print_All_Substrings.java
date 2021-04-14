package Strings;

import java.util.Scanner;

public class Print_All_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String s = sc.nextLine();
        int n = s.length();
        
        printAllSubstrings(s, n);
    }
    
    private static void printAllSubstrings(String s, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}