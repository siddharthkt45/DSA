// In this question, you are provided two numbers of same base (number system), which is also provided
// and you have to calculate the product of those two numbers in the same base

package Number_System;

import java.util.Scanner;

public class Any_Base_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int n = sc.nextInt();           // first number given
        System.out.println("Enter second number:- ");
        int m = sc.nextInt();           // second number given
        System.out.println("Enter base:- ");
        int base = sc.nextInt();        // base of both the numbers given
    
        System.out.println(getProduct(n, m, base));
    }
    
    private static int getProduct(int n, int m, int base) {
        int prod = 0;
        int pow = 1;
        
        while (m != 0) {
            int digit = m % 10;
            m /= 10;
            
            int singleProduct = getProductForASingleDigit(n, digit, base) * pow;
            prod = getSum(prod, singleProduct, base);
            pow = pow * 10;
        }
        
        return prod;
    }
    
    private static int getProductForASingleDigit(int n, int m, int base) {
        int res = 0;
        int carry = 0;
        int pow = 1;
        
        while (n != 0 || carry != 0) {          // Loop until any of these is NOT equal to 0
            int digit = n % 10;                 // Take out the one's digit from the number
            n /= 10;                            // Reduce the main number
            
            int prod = digit * m + carry;       // calculate the product for one-one digit
            
            carry = prod / base;
            prod %= base;
            
            res += prod * pow;
            pow = pow * 10;
        }
        
        return res;
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