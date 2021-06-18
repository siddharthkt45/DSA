// Here, in this question, we've to implement a Minimum Stack
// in which we have a min() function, which returns the minimum value
// in the stack in O(1) time. We can use only O(1) space.

package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Minimum_Stack_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MinStack st = new MinStack();

        System.out.println("Enter your commands");
        String str = br.readLine();

        while (!str.equals("quit")) {       // until the console command says "quit", iterate
            if (str.startsWith("push")) {   // if the command starts with "push"
                int val = Integer.parseInt(str.split(" ")[1]);  // extract the value
                st.push(val);                                         // push the value
            } else if (str.startsWith("pop")) {         // if the command starts with pop
                int val = st.pop();     // remove the value from the stack top and store it
                if (val != -1) {        // if the value is NOT -1
                    System.out.println(val);    // print the value
                }
            } else if (str.startsWith("peek")) {     // if the command starts with "peek"
                int val = st.peek();     // store the value from the top of stack
                if (val != -1) {        // if the value is NOT -1
                    System.out.println(val);    // print the value
                }
            } else if (str.startsWith("min")) {     // if the command starts with "min"
                int val = st.min();     // store the value from the top of stack
                if (val != -1) {        // if the value is NOT -1
                    System.out.println(val);    // print the value
                }
            } else if (str.startsWith("size")) {    // if the command starts with "size"
                System.out.println(st.size());      // print the size of the stack
            }
            str = br.readLine();        // again read the console for another command
        }
    }

    private static class MinStack {         // a custom stack class
        Stack<Integer> data;                // a stack to store all the elements
        int min;                            // a variable to store the minimum element

        public MinStack() {             // constructor of the class
            data = new Stack<>();       // initialise the stack
        }

        int size() {                    // size function returns the size of the data stack
            return data.size();
        }

        void push(int val) {    // push function to insert the new element into the stack
            if (size() == 0) {      // if stack is empty
                data.push(val);     // simply push the element into the stack
                min = val;          // and assign it as the min value
            } else if (val < min) {                 // else if the value is smaller than min
                data.push(val + (val - min)); // detection, storing a fake smaller value
                min = val;                          // original value stored in min
            } else {                // else, when the value is greater than min
                data.push(val);     // simply push the value into the stack
            }
        }

        int pop() {             // pop function removes the top value from the stack
            if (size() == 0) {                          // if the stack is empty
                System.out.println("Stack underflow");  // print stack underflow
                return -1;                              // and return -1
            } else {                        // else
                if (data.peek() >= min) {   // if top element is greater than min element
                    return data.pop();      // return the top element
                } else {                        // else
                    int originalValue = min;    // store the min value in a variable
                    min = 2 * min - data.pop(); // restore the previous min value
                    return originalValue;       // return the stored min value
                }
            }
        }

        int peek() {            // peek function returns the top value in the stack
            if (size() == 0) {                          // if the stack is empty
                System.out.println("Stack underflow");  // print stack underflow
                return -1;                              // and return -1
            } else if (data.peek() >= min) { // else if the top element is greater than min
                return data.peek();          // return the top element
            } else {            // else if the top element is smaller than the min element
                return min;     // return the min element
            }
        }

        int min() {         // min function returns the minimum element from the stack
            if (size() == 0) {                          // if the stack is empty
                System.out.println("Stack underflow");  // print stack underflow
                return -1;                              // and return -1
            } else {            // else
                return min;     // return the min element
            }
        }
    }
}