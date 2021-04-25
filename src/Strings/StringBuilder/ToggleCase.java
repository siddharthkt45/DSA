package Strings.StringBuilder;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:- ");
        String s = sc.nextLine();
    
        System.out.println(toggleCase(s));
    }
    
    private static String toggleCase(String s) {
        StringBuilder sb = new StringBuilder(s);
    
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                sb.setCharAt(i, (char) (ch + 'a' - 'A'));
            else if (ch >= 'a' && ch <= 'z')
                sb.setCharAt(i, (char) (ch + 'A' - 'a'));
        }
    
        return sb.toString();
    }
}