// Here, in this question, we're given an array and
// we've to return the largest element in the array using recursion.

package Recursion_Level_1;

import java.util.Scanner;

public class Maximum_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = maxOfArray(arr, 0);
        System.out.println("Max of the array is:- " + max);
    }

    private static int maxOfArray(int[] arr, int idx) {
        if (idx == arr.length - 1) { // Base case, if index is at the last element,
            return arr[idx];         // return the element because there is no element after it
        }
        int max = maxOfArray(arr, idx + 1);   // Make the call to idx + 1 & store in a var
        return Math.max(max, arr[idx]);     // return the larger of max and the current element
    }
}