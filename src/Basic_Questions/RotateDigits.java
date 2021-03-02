package Basic_Questions;

import java.util.Scanner;

public class RotateDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to rotate");
        int n = sc.nextInt();
        System.out.println("Enter how many times you want to rotate that number");
        int k = sc.nextInt();

        int rotatedNumber = rotateDigitsOfNumber(n, k);
        System.out.println("Rotated number -> " + rotatedNumber);
    }

    private static int rotateDigitsOfNumber(int n, int k) {
        int digits = countDigitsOfANumber(n);

        k = k % digits;
        if (k < 0) {
            k = k + digits;
        }

        int div = (int) Math.pow(10, k);

        int rem = n % div;
        n = n / div;
        int mul = (int) Math.pow(10, countDigitsOfANumber(n));
        n = n + rem * mul;

        return n;
    }

    private static int countDigitsOfANumber(int n) {
        int count = 0;          // initialising the count variable

        while (n != 0) {        // run loop till the number becomes 0
            n = n / 10;         // dividing by 10 so as to delete one digit in each iteration
            count++;            // increment count
        }

        return count;
    }
}