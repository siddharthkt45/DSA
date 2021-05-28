// Here, in this question, we're given a binary 2D array and
// we've to find the celebrity in that matrix.
// A celebrity is a one whom everyone knows but it knows nobody.
// Here, arr[i][j] == 1 means that i knows j whereas
// arr[i][j] == 0 means that i does not know j

package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Celebrity_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix:- ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter the elements of the matrix:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        findCelebrity(arr);
    }

    private static void findCelebrity(int[][] arr) {    // function to find the celebrity
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {      // push all the indices into the stack
            st.push(i);
        }

        while (st.size() > 1) {     // while stack has more than 1 elements
            int i = st.pop();       // pop the first element and store it
            int j = st.pop();       // pop the second element and store it

            if (arr[i][j] == 1) {   // if i knows j, that means i is not a celebrity...
                st.push(j);         // so push j which may be a potential celebrity
            } else {                // else
                st.push(i);         // push i which may be a potential celebrity
            }
        }

        int pot = st.pop();     // pot means potential celebrity... store the last element in this

        boolean flag = true;    // declare a boolean flag with default as true

        for (int i = 0; i < arr.length; i++) {  // iterate through all the indices
            if (i != pot) {         // when i != pot (diagonal condition)
                if (arr[i][pot] == 0 || arr[pot][i] == 1) { // if i does not know pot or
                    flag = false;                           // pot knows i, assign false and
                    break;                                  // break from the loop
                }
            }
        }

        if (flag) {         // if the flag is true, that means the pot is a celebrity
            System.out.println("Celebrity is:- " + pot);
        } else {            // if the flag is false, that means the pot is not a celebrity
            System.out.println("There is no celebrity...");
        }
    }
}