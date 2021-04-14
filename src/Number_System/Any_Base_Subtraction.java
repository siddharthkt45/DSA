// In this question, you are provided two numbers of same base (number system), which is also provided
// and you have to calculate the difference of those two numbers in the same base

package Number_System;

import java.util.Scanner;

public class Any_Base_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int first = sc.nextInt();               // first number given
        System.out.println("Enter second number:- ");
        System.out.println("NOTE!!! This number must be smaller than the previous number:- ");
        int second = sc.nextInt();              // second number given
        
        if (second > first)             // if second number is greater than the first number
            return;                     // terminate the program
        
        System.out.println("Enter the base:- ");
        int base = sc.nextInt();                // base given
    
        System.out.println(getDifference(first, second, base));
    }
    
    private static int getDifference(int first, int second, int base) {
        int diff = 0;
        int pow = 1;
        int borrow = 0;
        
        while (first != 0 || second != 0) {         // Loop until any of these is NOT equal to 0
            int digit1 = first % 10;                // take out digit from the first number
            int digit2 = second % 10;               // take out digit from the second number
            
            first /= 10;            // reduce first number
            second /= 10;           // reduce second number
            
            if (digit1 < digit2) {          // if the first digit is smaller than the second digit
                borrow = 1;                 // take borrow from the the number before it
                first--;                    // reduce that number from which borrow has been taken
            }
            
            int digit = borrow * base + digit1 - digit2;        // add borrow to the first digit and
                                                                // then subtract second digit
            diff = diff + (digit * pow);        // add the digit to the difference after multiplying it with power
            pow = pow * 10;                     // multiply power by 10
        }
        
        return diff;
    }
}