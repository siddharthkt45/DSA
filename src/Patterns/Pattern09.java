// The pattern to be printed is:
//  *               *
//      *       *
//          *
//      *       *
//  *               *
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines (must be odd) you want to print in this type of pattern");
        int n = sc.nextInt();
    
        if (n % 2 == 0)                     // n must be an odd number
            return;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}