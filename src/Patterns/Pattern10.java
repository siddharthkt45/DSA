// The pattern to be printed is:
//          *
//      *       *
//  *               *
//      *       *
//          *
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines (must be odd) you want to print in this type of pattern");
        int n = sc.nextInt();
    
        if (n % 2 == 0)             // n must be an odd number
            return;
        
        int os = n / 2;             // os = outer space
        int is = -1;                // is = inner space
                            // We are initialising inner space by -1 because they increment by 2 and are initially odd
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= os; j++) {         // print outer space upto os variable
                System.out.print("\t");
            }
            
            System.out.print("*\t");                // print a star after every outer space
            
            for (int j = 1; j <= is; j++) {         // print inner spaces upto is variable
                System.out.print("\t");
            }
            
            if (i > 1 && i < n) {                   // in the first and last row
                System.out.print("*\t");            // we only have to print 1 star
            }
            
            if (i <= n / 2) {               // if the value of i is less than the mid-line value,
                os--;                       // decrement outer space by 1 and,
                is += 2;                    // increment inner space by 2
            } else {                        // else if the value of i is greater than the mid-line value,
                os++;                       // increment outer space by 1 and,
                is -= 2;                    // decrement inner space by 2
            }
    
            System.out.println();           // Change line
        }
    }
}