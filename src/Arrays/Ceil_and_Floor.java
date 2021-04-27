// Here, you'll be given an array and a key element
// and you have to find the ceil and floor value of that key element

package Arrays;

import java.util.Scanner;

public class Ceil_and_Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element whose ceil and floor value you want to determine: ");
        int k = sc.nextInt();
    
        int low = 0;
        int high = arr.length-1;
        int ceil = 0;
        int floor = 0;
    
        while (low <= high) {               // Here, we use the binary search approach to calculate the ceil and floor
            int mid = (low + high) / 2;     // calculate the mid value
        
            if (arr[mid] < k) {             // if arr[mid] is less than the key value
                low = mid + 1;              // move low to mid + 1 index
                floor = arr[mid];           // move floor to mid value
            }
            else if (arr[mid] > k) {        // if arr[mid] is greater than the key value
                high = mid - 1;             // move high to mid - 1 index
                ceil = arr[mid];            // move ceil to mid value
            }
            else {                          // else if arr[mid] is equal to the key value
                ceil = arr[mid];            // move ceil to mid value
                floor = arr[mid];           // move floor to mid value
                break;                  // break the loop
            }
        }
    
        System.out.println("Ceil of " + k + " is: " + ceil);
        System.out.println("Floor of " + k + " is: " + floor);
    }
}