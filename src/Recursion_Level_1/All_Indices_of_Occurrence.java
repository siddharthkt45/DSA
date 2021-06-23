// Here, in this question, we're given an array and an element and
// we've to return an array containing all the indices of occurrence of that element
// in the array using recursion.

package Recursion_Level_1;

import java.util.Scanner;

public class All_Indices_of_Occurrence {
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
        int[] res = allIndicesOfOccurrence(arr, 0, x, 0);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    private static int[] allIndicesOfOccurrence(int[] arr, int idx, int x, int fsf) {
        if (idx == arr.length) {    // Base case, if idx becomes equal to arr.length
            return new int[fsf];    // return a new array of size fsf (found so far)
        }

        int[] res;      // declare a new array but don't initialise it

        if (arr[idx] == x) {    // if the current element is equal to the required element
            // Make the call to idx + 1 and fsf + 1 and store in the declared array
            res = allIndicesOfOccurrence(arr, idx + 1, x, fsf + 1);
            res[fsf] = idx;     // store the current index at fsf's position in the array
        } else {
            // Make the call to idx + 1 only & store in the declared array
            res = allIndicesOfOccurrence(arr, idx + 1, x, fsf);
        }

        return res;         // return the resultant array
    }
}