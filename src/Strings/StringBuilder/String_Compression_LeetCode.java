package Strings.StringBuilder;

import java.util.Scanner;

public class String_Compression_LeetCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        
        int count = 1;
        
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            
            if (curr != prev) {
                sb.append(prev);
                if (count > 1) {
                    sb.append(count);
                    count = 1;
                }
            } else {
                count++;
            }
        }
        
        sb.append(s.charAt(s.length()-1));
        if (count > 1)
            sb.append(count);
    
        System.out.println(sb);
    }
}