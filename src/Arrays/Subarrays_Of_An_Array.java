// Here, you'll be given an array and you've to print all the subarrays of that array.
// For example, if arr = {10, 20, 30}, then print -
// 10
// 10 20
// 10 20 30
// 20
// 20 30
// 30

package Arrays;

import java.util.Scanner;

public class Subarrays_Of_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();           // size of array
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        printSubarrays(arr);
    }
    
    private static void printSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {          // Run a loop from 0 to the length of array - 1
            for (int j = i+1; j <= arr.length; j++) {       // Run another loop from i+1 to the length of array
                printArray(arr, i, j);
            }
        }
    }
    
    private static void printArray(int[] arr, int i, int j) {
        for (;i < j; i++) {                 // print the array elements between the given indices
            System.out.print(arr[i] + " ");
        }
        System.out.println();       // change line
    }
}