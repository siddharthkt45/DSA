// Here, in this question, we've to implement our own Queue class and its methods
// such as size, display, add, remove, peek. It should be a static queue whose size would be
// defined at the very start of the program and NOT in the runtime.

package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Normal_Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the queue:- ");
        int n = Integer.parseInt(br.readLine());

        CustomQueue qu = new CustomQueue(n);

        System.out.println("Enter your commands");
        String str = br.readLine();

        while (!str.equals("quit")) {       // until the console command says "quit", iterate
            if (str.startsWith("add")) {   // if the command starts with "add"
                int val = Integer.parseInt(str.split(" ")[1]);  // extract the value
                qu.add(val);                                         // add the value
            } else if (str.startsWith("remove")) {      // if the command starts with remove
                int val = qu.remove();  // remove the value from the queue start and store it
                if (val != -1) {        // if the value is NOT -1
                    System.out.println(val);    // print the value
                }
            } else if (str.startsWith("peek")) {     // if the command starts with "peek"
                int val = qu.peek();     // store the value from the start of the queue
                if (val != -1) {        // if the value is NOT -1
                    System.out.println(val);    // print the value
                }
            } else if (str.startsWith("size")) {    // if the command starts with "size"
                System.out.println(qu.size());      // print the size of the queue
            } else if (str.startsWith("display")) { // if the command starts with "display"
                qu.display();                       // display all the queue elements
            }
            str = br.readLine();        // again read the console for another command
        }
    }

    public static class CustomQueue {       // a custom Queue class
        int[] data;         // its data array
        int front;          // front variable
        int size;           // size variable

        public CustomQueue(int cap) {       // constructor of the class
            data = new int[cap];        // initialise the data array to the length provided
            front = 0;                  // initialise front to 0
            size = 0;                   // initialise size to 0
        }

        int size() {    // size function returns the total number of elements in the queue
            return size;        // size denotes the number of elements in the queue
        }

        void display() {        // display function prints the elements of the queue
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % data.length;
                System.out.print(data[idx] + " ");
            }
            System.out.println();
        }

        void add(int val) {     // add function inserts the given element into the queue
            if (size == data.length) {                  // if the stack is full
                System.out.println("Queue overflow");   // print queue overflow
            } else {                                    // else
                int rear = (front + size) % data.length;// insert element circularly at rear
                data[rear] = val;   // where rear is front + size modulus by size of array
                size++;             // increment size
            }
        }

        int remove() { // remove function removes the front element of the queue & returns it
            if (size == 0) {                            // if the queue is empty
                System.out.println("Queue underflow");  // print queue underflow
                return -1;                              // and return -1
            } else {                                // else
                int val = data[front];              // store the front element in a variable
                front = (front + 1) % data.length;  // increment front circularly
                size--;                             // decrement size of the array
                return val;                         // and return the stored value
            }
        }

        int peek() {        // peek function returns the front element of the queue
            if (size == 0) {                            // if the queue is empty
                System.out.println("Queue underflow");  // print queue underflow
                return -1;                              // and return -1
            } else {                    // else
                return data[front];     // return the front element of the queue
            }
        }
    }
}