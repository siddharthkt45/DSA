// In this problem we have to return the inverse of a given number on the basis of its position
// For ex. - Pos -> 4 3 2 1
//           Val -> 2 1 3 4
// Inverse - Pos -> 4 3 2 1
//           Val -> 1 2 4 3

// In other words, the values get exchanged with the positions.
// Given that the values given can not be outside the given range of the positions.
// For ex. - Pos -> 4 3 2 1
//           Val -> 3 2 5 3             is INVALID input
// Also, each value in the given range should appear only once.
// For ex. - Pos -> 4 3 2 1
//           Val -> 2 1 4 4             is INVALID input

package Basic_Questions;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to print the inverse");
        int n = sc.nextInt();

        int inverse = printInverseOfNumber(n);
        System.out.println("The number after reversing becomes -> " + inverse);
    }

    private static int printInverseOfNumber(int n) {
        int inverse = 0;            // Number to be returned
        int count = 1;
        while (n != 0) {            // Loop till the number becomes 0
            int rem = n % 10;       // Store the last value in a variable

            inverse = (int) (inverse + Math.pow(10, rem - 1) * count);      // Multiply the count with the place value
                                                                            // and add it to the ans
            n = n / 10;             // Eliminate the last variable
            count++;
        }
        return inverse;
    }
}