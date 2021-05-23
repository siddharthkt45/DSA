// Here, in this question, we're given a histogram data (a series of numbers)
// and we've to find the largest area histogram data,
// i.e., the data which covers the most area
// This question uses the concept of Next Smaller element on left and
// Next Smaller element on right

package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Largest_Area_Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the series:- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the series:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] rb = nextSmallerElementOnRight(arr);
        int[] lb = nextSmallerElementOnLeft(arr);

        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = rb[i] - lb[i] - 1;      // calculate the width of the data
            int area = arr[i] * width;          // calculate area
            if (area > maxArea) {               // if area is greater than maxArea
                maxArea = area;                 // assign area to maxArea
            }
        }

        System.out.println("Maximum area:- " + maxArea);
    }

    private static int[] nextSmallerElementOnLeft(int[] arr) { // function to calculate next
        Stack<Integer> st = new Stack<>();                  // smaller element on left side
        int[] lb = new int[arr.length];         // array for left boundary

        st.push(0);        // push 0 (index of first element) into the stack
        lb[0] = -1;             // assign -1 as the left boundary for this element

        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] < arr[st.peek()]) {  // keep popping till the current
                st.pop();                               // element is smaller than the stack top
            }

            if (st.size() == 0) {       // if the stack size is 0
                lb[i] = -1;             // assign -1 to that number
            } else {                    // else
                lb[i] = st.peek();      // assign stack top to that number
            }

            st.push(i);         // now, push the index of this element into the stack
        }

        return lb;      // return the resultant array
    }

    private static int[] nextSmallerElementOnRight(int[] arr) { // function to calculate next
        Stack<Integer> st = new Stack<>();                  // greater element on right side
        int[] rb = new int[arr.length];

        st.push(arr.length - 1);        // push the index of last element into the stack
        rb[arr.length - 1] = arr.length;     // assign the array length as the right boundary

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] < arr[st.peek()]) {  // keep popping till the current
                st.pop();                               // element is smaller than the stack top
            }

            if (st.size() == 0) {       // if the stack size is 0
                rb[i] = arr.length;     // assign array length to that element
            } else {                    // else
                rb[i] = st.peek();      // assign stack top to that element
            }

            st.push(i);         // push the index of this element into the stack
        }

        return rb;          // return the resultant array
    }
}