// Here, given two arrays, print the sum of the corresponding digits of both arrays.
// For example, arr1 = {9, 1, 2, 3} and arr2 = {1, 3, 5, 3}, return -
//              res = {1, 0, 4, 7, 6}

package Arrays;

import java.util.Scanner;

public class Sum_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
    
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int[] res = sumOfTwoArray(arr1, arr2);
        
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
    
    private static int[] sumOfTwoArray(int[] arr1, int[] arr2) {
        int[] sum = new int[Math.max(arr1.length, arr2.length) + 1];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;
        int carry = 0;
        
        // Solution with single loop
        while (k >= 1) {
            int d = carry;
            
            if (i >= 0) {
                d += arr1[i];
            }
            
            if (j >= 0) {
                d += arr2[j];
            }
            
            carry = d / 10;
            d = d % 10;
            
            sum[k] = d;
            
            i--;
            j--;
            k--;
        }
/*
        Solution with 3 loops
        
        while (i >= 0 && j >= 0) {
            n = arr1[i--] + arr2[j--] + carry;
            sum[k--] = n % 10;
            carry = n / 10;
        }
        
        while (i >= 0) {
            n = arr1[i--] + carry;
            sum[k--] = n % 10;
            carry = n / 10;
        }
    
        while (j >= 0) {
            n = arr2[j--] + carry;
            sum[k--] = n % 10;
            carry = n / 10;
        }
*/
        if (carry != 0) {
            sum[k] = carry;
        }
        
        return sum;
    }
}