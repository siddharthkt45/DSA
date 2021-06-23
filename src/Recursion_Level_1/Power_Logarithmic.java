// Here, in this question, we're given a number and a power
// and we've to calculate the value of the given number raised to the given power,
// in logarithmic time complexity.

package Recursion_Level_1;

import java.util.Scanner;

public class Power_Logarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int x = sc.nextInt();
        System.out.println("Enter the power:- ");
        int n = sc.nextInt();
        int power = power(x, n);
        System.out.println(x + " raised to the power " + n + " is:- " + power);
    }

    private static int power(int x, int n) {
        if (n == 0) {               // Base case, if n becomes 0,
            return 1;               // return 1, since any number raised to the power 0 is 1.
        }
        int power = power(x, n / 2);  // Make the call to n / 2 and store it in a variable
        if (n % 2 == 1) {                // if n is odd,
            return power * power * x;    // multiply the var with itself & with x & return it.
        }
        return power * power;   // else, multiply the var with itself and return it.
    }
}