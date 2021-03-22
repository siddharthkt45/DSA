// In this question, we are given a number and a digit
// and we have to tell how many times does that digit occur in the number

package Functions;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in which you have to search:- ");
        long n = sc.nextLong();
        System.out.println("Enter the digit which you have to search:- ");
        int d = sc.nextInt();
    
        System.out.println(getDigitFrequency(n, d));
    }
    
    private static int getDigitFrequency(long n, int d) {
        int count = 0;
        while (n != 0) {
            int rem = (int) (n % 10);
            n /= 10;
            if (rem == d) {
                count++;
            }
        }
        return count;
    }
}