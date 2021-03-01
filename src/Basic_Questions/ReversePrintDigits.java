package Basic_Questions;

import java.util.Scanner;

public class ReversePrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to print in reverse");
        int n = sc.nextInt();

        printDigitsInReverse(n);
    }

    private static void printDigitsInReverse(int n) {
        while (n != 0) {
            int rem = n % 10;
            System.out.println(rem);
            n = n / 10;
        }
    }
}