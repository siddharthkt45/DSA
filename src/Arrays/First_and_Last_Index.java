package Arrays;

import java.util.Scanner;

public class First_and_Last_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element whose first and last index you want to determine: ");
        int k = sc.nextInt();
    
        System.out.println("First Index of " + k + " is: " + firstIndex(arr, k));
        System.out.println("Last Index of " + k + " is: " + lastIndex(arr, k));
    }
    
    private static int firstIndex(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;
        int firstIndex = -1;
    
        while (low <= high) {
            int mid = (low + high) / 2;
        
            if (arr[mid] < k) {
                low = mid + 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                firstIndex = mid;
                high = mid - 1;
            }
        }
        
        return firstIndex;
    }
    
    private static int lastIndex(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;
        int lastIndex = -1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] < k) {
                low = mid + 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                lastIndex = mid;
                low = mid + 1;
            }
        }
        
        return lastIndex;
    }
}