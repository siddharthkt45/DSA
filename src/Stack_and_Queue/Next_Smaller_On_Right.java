// Here, in this question, we're given a series of integers
// and we've to calculate the next smaller element on right of each element
// if there is no smaller element on the right to any number, assign -1 to that number
// create an array to store the next smaller elements on right for each element
// In this method, we iterate right to left <-
// This is an extension to the Next Greater on Right problem

package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Next_Smaller_On_Right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the series:- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the series:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] nextSmallerElementOnRight = nextSmallerElementOnRight(arr);
        display(nextSmallerElementOnRight);
    }

    private static int[] nextSmallerElementOnRight(int[] arr) { // function to find the next smaller element
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];

        st.push(arr[arr.length - 1]);   // push the last element into the stack
        res[res.length - 1] = -1;       // assign -1 to the corresponding position of the last element

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] <= st.peek()) {  // keep popping until the current element is
                st.pop();                                   // smaller than the peek of stack
            }

            if (st.size() == 0) {   // if the size of stack becomes 0
                res[i] = -1;        // assign -1 to that position
            } else {                    // else
                res[i] = st.peek();     // assign the peek of stack
            }

            st.push(arr[i]);        // now push the element into the stack
        }

        return res;         // return the resultant array
    }

    private static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}