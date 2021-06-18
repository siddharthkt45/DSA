// Here, in this question, we're given 2 Queues
// and we have to implement a Stack using those 2 Queues.
// The Stack should be Pop efficient,
// which means that the pop() and peek() operations should take constant O(1) time,
// but the push() operation can take linear O(n) time.

package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackAdapterPop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        QueueToStackAdapter st = new QueueToStackAdapter();

        System.out.println("Enter your commands");
        String str = br.readLine();

        while (!str.equals("quit")) {       // until the console command says "quit", iterate
            if (str.startsWith("push")) {   // if the command starts with "add"
                int val = Integer.parseInt(str.split(" ")[1]);  // extract the value
                st.push(val);                                         // add the value
            } else if (str.startsWith("pop")) {      // if the command starts with remove
                int val = st.pop();  // remove the value from the queue start and store it
                if (val != -1) {        // if the value is NOT -1
                    System.out.println(val);    // print the value
                }
            } else if (str.startsWith("peek")) {     // if the command starts with "peek"
                int val = st.peek();    // store the value at the start of the queue
                if (val != -1) {        // if the value is NOT -1
                    System.out.println(val);    // print the value
                }
            } else if (str.startsWith("size")) {    // if the command starts with "size"
                System.out.println(st.size());      // print the size of the queue
            }
            str = br.readLine();        // again read the console for another command
        }
    }

    private static class QueueToStackAdapter {  // a custom Stack class made using 2 Queues
        Queue<Integer> mainQ;       // the main queue for storing elements
        Queue<Integer> helperQ;     // the helper queue for helping the main queue

        public QueueToStackAdapter() {  // constructor of the class
            mainQ = new ArrayDeque<>();     // initialise the main queue
            helperQ = new ArrayDeque<>();   // initialise the helper queue
        }

        int size() {    // size function returns the size of the main queue
            return mainQ.size();
        }

        void push(int val) {    // push function inserts the new element into the main queue
            if (mainQ.size() == 0) {        // if the queue is empty
                mainQ.add(val);             // simply insert the new element
            } else {                                // else
                while (mainQ.size() > 0) {          // while the main queue is NOT empty
                    helperQ.add(mainQ.remove());    // transfer elements from mainQ to helperQ
                }

                mainQ.add(val);     // add the new element to main queue

                while (helperQ.size() > 0) {        // while the helper queue is not empty
                    mainQ.add(helperQ.remove());    // transfer elements from helperQ to mainQ
                }
            }
        }

        int pop() {     // pop function removes the front most element from the main queue
            if (mainQ.size() == 0) {                    // if the main queue is empty
                System.out.println("Stack underflow");  // print stack underflow
                return -1;                              // and return -1
            } else {                   // else
                return mainQ.remove(); // remove the front element from main queue & return it
            }
        }

        int peek() {    // peek function returns the front most element from the main queue
            if (mainQ.size() == 0) {                    // if the main queue is empty
                System.out.println("Stack underflow");  // print stack underflow
                return -1;                              // and return -1
            } else {                        // else
                return mainQ.peek();        // return the front element from main queue
            }
        }
    }
}