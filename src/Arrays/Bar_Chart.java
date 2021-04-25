// For example, arr = {3, 0, 1, 7, 5}, then print -
//              *
//              *
//              *   *
//              *   *
//  *           *   *
//  *           *   *
//  *       *   *   *

package Arrays;

import java.util.Scanner;

public class Bar_Chart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n = sc.nextInt();           // size of array
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        createBarChart(arr);
    }
    
    private static void createBarChart(int[] arr) {
        int m = getMax(arr);            // here we get the max height of the bar chart
        int n = arr.length;
        
        for (int i = m; i >= 1; i--) {          // starting from the max height, we move to lower heights
            for (int j : arr) {                 // and in this loop, we iterate through the array
                if (i <= j) {                   // if the height is less than or equal to the array value,
                    System.out.print("* ");     // there must be a star printed
                } else {                        // else
                    System.out.print("  ");     // print spaces
                }
            }
            System.out.println();               // change lines after each iteration
        }
    }
    
    private static int getMax(int[] arr) {          // this function returns the max value inside the array
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}