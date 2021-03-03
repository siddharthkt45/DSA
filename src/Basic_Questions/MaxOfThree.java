package Basic_Questions;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a > b && a > c) {
            System.out.println(a + " is the greatest number among these three");
        } else if (b > c) {
            System.out.println(b + " is the greatest number among these three");
        } else {
            System.out.println(c + " is the greatest number among these three");
        }
    }
}