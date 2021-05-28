package Stack_and_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Merge_Overlapping_Intervals {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array:- ");
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        System.out.println("Enter the pairs of starting and ending time:- ");
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            arr[i][0] = Integer.parseInt(line.split(" ")[0]);
            arr[i][1] = Integer.parseInt(line.split(" ")[0]);
        }

        mergeOverlappingIntervals(arr);
    }

    private static void mergeOverlappingIntervals(int[][] arr) {
        Pair[] pairs = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }

        Arrays.sort(pairs);

        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < pairs.length; i++) {
            if (i == 0) {
                st.push(pairs[i]);
            } else {
                Pair top = st.peek();

                if (pairs[i].st > top.et) {
                    st.push(pairs[i]);
                } else {
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }

        Stack<Pair> res = new Stack<>();

        while (st.size() > 0) {
            res.push(st.pop());
        }

        while (res.size() > 0) {
            Pair p = res.pop();
            System.out.println(p.st + " " + p.et);
        }
    }

    public static class Pair implements Comparable<Pair> {
        int st;
        int et;

        public Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }

        @Override
        public int compareTo(Pair other) {
            if (this.st != other.st) {
                return this.st - other.st;
            } else {
                return this.et - other.et;
            }
        }
    }
}