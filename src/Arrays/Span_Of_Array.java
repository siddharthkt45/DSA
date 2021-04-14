// In this question, we are given the size of an array and the values inside that array
// and we've to calculate the difference between the largest and the smallest number

package Arrays;

import java.util.Scanner;

public class Span_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:- ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the values inside the array:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        System.out.println("Span of the array: " + calculateSpanOfArray(arr));
    }
    
    private static int calculateSpanOfArray(int[] arr) {
        int max = getMax(arr);
        int min = getMin(arr);
    
        return max - min;
    }
    
    private static int getMax(int[] arr) {          // function to find out the max of the array
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }
    
    private static int getMin(int[] arr) {          // function to find out the min of the array
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }
}