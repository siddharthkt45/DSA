// Here, in this question, we're given an array and
// we've to print the array using recursion.

package Recursion_Level_1;

import java.util.Scanner;

public class Display_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        displayArray(arr, 0);
    }

    private static void displayArray(int[] arr, int idx) {
        if (idx == arr.length) {            // Base case, if index becomes equal to arr.length,
            return;                         // return
        }
        System.out.println(arr[idx]);       // Print the element at the index
        displayArray(arr, idx + 1);     // then, make the call to index + 1
    }
}