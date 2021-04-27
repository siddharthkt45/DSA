package Arrays;

import java.util.Scanner;

public class Subsets_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();           // size of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        subsetsOfArray(arr);
    }
    
    private static void subsetsOfArray(int[] arr) {
        int n = arr.length;
        int limit = (int) Math.pow(2, n);
        for (int i = 0; i < limit; i++) {
            // convert i to binary and use 0's and 1's to determine whether to print the values or not
            StringBuilder set = new StringBuilder();
            int temp = i;
            for (int j = arr.length-1; j >= 0; j--) {
                int r = temp % 2;                       // This step converts the decimal number to binary number
                temp /= 2;                              // by using the prime factorization method
                
                if (r == 0) {                           // if the binary digit is 0,
                    set.insert(0, "-");         // print dash (-)
                } else {                                // else if the binary digit is 1,
                    set.insert(0, arr[j]);          // print the value at the corresponding position
                }
                set.insert(0, "\t");            // print space between characters
            }
            System.out.println(set);            // At last, print the value inside the set variable
        }
    }
}