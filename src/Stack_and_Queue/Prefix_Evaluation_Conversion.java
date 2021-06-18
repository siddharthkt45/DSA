// Here, in this question, we're given a prefix expression and
// we've to evaluate it and convert it into infix and postfix.

package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Prefix_Evaluation_Conversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the prefix expression:- ");
        String exp = br.readLine();

        Stack<Integer> value = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') { // if char is an operator
                int first = value.pop();
                int second = value.pop();
                int res = operation(first, second, ch);     // operate on both the values
                value.push(res);        // push the result into the value stack

                String post1 = postfix.pop();
                String post2 = postfix.pop();
                String post = post1 + post2 + ch;           // convert into postfix expression
                postfix.push(post);     // push the result into the postfix stack

                String in1 = infix.pop();
                String in2 = infix.pop();
                String in = "(" + in1 + ch + in2 + ")";     // convert into infix expression
                infix.push(in);         // push the result into the infix stack
            } else {                            // else
                value.push(ch - '0');   // convert into number & push into value stack
                postfix.push(ch + "");  // convert into string & push into postfix stack
                infix.push(ch + "");    // convert into string & push into infix stack
            }
        }

        System.out.println("Answer:- " + value.pop());      // print the results
        System.out.println("Infix:- " + infix.pop());
        System.out.println("Postfix:- " + postfix.pop());
    }

    // function to perform the corresponding operation as the given character
    private static int operation(int first, int second, char ch) {
        if (ch == '+') {
            return first + second;
        } else if (ch == '-') {
            return first - second;
        } else if (ch == '*') {
            return first * second;
        } else {
            return first / second;
        }
    }
}