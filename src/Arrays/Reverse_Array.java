// Here, you'll be given an array and you have to reverse of that array -
// For example, if arr = {1, 2, 3, 4, 5}, then - arr = {5, 4, 3, 2, 1}

package Arrays;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        reverseArray(arr);
        display(arr);
    }
    
    private static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
    private static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
