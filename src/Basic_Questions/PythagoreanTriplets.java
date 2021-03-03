// Pythagorean Triplets are a set of 3 numbers which can combine together to form a right angle triangle
// In this problem, we have to check whether the 3 given numbers are Pythagorean Triplets or not

package Basic_Questions;

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers you want to check whether they are Pythagorean Triplets or not");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
/*
          We could also have calculated the max number and then could have coded accordingly
         
          int max = a;
          if (b >= max) {
              max = b;
          }
          if (c >= max) {
              max = c;
          }
*/
    
        if (a * a == ((b * b) + (c * c))) {
            System.out.println("These triplets can form a right angle triangle");
            return;
        } else if (b * b == ((a * a) + (c * c))) {
            System.out.println("These triplets can form a right angle triangle");
            return;
        } else if (c * c == ((b * b) + (a * a))) {
            System.out.println("These triplets can form a right angle triangle");
            return;
        }
    
        System.out.println("These triplets can not form a right angle triangle");
    }
}