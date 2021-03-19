// The pattern to be printed is:
//  1
//  1   1
//  1   2   1
//  1   3   3   1
//  1   4   6   4   1
//  1   5   10  10  5   1
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want to print in this type of pattern");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + "\t");
                int icjp1 = icj * (i - j) / (j + 1);        // Based on the permutation formula
                icj = icjp1;
            }
    
            System.out.println();
        }
    }
}