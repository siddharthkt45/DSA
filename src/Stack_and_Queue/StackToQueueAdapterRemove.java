// Here, in this question, we're given 2 Stacks
// and we've to implement a Queue using those 2 Stacks.
// The Queue should be Remove efficient,
// which means that the remove() and peek() operations should take constant O(1) time,
// but the add() operation can take linear O(n) time.

package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackToQueueAdapterRemove {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StackToQueueAdapter st = new StackToQueueAdapter();

        System.out.println("Enter your commands");
        String str = br.readLine();

        while (!str.equals("quit")) {       // until the console command says "quit", iterate
            if (str.startsWith("add")) {   // if the command starts with "add"
                int val = Integer.parseInt(str.split(" ")[1]);  // extract the value
                st.add(val);                                         // push the value
            } else if (str.startsWith("remove")) {      // if the command starts with "remove"
                int val = st.remove();     // remove the value from the stack top and store it
                if (val != -1) {        // if the value is NOT -1
                    System.out.println(val);    // print the value
                }
            } else if (str.startsWith("peek")) {     // if the command starts with "top"
                int val = st.peek();     // store the value from the top of stack
                if (val != -1) {        // if the value is NOT -1
                    System.out.println(val);    // print the value
                }
            } else if (str.startsWith("size")) {    // if the command starts with "size"
                System.out.println(st.size());      // print the size of the stack
            }
            str = br.readLine();        // again read the console for another command
        }
    }

    private static class StackToQueueAdapter {  // a custom Queue class made using 2 Stacks
        Stack<Integer> mainS;           // the main stack for storing elements
        Stack<Integer> helperS;         // the helper stack for helping the main stack

        public StackToQueueAdapter() {      // constructor of the class
            mainS = new Stack<>();          // initialise the main stack
            helperS = new Stack<>();        // initialise the helper stack
        }

        int size() {        // size function returns the size of the main stack
            return mainS.size();
        }

        void add(int val) {     // add function inserts the new element into the main stack
            while (mainS.size() > 0) {      // while the main stack is NOT empty
                helperS.push(mainS.pop());  // transfer elements from mainS to helperS
            }

            mainS.push(val);        // store the last element

            while (helperS.size() > 0) {    // while the helper stack is NOT empty
                mainS.push(helperS.pop());  // transfer elements from helperS to mainS
            }
        }

        int remove() {  // remove function removes & returns the top element of the main stack
            if (mainS.size() == 0) {                    // if the stack is empty
                System.out.println("Queue underflow");  // print stack underflow
                return -1;                              // and return -1
            } else {                    // else
                return mainS.pop();     // remove and return the top most element
            }
        }

        int peek() {    // peek function returns the top element of the main stack
            if (mainS.size() == 0) {                    // if the stack is empty
                System.out.println("Queue underflow");  // print stack underflow
                return -1;                              // and return -1
            } else {                    // else
                return mainS.peek();    // return the top most element
            }
        }
    }
}