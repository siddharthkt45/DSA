// Here, in this question, we're given a series of numbers and a window size,
// and we've to calculate the maximum number in a particular window.
// The window will keep moving from left to right -> and we've to calculate
// the maximum number in each iteration

package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of series:- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the series:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the size of window:- ");
        int k = sc.nextInt();

        int[] nge = nextGreaterElementOnRight(arr);

        int j = 0;              // pointer to keep track of the next greater element in the window
        for (int i = 0; i < arr.length - k; i++) {
            if (j < i) {                        // if the j pointer is left behind the i pointer,
                j = i;                          // make it equal
            }
            while (nge[j] < i + k) {    // loop till the next greater element is inside the window
                j = nge[j];             // and make j point to the next greater element
            }

            System.out.print(arr[j] + " ");     // print the maximum number
        }
    }

    private static int[] nextGreaterElementOnRight(int[] arr) { // function to calculate next
        Stack<Integer> st = new Stack<>();                      // greater element
        int[] res = new int[arr.length];

        st.push(arr.length - 1);            // push the index of the last element
        res[arr.length - 1] = arr.length;           // assign array length to the last element

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) { // keep popping till the current
                st.pop();                               // element is greater than the stack top
            }

            if (st.size() == 0) {           // if the stack size is 0
                res[i] = arr.length;        // assign array length to this element
            } else {                    // else
                res[i] = st.peek();     // assign stack top to this element
            }

            st.push(i);         // push the index of the element
        }

        return res;         // return the resultant array
    }
}