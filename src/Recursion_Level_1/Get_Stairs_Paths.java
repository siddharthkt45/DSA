// Here, in this question, we're given a number of stairs and
// we're given 3 choices whether to climb down 1 stair
// or to climb down 2 stairs or to climb down 3 stairs at once.
// We've to return all the paths formed by these combinations in an arraylist.

package Recursion_Level_1;

import java.util.*;

public class Get_Stairs_Paths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs:- ");
        int n = sc.nextInt();
        System.out.println("The stair paths possible are:- ");
        System.out.println(getStairsPaths(n));
    }

    private static ArrayList<String> getStairsPaths(int n) {
        if (n == 0) {               // Base case, if n becomes 0
            ArrayList<String> baseResult = new ArrayList<>();   // create a new arraylist
            baseResult.add("");     // add an empty string to that arraylist
            return baseResult;      // return the arraylist
        } else if (n < 0) {             // else if n becomes less than 0
            return new ArrayList<>();   // return a new arraylist
        }

        ArrayList<String> n1 = getStairsPaths(n - 1);    // Make the call to n - 1 & store it
        ArrayList<String> n2 = getStairsPaths(n - 2);    // Make the call to n - 2 & store it
        ArrayList<String> n3 = getStairsPaths(n - 3);    // Make the call to n - 3 & store it

        ArrayList<String> res = new ArrayList<>();      // create a new arraylist

        for (String i : n1) {       // iterate over n1 arraylist
            res.add("1" + i);       // and add 1 to all elements in the resultant arraylist
        }

        for (String i : n2) {       // iterate over n2 arraylist
            res.add("2" + i);       // and add 2 to all elements in the resultant arraylist
        }

        for (String i : n3) {       // iterate over n3 arraylist
            res.add("3" + i);       // and add 3 to all elements in the resultant arraylist
        }

        return res;     // return the resultant arraylist
    }
}