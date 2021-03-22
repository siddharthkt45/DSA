// In this question, you are provided two numbers of same base (number system), which is also provided
// and you have to calculate the sum of those two numbers in the same base

package Number_System;

import java.util.Scanner;

public class Any_Base_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int first = sc.nextInt();               // first number given
        System.out.println("Enter second number:- ");
        int second = sc.nextInt();              // second number given
        System.out.println("Enter base:- ");
        int base = sc.nextInt();                // base of the numbers given
    
        System.out.println(getSum(first, second, base));
    }
    
    private static int getSum(int first, int second, int base) {
        int sum = 0;
        int pow = 1;
        int carry = 0;
        
        while (first != 0 || second != 0 || carry != 0) {       // Loop until any of these is NOT equal to 0
            int digit1 = first % 10;            // take out digit from the first number
            int digit2 = second % 10;           // take out digit from the second number
            
            first /= 10;            // reduce first number
            second /= 10;           // reduce second number
            
            int digit = digit1 + digit2 + carry;            // add both the extracted digits and the carry
            
            carry = digit / base;           // carry can be calculated by dividing the digit by the base of number
            digit %= base;                  // keep only the one's digit
            
            sum = sum + (digit * pow);          // add the digit to the sum after multiplying it with power
            pow = pow * 10;                     // multiply power by 10
        }
        
        return sum;
    }
}