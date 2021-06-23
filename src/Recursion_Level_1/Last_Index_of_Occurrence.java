// Here, in this question, we're given an array and an element and
// we've to return the last index of occurrence of that element in the array using recursion.

package Recursion_Level_1;

import java.util.Scanner;

public class Last_Index_of_Occurrence {
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
        int lio = lastIndexOfOccurrence(arr, 0, x);
        System.out.println("The last index of occurrence of " + x + " is:- " + lio);
    }

    private static int lastIndexOfOccurrence(int[] arr, int idx, int x) {
        if (idx == arr.length) {    // Base case, if index is at arr.length
            return -1;              // return -1 because there is no element there
        }

        int lastIndex = lastIndexOfOccurrence(arr, idx + 1, x); // Make the call to idx + 1
                                                                    // & store it in a var
        if (lastIndex == -1) {      // check if lastIndex is -1 (element NOT found yet)
            if (arr[idx] == x) {    // check if the current element is the required element
                return idx;         // if yes, return the index of that element
            } else {                // else (current element is NOT the required element)
                return -1;          // return -1
            }
        } else {                // else (required element is found)
            return lastIndex;   // return the index of that element
        }
    }
}

// This can be understood as - there is a work to be done,
// You (the manager) are standing at the front (first element - index 0) and
// rest all standing after you are you're teammates.
// The person standing at the last tries to do the work
// and if he's successful, we return the position of that person.
// But if he's NOT successful in doing the work, we return -1 and
// ask the person standing before the previous person to try to do the work.
// And we repeat the same process if we're unable to complete the work
// until we reach the manager, who is you. You take a last shot and
// if you're successful, we return you're position and
// if you also fail in doing the work, we finally return -1.