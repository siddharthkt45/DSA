// Here, in this question, we've to implement our own Stack class and its methods
// such as size, display, push, pop, top. It should be a dynamic stack whose size should
// become double of its current size once its filled completely.

package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dynamic_Stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the stack:- ");
        int n = Integer.parseInt(br.readLine());

        CustomStack st = new CustomStack(n);

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
            } else if (str.startsWith("top")) {     // if the command starts with "top"
                int val = st.top();     // store the value from the top of stack
                if (val != -1) {        // if the value is NOT -1
                    System.out.println(val);    // print the value
                }
            } else if (str.startsWith("size")) {    // if the command starts with "size"
                System.out.println(st.size());      // print the size of the stack
            } else if (str.startsWith("display")) { // if the command starts with "display"
                st.display();                       // display all the stack elements
            }
            str = br.readLine();        // again read the console for another command
        }
    }

    public static class CustomStack {
        int[] data;         // its data array
        int tos;            // top of stack variable

        public CustomStack(int cap) {       // constructor of class
            data = new int[cap];        // initialise the data array
            tos = -1;                   // initialise the tos variable to -1
        }

        int size() {    // size function returns the total number of elements in the stack
            return tos + 1;     // size of the stack is tos + 1
        }

        void display() {        // display function prints all the elements of the stack
            for (int i = tos; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        void push(int val) {    // push function inserts any new element into the stack
            if (tos == data.length - 1) {                   // if the stack is full
                int[] ndata = new int[2 * data.length]; // create a new array twice the size
/*
                Copy the old data into the new one

                Manual method:-
                for (int i = 0; i < data.length; i++) {
                    ndata[i] = data[i];
                }

                Automatic method:-
*/
                System.arraycopy(data, 0, ndata, 0, data.length);
                data = ndata;           // make the old array point on the new array
            }
            tos++;              // increment the tos variable
            data[tos] = val;    // insert the value at the new position
        }

        int pop() {   // pop function removes the element at the top of stack and returns it
            if (tos == -1) {                            // if the stack is empty
                System.out.println("Stack underflow");  // print Stack underflow
                return -1;                              // and return -1
            } else {                    // else
                int val = data[tos];    // store the element at the top into a variable
                tos--;                  // decrement the tos variable
                return val;             // return the stored value
            }
        }

        int top() {     // top function returns the element at the top of stack
            if (tos == -1) {                            // if the stack is empty
                System.out.println("Stack underflow");  // print Stack underflow
                return -1;                              // and return -1
            } else {                // else
                return data[tos];   // return the element at the top
            }
        }
    }
}