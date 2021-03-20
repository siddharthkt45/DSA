// The pattern to be printed is:
//  *
//      *
//          *
//              *
//                  *
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want to print in this type of pattern");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {                           // in this type of diagonal, i == j always for the stars
                    System.out.print("*\t");            // so, whenever you get that, print stars
                } else {
                    System.out.print("\t");             // otherwise print spaces
                }
            }
    
            System.out.println();
            
/*
            A more optimal solution would be:
            
            for (int j = 1; j <= i; j++) {
                System.out.print("\t");
            }
            System.out.println("*");
            
            Because it will only run to print spaces and will print stars at the end of the line
            Thus it will run only i times instead of n times.
*/
        }
    }
}