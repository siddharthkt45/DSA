// The number of lines given in this pattern will always be odd.
// The pattern to be printed is:
//          *
//      *   *   *
//  *   *   *   *   *
//      *   *   *
//          *
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines (must be odd) you want to print in this type of pattern");
        int n = sc.nextInt();
    
        if (n % 2 == 0)         // n must be an odd number
            return;
        
        int sp = n / 2;         // sp = spaces
        int st = 1;             // st = string
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {         // print the spaces till the sp variable value
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {         // print the strings till the st variable value
                System.out.print("*\t");
            }
            
            if (i <= n / 2) {           // if the value of i is less the the mid line value,
                sp--;                   // spaces will decrease by one and
                st += 2;                // strings will increase by two
            } else {                    // else if the value of i is more than the mid line value
                sp++;                   // spaces will increase by one and
                st -= 2;                // strings will decrease by two
            }
    
            System.out.println();
        }
    }
}