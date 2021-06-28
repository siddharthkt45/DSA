// Here, in this question, we're given an array of numbers and a target sum and
// we've to print out those elements from the array
// which can form a set to fulfill the target sum.

package Recursion_Level_1;

import java.util.Scanner;

public class Target_Sum_Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:- ");
        int sum = sc.nextInt();
        System.out.println("The possible target sum subsets are:- ");
        targetSumSubsets(arr, 0, "", 0, sum);
    }

    private static void targetSumSubsets(int[] arr, int idx, String set, int sos, int sum) {
        if (idx == arr.length) {    // Base case, when idx becomes equal to arr.length
            if (sos == sum) {       // check if sos (sum of set) is equal to sum
                System.out.println(set + ".");  // print the sum with a '.' to mark complete set
            }
            return;                 // return
        }

        // Make the call for idx + 1, append arr[idx] + ", " to set & add arr[idx] to sos
        targetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], sum);
        targetSumSubsets(arr, idx + 1, set, sos, sum);  // Make the call to idx + 1
    }
}