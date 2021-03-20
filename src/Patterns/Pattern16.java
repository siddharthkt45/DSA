// The pattern to be printed is:
//  1                       1
//  1   2               2   1
//  1   2   3       3   2   1
//  1   2   3   4   3   2   1
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want to print in this type of pattern");
        int n = sc.nextInt();
        
        int sp = 2 * n - 3;             // sp = spaces
        int st = 1;                     // st = strings
        
        for (int i = 1; i <= n; i++) {
            int val = 1;                        // since each row will start from 1
            
            for (int j = 1; j <= st; j++) {         // print numbers according to the value of st variable
                System.out.print(val + "\t");
                val++;                              // increment val in the first half of columns
            }
            for (int j = 1; j <= sp; j++) {         // print spaces according to the value of sp variable
                System.out.print("\t");
            }
            
            if (i == n) {                   // if i is on the last row,
                st--;                       // decrement st by 1 and
                val--;                      // decrement val by 1
            }
            for (int j = 1; j <= st; j++) {
                val--;                              // decrement val in the second half of columns
                System.out.print(val + "\t");       // print numbers according to the value of st variable
            }
            
            sp -= 2;            // decrement sp by 2
            st++;               // increment st by 1
    
            System.out.println();       // change line
        }
    }
}