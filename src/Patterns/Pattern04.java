// The pattern to be printed is:
//  *   *   *   *   *
//      *   *   *   *
//          *   *   *
//              *   *
//                  *
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want to print in this type of pattern");
        int n = sc.nextInt();
        
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}