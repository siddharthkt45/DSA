// Here, in this question, we're given an infix expression and
// we've to convert it into its prefix and postfix equivalent

package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Infix_Conversions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the expression:- ");
        String exp = br.readLine();

        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {            // if the char is an opening bracket
                operators.push(ch);     // push it into the operators stack
            } else if ((ch >= '0' && ch <= '9') ||      // if it is any numeral or
                       (ch >= 'a' && ch <= 'z') ||      // it is any lowercase char or
                       (ch >= 'A' && ch <= 'Z')) {      // it is any uppercase char
                prefix.push(ch + "");       // push it into the prefix stack and
                postfix.push(ch + "");      // push it into the postfix stack also
            } else if (ch == ')') {                 // if the char is a closing bracket
                while (operators.peek() != '(') {   // pop till the operator stack top sees a '('
                    process(prefix, postfix, operators);    // call the process method
                }
                operators.pop();        // now pop the opening bracket also
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {  // if the char is an
                while (operators.size() > 0 &&                              // operator
                       operators.peek() != '(' &&
                       precedence(ch) <= precedence(operators.peek())) {
                    process(prefix, postfix, operators);    // call the process method
                }
                operators.push(ch);     // now push the char into the operators stack
            }
        }

        while (operators.size() > 0) {      // now if something is left in the operators stack
            process(prefix, postfix, operators);    // call the process method again till it
        }                                           // becomes empty

        System.out.println("Prefix:- " + prefix.pop());     // print the prefix result
        System.out.println("Postfix:- " + postfix.pop());   // print the postfix result
    }

    private static void process(    // function to process the prefix and postfix equivalents
            Stack<String> prefix,
            Stack<String> postfix,
            Stack<Character> operators
    ) {
        char op = operators.pop();      // pop the operator from the operators stack

        String preval2 = prefix.pop();      // pop from the prefix stack to get the 2nd value
        String preval1 = prefix.pop();      // pop from the prefix stack to get the 1st value
        String pre = op + preval1 + preval2;    // evaluate the prefix equivalent
        prefix.push(pre);       // push the prefix equivalent into the prefix stack

        String postval2 = postfix.pop();    // pop from the postfix stack to get the 2nd value
        String postval1 = postfix.pop();    // pop from the postfix stack to get the 1st value
        String post = postval1 + postval2 + op;     // evaluate the postfix equivalent
        postfix.push(post);     // push the postfix equivalent into the postfix stack
    }

    private static int precedence(char ch) { // function that returns the precedence of any char
        if (ch == '+' || ch == '-') {       // 1 for + and -
            return 1;
        } else if (ch == '*' || ch == '/') {    // 2 for * and /
            return 2;
        } else {            // and 0 for any other char
            return 0;
        }
    }
}