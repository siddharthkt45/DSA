package Introduction;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        isPrime(n);
    }

    private static void isPrime(int n) {
        int sqrtOfN = (int) Math.sqrt(n);
        int i = 2;
        if (n == 1) {
            System.out.println("1 is a unique number");
            return;
        } else if (n == 2) {
            System.out.println("2 is a prime number");
            return;
        }

        while (i <= sqrtOfN) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return;
            }
            i++;
        }

        System.out.println(n + " is a prime number");
    }
}