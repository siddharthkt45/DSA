package Strings.StringBuilder;

import java.util.Scanner;

public class ASCII_Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    
        System.out.println(asciiDifference(s));
    }
    
    private static String asciiDifference(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            
            int diff = curr - prev;
            sb.append(diff);
            sb.append(curr);
        }
        
        return sb.toString();
    }
}