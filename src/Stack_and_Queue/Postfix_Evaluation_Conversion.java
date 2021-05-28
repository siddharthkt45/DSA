// Here, in this question, we're given a postfix expression and
// we've to evaluate it and convert it into infix and prefix.

package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postfix_Evaluation_Conversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the expression:- ");
        String exp = br.readLine();

        Stack<Integer> value = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<String> infix = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {     // if the char is an
                int second = value.pop();   // operator, pop the second value from value stack
                int first = value.pop();    // and then the first value from the value stack
                int res = operation(first, second, ch);     // operate on the values
                value.push(res);        // push the result into the stack

                String pre2 = prefix.pop();     // pop the second value from prefix stack
                String pre1 = prefix.pop();     // pop the first value from prefix stack
                String pre = ch + pre1 + pre2;  // convert into prefix expression
                prefix.push(pre);       // push the resultant expression

                String in2 = infix.pop();       // pop the second value from infix stack
                String in1 = infix.pop();       // pop the first value from infix stack
                String in = "(" + in1 + ch + in2 + ")";     // convert into infix expression
                infix.push(in);         // push the resultant expression
            } else {            // if the char is a number
                value.push(ch - '0'); // convert into number & push it into value stack
                prefix.push(ch + ""); // convert into string & push it into prefix stack
                infix.push(ch + "");  // convert into string & push it into infix stack
            }
        }

        System.out.println("Answer:- " + value.pop());      // print the results
        System.out.println("Infix:- " + infix.pop());
        System.out.println("Prefix:- " + prefix.pop());
    }

    private static int operation(int first, int second, char ch) {  // function to perform the
        if (ch == '+') {                        // the corresponding operation as on the char
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