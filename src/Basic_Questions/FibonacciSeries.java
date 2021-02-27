package Basic_Questions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print the fibonacci series");
        int n = sc.nextInt();

        printFibonacciSeries(n);
    }

    private static void printFibonacciSeries(int n) {
        int firstNumber = 0;            // first fibonacci number is always 0
        int secondNumber = 1;           // second fibonacci number is always 1

        for (int i = 0; i < n; i++) {
            System.out.println(firstNumber);        // prints the first number

            int thirdNumber = firstNumber + secondNumber;       // calculate the third number by adding first & second
            firstNumber = secondNumber;             // move first to second's position
            secondNumber = thirdNumber;             // move second to third's position
        }
    }
}