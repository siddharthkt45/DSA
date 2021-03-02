package Basic_Questions;

import java.util.Scanner;

public class GCD_and_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers whose GCD and LCM you want to calculate");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("GCD -> " + findGCD(n, m));
        System.out.println("LCM -> " + findLCM(n, m));
    }
    
    private static int findGCD(int n, int m) {
        if (n == 0) {           // if any of the given number is 0, GCD can not be calculated,
            return m;           // so return the other number
        }
        if (m == 0) {
            return n;
        }
        if (n == m) {           // Base case
            return n;           // if both the numbers are equal, we can return any number
        }

        // In this method we use the long division method we used to calculate the GCD
        // In which we divided the larger number by the smaller number and then
        // made the remainder as divisor and the previous divisor as dividend
        
        // Iterative Long Division Method
        while (n % m != 0) {
            int rem = n % m;
            n = m;
            m = rem;
        }
        // int gcd = m;
        return m;
        
/*
        Recursive Long Division Method
        
        if (n > m)
            return findGCD(n % m, m);
        return findGCD(n, m % n);
*/
    
/*
        Brute force solution
        
        int gcd = 0;
        
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                if (gcd < i) {
                    gcd = i;
                }
            }
        }
        
        return gcd;
*/
    }

    // To calculate the LCM of a number, we have a formula
    // a * b = LCM(a, b) * GCD(a, b)
    // Thus, we'll use GCD to calculate LCM
    // This formula only works for 2 numbers
    private static int findLCM(int n, int m) {
        return ((n * m) / findGCD(n, m));
    }
}