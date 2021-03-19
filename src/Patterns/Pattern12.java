// The pattern to be printed is:
//  0
//  1   1
//  2   3   5
//  8   13  21  34
// and so on... based on the number of lines given as input

package Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want to print in this type of pattern");
        int n = sc.nextInt();
        
        int firstNumber = 0;
        int secondNumber = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(firstNumber + "\t");   // print the firstNumber because it will travel full sequence
                
                int thirdNumber = firstNumber + secondNumber;   // add first and second number and store in third
                firstNumber = secondNumber;                     // make first number equal to second number
                secondNumber = thirdNumber;                     // and make second number equal to third number
            }
            
            System.out.println();           // Change line
        }
    }
}