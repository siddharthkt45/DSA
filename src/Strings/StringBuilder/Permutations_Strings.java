package Strings.StringBuilder;

import java.util.Scanner;

public class Permutations_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:- ");
        String s = sc.nextLine();
        permutationsOfString(s);
    }
    
    private static void permutationsOfString(String s) {
        int n = s.length();
        int fact = factorial(n);
        
        for (int i = 0; i < fact; i++) {
            StringBuilder sb = new StringBuilder(s);
            int temp = i;
            
            for (int div = n; div >= 1; div--) {
                int q = temp / div;
                int r = temp % div;
    
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                
                temp = q;
            }
    
            System.out.println();
        }
    }
    
    private static int factorial(int n) {
        int fact = 1;
        
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        
        return fact;
    }
}