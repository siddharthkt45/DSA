// Here, in this question, we're given a series of integers
// and we've to calculate the span on left of each element
// if there is no greater element on the left to any number, assign (index + 1) to that number
// create an array to store the span on left for each element
// In this method, we iterate left to right ->
// Span of any number is calculated as the distance between
// the number and the next greater element on left

package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the stock series:- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the stock series:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] stockSpan = stockSpan(arr);
        display(stockSpan);
    }

    private static void display(int[] arr) {        // function to display an array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    private static int[] stockSpan(int[] arr) {     // function to calculate stock span
        Stack<Integer> st = new Stack<>();
        int[] span = new int[arr.length];           // resultant array

        st.push(0);         // push the index of first element
        span[0] = 1;            // assign span as 1 (index + 1) for the first number
                                // since there is no number on the left
        for (int i = 1; i < arr.length; i++) {  // iterate till the end of array
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {  // keep popping till the new
                st.pop();                           // element is greater than the stack top
            }

            if (st.size() == 0) {       // if the size of stack is 0
                span[i] = i + 1;        // assign (index + 1) as span
            } else {                        // else
                span[i] = i - st.peek();    // assign (index of number- index of stack top)
            }

            st.push(i);         // now, push into the stack
        }

        return span;        // return the span array
    }
}