// Here, in this question, we're given a series of integers
// and we've to calculate the next greater element on right of each element
// if there is no greater element on the right to any number, assign -1 to that number
// create an array to store the next greater elements on right for each element
// This is an alternative approach to the previous question
// In this question, we iterate left to right ->

package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_On_Right_Alt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the series:- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter the series:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] nextGreaterElementOnRight = nextGreaterElementOnRight(arr);
        display(nextGreaterElementOnRight);
    }

    private static void display(int[] arr) {    // a function to display an array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] nextGreaterElementOnRight(int[] arr) {    // function to calculate next greater element
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];        // resultant array declaration

        st.push(0);     // in this method, we store the indices of the elements from left -> right

        for (int i = 1; i < arr.length; i++) {      // iterating from the second element
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                int pos = st.peek();
                res[pos] = arr[i];
                st.pop();
            }

            st.push(i);
        }

        while (st.size() > 0) {
            int pos = st.peek();
            res[pos] = -1;
            st.pop();
        }

        return res;
    }
}