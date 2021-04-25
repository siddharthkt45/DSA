// Here, you'll be given an array with elements only upto the size of the array.
// For example, if the array size is 5, the elements inside the array will be between 0 to 4
// in a jumbled order. If arr = {2, 3, 4, 0, 1}, then - arr = {3, 4, 0, 1, 2}

package Arrays;

import java.util.Scanner;

public class Inverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        inverseArray(arr);
        display(arr);
    }
    
    private static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    private static void inverseArray(int[] arr) {
        int[] res = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            res[arr[i]] = i;
        }
    
        System.arraycopy(res, 0, arr, 0, arr.length);
    }
}