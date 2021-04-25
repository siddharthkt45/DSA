// Here, you'll be given an array and a rotation index
// and you have to rotate the array on the basis of that rotation index.
// For example, if arr = {1, 2, 3, 4, 5} and k = 2, then rotate clockwise as-
//                 arr = {4, 5, 1, 2, 3}
// Note that the rotation index can be negative also. For example, if k = -1, then rotate anticlockwise as -
//                 arr = {2, 3, 4, 5, 1}

package Arrays;

import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the rotation index: ");
        int k = sc.nextInt();
        
        rotateArray(arr, k);
        display(arr);
    }
    
    private static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    private static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        
        if (k == 0) {
            return;
        }
        
        if (k < 0) {
            k = n + k;
        }
        
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
    }
    
    private static void reverseArray(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}