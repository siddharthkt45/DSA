package Basic_Questions;

import java.util.Scanner;

public class PrimeNumberTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

/*
        Solution without using extra functions

        for (int n = low; n <= high; n++) {
            int count = 0;

            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(n);
            }
        }
*/

        printPrimesTillN(low, high);
    }

    private static void printPrimesTillN(int low, int high) {
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        int sqrtOfN = (int) Math.sqrt(n);       // A prime number has all its unique factors before its square root

        if (n == 1) {
            return false;         // since 1 is a unique number

        } else if (n == 2) {
            return true;          // 2 is a special prime number
        }

        int i = 2;

        while (i <= sqrtOfN) {      // condition could also be written as i * i <= n
            if (n % i == 0) {
                return false;       // if n is divisible by any number in the given range, it is not a prime number
            }
            i++;
        }

        return true;       // if n is not divisible by any number, it is prime
    }
}