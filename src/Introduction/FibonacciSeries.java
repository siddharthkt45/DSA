package Introduction;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print the fibonacci series");
        int n = sc.nextInt();

        printFibonacciSeries(n);
    }

    private static void printFibonacciSeries(int n) {
        int firstNumber = 0;
        int secondNumber = 1;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        for (int i = 2; i < n; i++) {
            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            System.out.println(thirdNumber);
        }
    }
}