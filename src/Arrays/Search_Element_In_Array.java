package Arrays;

import java.util.Scanner;

public class Search_Element_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        System.out.println("Enter the element you want to search:- ");
        int x = sc.nextInt();
        
        System.out.println("Element is at index: " + searchElement(arr, x));
    }
    
    private static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {      // Run a for loop till the length of the array
            if (arr[i] == x) {                  // check everytime whether the element is equal to the key element
                return i;                       // if yes, return the index
            }
        }
        return -1;                  // else, return -1
    }
}