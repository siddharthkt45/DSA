// Here, we are given two arrays, arr1 and arr2,
// out of which arr2 is a bigger array with all its values together being greater than
// all the values together of arr1
// For example, if arr1 = {9, 9, 9}, arr2 = {1, 0, 0, 0}, then print 1

package Arrays;

import java.util.Scanner;

public class Difference_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of the first array: ");
        int n1 = sc.nextInt();          // size of first array
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
    
        System.out.println("Enter the size of the second array (must be greater than the first array): ");
        int n2 = sc.nextInt();          // size of second array (greater array)
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        differenceOfTwoArrays(arr1, arr2);
    }
    
    private static void differenceOfTwoArrays(int[] arr1, int[] arr2) {
        int[] diff = new int[arr2.length];          // we make a resultant array the size of the greater array
        
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = diff.length-1;
        int carry = 0;
        
        while (k >= 0) {
            int d;
            int a1val = i >= 0 ? arr1[i] : 0;           // if there is a value in arr1,
                                                        // then continue with it otherwise continue with 0
    
            if (arr2[j] + carry >= a1val) {         // if the arr2 value + carry is greater than arr1 value
                d = arr2[j] + carry - a1val;        // do simple subtraction
                carry = 0;
            } else {                                // else
                d = arr2[j] + carry + 10 - a1val;       // add 10 to the carry
                carry = -1;                             // and make carry for the next iteration as -1
            }
    
            diff[k] = d;        // assign the value to the resultant array
    
            i--;                // decrement all the values
            j--;
            k--;
        }
        
        int idx = 0;        // we have to omit the leading zeroes, so we take an index
        while (idx < diff.length) {     // iterate till we get the first non-zero number
            if (diff[idx] == 0) {
                idx++;          // and keep incrementing the index
            } else {
                break;
            }
        }
        
        while (idx < diff.length) {         // now iterate from the incremented index to the end of the array
            System.out.println(diff[idx]);          // and print the rest of the values
            idx++;
        }
    }
}