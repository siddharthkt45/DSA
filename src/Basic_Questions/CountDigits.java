package Basic_Questions;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose digits you want to count");
        int n = sc.nextInt();

        int digits = countDigitsOfANumber(n);
        System.out.println("No. of digits -> " + digits);
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