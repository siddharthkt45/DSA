// In this question, you are provided a number and its base (number system)
// and you have to convert the number into decimal number system

package Number_System;

import java.util.Scanner;

public class Any_To_Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you have to convert into decimal:- ");
        int n = sc.nextInt();           // number of any base given
        System.out.println("Enter the base from which you want to convert:- ");
        int base = sc.nextInt();        // its base given
    
        System.out.println(getValueInDecimal(n, base));
    }
    
    private static int getValueInDecimal(int n, int base) {
        int res = 0;
        int pow = 1;                // initialising pow to the lowest power of any base, that is, base ^ 0 = 1
        
        while (n != 0) {
            int rem = n % 10;               // take out each digit one by one
            n /= 10;                        // cut down the number by 10
            res = res + (rem * pow);        // add the remainder to the result after multiplying it with power
            pow = pow * base;               // multiply the power with base so as to reverse add the digits in the res
        }
        
        return res;
    }
}