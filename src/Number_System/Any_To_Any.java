// In this question, you are provided a number and its base (number system)
// and you have to convert the given number into another base (number system) which is provided to you

package Number_System;

import java.util.Scanner;

public class Any_To_Any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        long n = sc.nextInt();          // number given
        System.out.println("Enter the current base:- ");
        int base1 = sc.nextInt();       // base of given number
        System.out.println("Enter the desired base:- ");
        int base2 = sc.nextInt();       // desired base
    
        System.out.println(getValue(n, base1, base2));
    }
    
    private static long getValue(long n, int base1, int base2) {
        long baseToDec = getValueInDecimal(n, base1);
        
//        long decToNewBase = getValueInBase(baseToDec, base2);
        
        return getValueInBase(baseToDec, base2);
    }
    
    private static long getValueInDecimal(long n, int base) {
        long res = 0;
        long pow = 1;           // initialising pow to the lowest power of any base, that is, base^0 = 1
        
        while (n != 0) {
            int rem = (int) (n % 10);       // take out each digit one by one
            n /= 10;                        // cut down the number by 10
            res = res + (rem * pow);        // add the remainder to the result after multiplying it with power
            pow = pow * base;               // multiply the power with base so as to reverse add the digits in the res
        }
        
        return res;
    }
    
    private static long getValueInBase(long n, int base) {
        long res = 0;
        long pow = 1;               // initialising pow to the lowest power of 10, that is, 10^0 = 1
        
        while (n != 0) {
            int rem = (int) (n % base);             // take out each digit one by one
            n /= base;                      // cut down the number by the base
            res = res + (rem * pow);        // add the remainders to the result after multiplying them with the power
            pow = pow * 10;                 // increase the pow by 10 so as to reverse add the digits in the res
        }
        
        return res;
    }
}