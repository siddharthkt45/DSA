// The pattern to be printed is:
//          *
//          *   *
//  *   *   *   *   *
//          *   *
//          *
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines (must be odd) you want to print in this type of pattern");
        int n = sc.nextInt();
    
        if (n % 2 == 0)             // n must be an odd number
            return;
        
        int sp = n / 2;             // sp = spaces, which is half the number of lines for all rows
        int st = 1;                 // st = strings, starting from 1
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                if (i == (n / 2) + 1) {                 // if its the middle line, print extra stars
                    System.out.print("*\t");
                } else {                                // else, print spaces
                    System.out.print("\t");
                }
            }
            
            for (int j = 1; j <= st; j++) {         // then print the stars according to the st variable
                System.out.print("*\t");
            }
            
            if (i <= n / 2) {                       // if i is in the upper row half,
                st++;                               // increment st by 1
            } else {                                // if i is in the lower row half,
                st--;                               // decrement st by 1
            }
            
            System.out.println();                   // change line
        }
    }
}