// In this problem, we are given N number of bulbs which are OFF by default
// We have to perform N passes in which in each pass we have to toggle the
// bulbs corresponding the pass number.
// For example, N = 10, so there will be 10 passes
// In the 1st pass, the bulbs which will be toggled are :- 1 2 3 4 5 6 7 8 9 10
// In the 2nd pass, the bulbs which will be toggled are :- 2 4 6 8 10
// In the 3rd pass, the bulbs which will be toggled are :- 3 6 9
// In the 4th pass, the bulbs which will be toggled are :- 4 8
// In the 5th pass, the bulbs which will be toggled are :- 5 10
// In the 6th pass, the bulbs which will be toggled are :- 6
// In the 7th pass, the bulbs which will be toggled are :- 7
// In the 8th pass, the bulbs which will be toggled are :- 8
// In the 9th pass, the bulbs which will be toggled are :- 9
// In the 10th pass, the bulbs which will be toggled are :- 10

// Here, 1st bulb is toggled 1 time
// Here, 2nd bulb is toggled 2 times
// Here, 3rd bulb is toggled 2 times
// Here, 4th bulb is toggled 3 times
// Here, 5th bulb is toggled 2 times
// Here, 6th bulb is toggled 4 times
// Here, 7th bulb is toggled 2 times
// Here, 8th bulb is toggled 4 times
// Here, 9th bulb is toggled 3 times
// Here, 10th bulb is toggled 4 times

// At last we have to print only those bulbs which are still ON
// Clearly the bulbs which are still ON would we those which are toggled odd number of times
// Here those bulbs are -> 1 4 9
// Can we find a pattern between these bulbs? Yes, these all are squares of some other numbers
// Which means that the bulbs which would still be ON are those which are squares of some other numbers till N

// But why did perfect squares remained ON?
// Its because all perfect squares have odd number of factors
// and thus they got toggled odd number of times which got them ON
// For example, 24 -> 1, 2, 3, 4, 6, 8, 12, 24 = 8 factors
//              36 -> 1, 2, 3, 4, 6, 9, 12, 18, 36 = 9 factors

package Basic_Questions;

import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bulbs");
        int n = sc.nextInt();
    
        System.out.print("Bulbs which are still ON -> ");
        printOnBulbs(n);
    }
    
    private static void printOnBulbs(int n) {
        int i = 1;
        while (i * i <= n) {
            System.out.print((i * i) + " ");
            i++;
        }
    }
}