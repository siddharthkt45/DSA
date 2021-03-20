// The number of lines given in this pattern will always be odd.
// The pattern to be printed is:
//  *   *   *   *   *
//      *       *
//          *
//      *   *   *
//  *   *   *   *   *
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines (must be odd) you want to print in this type of pattern");
        int n = sc.nextInt();
    
        if (n % 2 == 0)             // n must be an odd number
            return;
        
        int sp = 0;             // sp = spaces, starting from 0
        int st = n;             // st = strings, starting from n
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < st) {       // condition to make the upper half hollow
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            
            if (i <= n / 2) {               // if i is in the upper half rows,
                st -= 2;                    // decrement st by 2 and
                sp++;                       // increment sp by 1
            } else {                        // else if i is in the lower half rows,
                st += 2;                    // increment st by 2 and
                sp--;                       // decrement sp by 1
            }
    
            System.out.println();           // change line
        }
    }
}