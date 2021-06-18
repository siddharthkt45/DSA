// Here, in this question, we've to implement a Minimum Stack
// in which we have a min() function, which returns the minimum value
// in the stack in O(1) time. We can use O(n) space though.

package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Minimum_Stack_1 {
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

    private static class MinStack {      // a custom Stack class
        Stack<Integer> allData;         // a stack which will contain all elements
        Stack<Integer> minData;         // a stack which will contain only minimum elements

        public MinStack() {             // constructor for class
            allData = new Stack<>();    // initialise the allData stack
            minData = new Stack<>();    // initialise the minData stack
        }

        int size() {                    // returns the total number of elements in the stack
            return allData.size();
        }

        void push(int val) {    // push function inserts the new element into the stack
            allData.push(val);      // insert into the allData stack
            if (minData.size() == 0 || val <= minData.peek()) { // if val is the smallest
                minData.push(val);  // insert into the minData stack
            }
        }

        int pop() {     // pop function removes the element at the top of stack & returns it
            if (allData.size() == 0) {                  // if the stack is empty
                System.out.println("Stack underflow");  // print stack underflow
                return -1;                              // and return -1
            } else {                        // else
                int val = allData.pop();    // store the top element into a variable

                if (val == minData.peek()) {    // if the element is also the smallest num
                    minData.pop();              // pop it from minData stack also
                }

                return val;         // return the stored value
            }
        }

        int peek() {    // peek function returns the element at the top of the stack
            if (allData.size() == 0) {                  // if allData stack is empty
                System.out.println("Stack underflow");  // print stack underflow
                return -1;                              // and return -1
            } else {                        // else
                return allData.peek();      // return the top of stack element
            }
        }

        int min() {     // min function returns the minimum element in the stack
            if (minData.size() == 0) {                  // if minimum stack is empty
                System.out.println("Stack underflow");  // print stack underflow
                return -1;                              // and return -1
            } else {                                // else
                return minData.peek();              // return minimum element
            }
        }
    }
}