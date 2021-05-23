// Here, in this question, we're given a series of integers
// and we've to calculate the next greater element on left of each element
// if there is no greater element on the left to any number, assign -1 to that number
// create an array to store the next greater elements on left for each element
// In this method, we iterate left to right ->

package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_On_Left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of series:- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the series:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] nextGreaterElementOnLeft = nextGreaterElementOnLeft(arr);
        display(nextGreaterElementOnLeft);
    }

    private static void display(int[] arr) {    // a function to print an array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] nextGreaterElementOnLeft(int[] arr) {  // function to calculate next
        Stack<Integer> st = new Stack<>();                      // greater element on left
        int[] res = new int[arr.length];    // resultant array

        st.push(0);     // push the index of the first element
        res[0] = -1;        // and assign -1 to it in the resultant array

        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {     // keep popping until there
                st.pop();                                           // are smaller elements left
            }

            if (st.size() == 0) {       // if the size == 0, means this is the largest element
                res[i] = -1;            // till now, so assign -1 to it
            } else {                        // else
                res[i] = arr[st.peek()];    // assign the top of the stack to this element
            }                               // in the resultant array

            st.push(i);         // now push the element index into the stack
        }

        while (st.size() > 0) {         // now, iterate till there are elements left in the stack
            int pos = st.pop();         // pop the index and store it in a variable
            if (st.size() != 0) {           // now if the size != 0
                res[pos] = arr[st.peek()];      // assign the top of the stack in the res array
            } else {                // else
                res[pos] = -1;      // assign -1 as the element doesn't have any next greater
            }                       // element on left
        }

        return res;         // return the resultant array
    }
}