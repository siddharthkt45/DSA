// Here, in this question, we're given a series of integers
// and we've to calculate the next greater element on right of each element
// if there is no greater element on the right to any number, assign -1 to that number
// create an array to store the next greater elements on right for each element
// In this method, we iterate right to left <-

package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_On_Right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the series:- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the series:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] nextGreaterElement = nextGreaterElement(arr);
        display(nextGreaterElement);
    }

    private static void display(int[] nextGreaterElement) {     // a function to display the array
        for (int i : nextGreaterElement) {
            System.out.print(i + " ");
        }
    }

    private static int[] nextGreaterElement(int[] arr) {   // a function to calculate the next greater element
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];        // array to store the next greater element

        st.push(arr[arr.length - 1]);       // push the last element of the series into the stack
        res[res.length - 1] = -1;           // assign -1 for the last element

        for (int i = arr.length - 2; i >= 0; i--) {         // run the loop from second last element to 0
            while (st.size() > 0 && arr[i] >= st.peek()) {  // keep popping from stack until the new element
                st.pop();                       // is greater than the top of stack and size of stack > 0
            }

            if (st.size() == 0) {       // if stack size is 0 now, that means the element is greatest till now
                res[i] = -1;            // so, assign -1 to that number
            } else {                        // else
                res[i] = st.peek();         // assign the top of the stack as the next greater element
            }

            st.push(arr[i]);        // now push the element into the stack
        }

        return res;         // return the resultant array
    }
}