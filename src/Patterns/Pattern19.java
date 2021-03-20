// The number of lines given in this pattern will always be odd.
// The pattern to be printed is:
//  *   *   *       *
//          *       *
//  *   *   *   *   *
//  *       *
//  *       *   *   *
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines (must be odd) you want to print in this type of pattern");
        int n = sc.nextInt();
    
        if (n % 2 == 0)             // n must be an odd number
            return;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {                               // if its the first row
                    if (j == n || j <= n / 2 + 1) {         // print when its the last column or
                        System.out.print("*\t");            // when its a column before or equal to the mid column
                    } else {
                        System.out.print("\t");             // else, we have to print spaces
                    }
                } else if (i <= n / 2) {                    // if its any row before or equal to the mid row
                    if (j == n || j == n / 2 + 1) {         // print when its the last column or
                        System.out.print("*\t");            // when its the mid column
                    } else {
                        System.out.print("\t");             // else print spaces
                    }
                } else if (i == n / 2 + 1) {                // if its the mid row
                    System.out.print("*\t");                // print stars equal to the number of lines given
                } else if (i < n) {                         // if its any row after the mid row and before the last row
                    if (j == 1 || j == n / 2 + 1) {         // print when its the first column or
                        System.out.print("*\t");            // when its the mid column
                    } else {
                        System.out.print("\t");             // else print spaces
                    }
                } else {                                    // else if its the last row
                    if (j == 1 || j >= n / 2 + 1) {         // print when its the first column or
                        System.out.print("*\t");            // when its a column greater than or equal to the mid column
                    } else {
                        System.out.print("\t");             // else print spaces
                    }
                }
            }
    
            System.out.println();               // change line
        }
    }
}