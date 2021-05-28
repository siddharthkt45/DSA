// Here, in this question, we're given an infix expression
// and we've to evaluate it using stack. For ex.,
// 2 * 3 + (9 - 5) / 4
// Result:- 7

package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Infix_Evaluation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the expression:- ");
        String exp = br.readLine();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {            // if the char is an opening bracket
                operators.push(ch);     // push it into the operand stack
            } else if (Character.isDigit(ch)) {     // check if the char is a digit, convert it
                operands.push(ch - '0');     // into decimal push it into the operand stack
            } else if (ch == ')') {                 // if the char is a closing bracket
                while (operators.peek() != '(') {   // pop until we see the opening bracket on top
                    char op = operators.pop();      // pop out the operator
                    int val2 = operands.pop();      // pop out the second value
                    int val1 = operands.pop();      // pop out the first value

                    int res = operation(val1, val2, op);    // call the operation function
                    operands.push(res);             // push the result into the operand stack
                }
                operators.pop();        // now, pop out the opening bracket also
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {  // if the char is an
                while (operators.size() > 0 && operators.peek() != '(' &&   // operator, pop until
                       precedence(ch) <= precedence(operators.peek())) {    // the operator stack
                    char op = operators.pop();          // size > 0 and operator stack top is not
                    int val2 = operands.pop();          // an opening bracket and precedence of
                    int val1 = operands.pop();          // the char is less than the stack top

                    operands.push(operation(val1, val2, op));       // push the result into the
                }                                                   // operand stack
                operators.push(ch);     // push the char into the operators stack
            }
        }

        while (operators.size() != 0) { // repeat the operation until operators stack is not empty
            char op = operators.pop();
            int val2 = operands.pop();
            int val1 = operands.pop();

            operands.push(operation(val1, val2, op));
        }

        System.out.println("Result:- " + operands.peek());  // print the result
    }

    // this function does the operation represented by the char on val1 & val2 and returns it
    private static int operation(int val1, int val2, char ch) {
        if (ch == '+') {
            return val1 + val2;
        } else if (ch == '-') {
            return val1 - val2;
        } else if (ch == '*') {
            return val1 * val2;
        } else {
            return val1 / val2;
        }
    }

    // this function returns the precedence of the operators
    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else {
            return 0;
        }
    }
}