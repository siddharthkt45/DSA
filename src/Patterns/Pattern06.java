// The number of lines given in this pattern will always be odd.
// The pattern to be printed is:
//  *   *   *       *   *   *
//  *   *               *   *
//  *                       *
//  *   *               *   *
//  *   *   *       *   *   *
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines (must be odd) you want to print in this type of pattern");
        int n = sc.nextInt();
    
        if (n % 2 == 0)             // n must be an odd number
            return;
        
        int sp = 1;                 // sp = spaces
        int st = n / 2 + 1;         // st = stars
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {         // print the stars till the st variable value
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {         // print the spaces till the sp variable value
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {         // again print the stars till the st variable value
                System.out.print("*\t");
            }
            
            if (i <= n / 2) {                       // if the value of i is less than mid line value,
                st--;                               // stars decrease by one and
                sp += 2;                            // spaces increase by two
            } else {                                // else if the value of i is more than mid line value,
                st++;                               // stars increase by one and
                sp -= 2;                            // spaces decrease by two
            }
    
            System.out.println();
        }
    }
}