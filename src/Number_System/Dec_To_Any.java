// In this question, you are provided a number of decimal number system (base 10)
// and a base. You have to convert the decimal number into the given base number system.

package Number_System;

import java.util.Scanner;

public class Dec_To_Any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you have to convert:- ");
        int n = sc.nextInt();           // decimal number given
        System.out.println("Enter the base into which you want to convert the number:- ");
        int base = sc.nextInt();        // desired base given
        
        System.out.println(getValueInBase(n, base));
    }
    
    private static long getValueInBase(int n, int base) {
        long res = 0;
        long pow = 1;               // initialising pow to the lowest power of 10, that is, 10^0 = 1
    
        while (n != 0) {
            int rem = n % base;             // take out each digit one by one
            n /= base;                      // cut down the number by the base
            res = res + (rem * pow);        // add the remainder to the result after multiplying it with power
            pow = pow * 10;                 // multiply the with 10 so as to reverse add the digits in the res
        }
        
        return res;
    }
}