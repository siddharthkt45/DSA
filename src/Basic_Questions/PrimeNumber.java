package Basic_Questions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to check");
        int n = sc.nextInt();

        isPrime(n);
    }

    private static void isPrime(int n) {
        int sqrtOfN = (int) Math.sqrt(n);       // A prime number has all its unique factors before its square root

        if (n == 1) {
            System.out.println("1 is a unique number");         // since 1 is a unique number
            return;
        } else if (n == 2) {
            System.out.println("2 is a prime number");          // 2 is a special prime number
            return;
        }

        int i = 2;

        while (i <= sqrtOfN) {      // condition could also be written as i * i <= n
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");       // if n is divisible by any number in the
                return;                                                 // given range, it is not a prime number
            }
            i++;
        }

        System.out.println(n + " is a prime number");       // if n is not divisible by any number, it is prime
    }
}