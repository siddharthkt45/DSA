// Here, in this question, we're given an expression and
// we've to find out whether the brackets in the expression are balanced or not
// For ex:- (a + b) + (c + d}) should return true because the brackets are not balanced
// If balanced, print true else print false

package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the expression:- ");
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {      // if the char is any kind of opening bracket
                st.push(ch);                                // push into the stack
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (!val) {                         // if val == false
                    System.out.println(false);      // print false
                    return;                         // return
                }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (!val) {
                    System.out.println(false);
                    return;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (!val) {
                    System.out.println(false);
                    return;
                }
            }
        }

        if (st.size() == 0) {           // if at the end, no element is left in the stack
            System.out.println(true);   // print true
        } else {                        // else
            System.out.println(false);  // print false
        }
    }

    // This function handles the closing brackets and takes the stack and the corresponding char as input
    // It returns true if the brackets correctly match and returns false if brackets do not match
    private static boolean handleClosing(Stack<Character> st, char correspondingCh) {
        if (st.size() == 0) {                           // if the size of stack is zero, we can't pop anything
            return false;                               // return false
        } else if (st.peek() != correspondingCh) {      // else if the peek of stack != corresponding char
            return false;                               // return false
        } else {                            // else
            st.pop();                       // pop from the stack and
            return true;                    // return true
        }
    }
}