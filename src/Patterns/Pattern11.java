// The pattern to be printed is:
//  1
//  2   3
//  4   5   6
//  7   8   9   10
//  11  12  13  14  15
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want to print in this type of pattern");
        int n = sc.nextInt();
        
        int count = 1;              // a count variable that will keep on increasing until the loop stops
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {              // Loop till i
                System.out.print(count++ + "\t");
            }
            System.out.println();
        }
    }
}