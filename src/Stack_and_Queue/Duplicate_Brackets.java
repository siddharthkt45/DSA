// Here, in this question, we're given an expression
// and we have to check whether there are unnecessary brackets in the expression
// For ex:- (a + b) + ((c + d)) should return true because there are unnecessary brackets
// If duplicates, print true else print false

package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Duplicate_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the expression:- ");
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {                    // check if the ch is a closing bracket, then
                if (st.peek() == '(') {         // check if the top of the stack is its counterpart or not
                    System.out.println(true);   // if yes, print true and
                    return;                     // return
                } else {                            // else
                    while (st.peek() != '(') {      // pop until you see the counterpart at
                        st.pop();                   // the top of the stack
                    }
                    st.pop();           // then pop once more to eliminate the opening bracket also
                }
            } else {            // if ch is not a closing bracket
                st.push(ch);    // push it into the stack
            }
        }

        System.out.println(false);      // if the program reaches here, it means that there were no
    }                                   // duplicate brackets, so print false
}