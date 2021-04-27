// Here, you'll be given a sorted array and an element present in that array
// and you have to write a Binary Search algorithm to print the index position of that element inside the array.

package Arrays;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of array in a sorted fashion: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        System.out.println("Enter which element you want to search: ");
        int k = sc.nextInt();
    
        System.out.println(iterativeBinarySearch(arr, k));
    }
    
/*
    This is a recursive approach for the Binary Search Algorithm
    private static int recursiveBinarySearch(int[] arr, int k, int low, int high) {
        if (low == high) {
            if (arr[low] == k)
                return low;
            else
                return -1;
        }
        else {
            int mid = (low + high) / 2;
    
            if (arr[mid] > k)
                return recursiveBinarySearch(arr, k, low, mid-1);
            else if (arr[mid] < k)
                return recursiveBinarySearch(arr, k, mid+1, high);
            return mid;
        }
    }
*/

//    This is an iterative approach for the Binary Search Algorithm
//    Iterative approach is always better than the recursive approach.
    
    private static int iterativeBinarySearch(int[] arr, int k) {
         int low = 0;
         int high = arr.length-1;
    
         while (low <= high) {
             int mid = (low + high) / 2;
    
             if (arr[mid] == k)
                 return mid;
             else if (arr[mid] <= k)
                 low = mid + 1;
             else
                 high = mid - 1;
         }
    
         return -1;
     }
}