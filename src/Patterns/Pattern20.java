// The number of lines given in this pattern will always be odd.
// The pattern to be printed is:
//  *               *
//  *               *
//  *       *       *
//  *   *       *   *
//  *               *
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines (must be odd) you want to print in this type of pattern");
        int n = sc.nextInt();
    
        if (n % 2 == 0)             // n must be an odd number
            return;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {                 // if its the first or last row, print stars
                    System.out.print("*\t");
                } else if (i > n / 2 && (i == j || i + j == n + 1)) {       // if its the lower half of rows and
                    System.out.print("*\t");                                // diagonals, print stars
                } else {                            // else print spaces
                    System.out.print("\t");
                }
            }
    
            System.out.println();               // change line
        }
    }
}