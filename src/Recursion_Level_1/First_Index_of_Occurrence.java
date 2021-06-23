// Here, in this question, we're given an array and an element and
// we've to return the first index of occurrence of that element in the array using recursion.

package Recursion_Level_1;

import java.util.Scanner;

public class First_Index_of_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched:- ");
        int x = sc.nextInt();
        int fio = firstIndexOfOccurrence(arr, 0, x);
        System.out.println("The first index of occurrence of " + x + " is:- " + fio);
    }

    private static int firstIndexOfOccurrence(int[] arr, int idx, int x) {
        if (idx == arr.length - 1) { // Base case, if index is at the last element,
            return idx;              // return the element because there is no element after it
        }

        if (arr[idx] == x) {        // if the element at index is equal to x,
            return idx;             // return the index
        } else {                                                // else
            return firstIndexOfOccurrence(arr, idx + 1, x); // Make the call to idx + 1 &
        }                                                       // return
    }
}