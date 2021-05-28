// Here, in this question, we've to implement our own Stack class and its methods
// such as size, display, push, pop, top. It should be a static stack whose size would be
// defined at the very start of the program and NOT in the runtime.

package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Normal_Stack {
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

    public static class CustomStack {   // a custom stack class
        int[] data;         // its data array
        int tos;            // top of stack variable

        public CustomStack(int cap) {       // constructor of the class
            data = new int[cap];        // initialise the data array to the length provided
            tos = -1;                   // initialise the tos to -1
        }

        int size() {        // size function returns the size of the stack at any given time
            return tos + 1;     // size of the stack is tos + 1
        }

        void display() {    // display function displays the stack elements in a line
            for (int i = tos; i >= 0; i--) {        // print the stack elements
                System.out.print(data[i] + " ");    // separated by a space
            }
            System.out.println();       // give a line break
        }

        void push(int val) {        // push function inserts the given element in the stack
            if (tos == data.length - 1) {               // if the stack is full
                System.out.println("Stack overflow");   // print stack overflow
            } else {                // else
                tos++;              // increment tos
                data[tos] = val;    // and insert the element at that position
            }
        }

        int pop() {         // pop function removes the element at the top of the stack
            if (tos == -1) {                            // if the stack is empty
                System.out.println("Stack underflow");  // print stack underflow
                return -1;                              // and return -1
            } else {                    // else
                int val = data[tos];    // store the top of the stack in a variable
                tos--;                  // decrement tos
                return val;             // and return the stored value
            }
        }

        int top() {         // top function returns the element at the top of the stack
            if (tos == -1) {                            // if the stack is empty
                System.out.println("Stack underflow");  // print stack underflow
                return -1;                              // and return -1
            } else {                    // else
                return data[tos];       // return the element at the top of stack
            }
        }
    }
}