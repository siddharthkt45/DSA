package Basic_Questions;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose digits you want to print");
        int n = sc.nextInt();

/*
        Solution without using extra functions

        int mod = 0;
        int temp = n;

        while (temp != 0) {             // Loop to calculate the number of digits in the number
            temp = temp / 10;
            mod++;
        }

        int div = (int) Math.pow(10, mod - 1);
        while (div != 0) {
            int q = n / div;            // to print the digits from left to right, divide them from the divisor
            System.out.println(q);      // then we print the quotient

            n = n % div;    // store the remainder of the number divided by the divisor into the number variable itself
            div = div / 10;         // modify the divisor
        }
*/

        printDigitsOfANumber(n);
    }

    private static void printDigitsOfANumber(int n) {
        int count = countDigitsOfANumber(n);        // calculate number of digits in the number

        int div = (int) Math.pow(10, count - 1);    // calculate divisor

        while (div != 0) {
            int q = n / div;            // to print the digits from left to right, divide them from the divisor
            System.out.println(q);      // then we print the quotient

            n = n % div;    // store the remainder of the number divided by the divisor into the number variable itself
            div = div / 10;         // modify the divisor
        }
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