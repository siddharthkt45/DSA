// The number of lines given in this pattern will always be odd.
// The pattern to be printed is:
//          1
//      2   3   2
//  3   4   5   4   3
//      2   3   2
//          1
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines (must be odd) you want to print in this type of pattern");
        int n = sc.nextInt();
        
        if (n % 2 == 0)                     // n must be an odd number
            return;
        
        int sp = n / 2;             // sp = spaces
        int st = 1;                 // st = strings
        int val = 1;                // val = variable for increment and decrement of row number
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            
            int cval = val;                     // cval = current value which changes the value on the basis of columns
            for (int j = 1; j <= st; j++) {
                System.out.print(cval + "\t");
                
                if (j <= st / 2) {              // if j is on the left column half,
                    cval++;                     // increment cval by 1
                } else {                        // if j is on the right column half,
                    cval--;                     // decrement cval by 1
                }
            }
            
            if (i <= n / 2) {                   // if i is on the upper row half,
                sp--;                           // decrement sp by 1,
                st += 2;                        // increment st by 2,
                val++;                          // increment val by 1
            } else {                            // if i is on the lower row half,
                sp++;                           // increment sp by 1,
                st -= 2;                        // decrement st by 2,
                val--;                          // decrement val by 1
            }
    
            System.out.println();               // change line
        }
    }
}