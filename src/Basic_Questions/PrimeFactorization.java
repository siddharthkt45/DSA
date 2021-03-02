package Basic_Questions;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to prime factorize");
        int n = sc.nextInt();
    
        System.out.print("Prime factors are -> ");
        printPrimeFactors(n);
    }
    
    private static void printPrimeFactors(int n) {
        if (n == 0) {                       // special case
            System.out.println(0);          // since 0 does not have any prime factors
            return;
        }
        
        int div = 2;
        while (div * div <= n) {            // since factors of any number are found before its square root
            if (n % div == 0) {
                n = n / div;
                System.out.print(div + " ");
            } else {
                div++;                      // increment the divisor when its no longer able to divide the number
            }
        }
        
        if (n != 1) {                       // if still the number hasn't reduced to 1, print the number itself
            System.out.print(n);            // because that is the last factor remaining
        }
    }
}