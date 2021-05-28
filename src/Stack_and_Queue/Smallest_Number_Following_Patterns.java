// Here, in this question, we're given an expression consisting of d's and i's only.
// For each such char, we've to allot a number.
// An encounter with 'd' means that the next number in the sequence should be smaller than the
// previous one. Similarly, an encounter with 'i' means that the next number in the sequence
// should be larger than the previous one.
// Thus, we've to create the smallest such integer which follows the above rules.

package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Smallest_Number_Following_Patterns {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the expression:- ");
        String exp = br.readLine();

        Stack<Integer> st = new Stack<>();  // stack to store the numbers
        int num = 1;                        // initialise a number variable with 1

        for (int i = 0; i < exp.length(); i++) {    // iterate over the expression
            char ch = exp.charAt(i);

            if (ch == 'd') {        // if the char is d,
                st.push(num);       // push the number into the stack
                num++;              // and increment it
            } else {                // else
                st.push(num);       // push the number into the stack
                num++;              // and increment it

                while (st.size() > 0) {         // and till the stack is not empty
                    System.out.print(st.pop());     // pop out the numbers and print them
                }
            }
        }

        st.push(num);           // at last, push the last number into the stack

        while (st.size() > 0) {         // and until the stack is empty,
            System.out.print(st.pop());     // pop out the numbers and print them
        }
    }
}