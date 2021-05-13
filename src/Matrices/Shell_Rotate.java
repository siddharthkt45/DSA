package Matrices;

import java.util.Scanner;

public class Shell_Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:- ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:- ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of matrix:- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int s = sc.nextInt();       // shell number
        int r = sc.nextInt();       // number of rotations

        rotateShell(arr, s, r);
    }

    private static void rotateShell(int[][] arr, int s, int r) {
        int[] oned = fillOnedFromShell(arr, s);
        rotate(oned, r);
        fillShellFromOned(arr, s, oned);
    }

    private static void fillShellFromOned(int[][] arr, int s, int[] oned) {

    }

    private static void rotate(int[] oned, int r) {
        int n = oned.length;
        r = r % n;

        if (r < 0) {
            r = r + n;
        }
        reverse(oned, 0, n-r-1);
        reverse(oned, n-r, n-1);
        reverse(oned, 0, n-1);
    }

    private static void reverse(int[] oned, int i, int j) {
        while (i < j) {
            int temp = oned[i];
            oned[i] = oned[j];
            oned[j] = temp;
            i++;
            j--;
        }
    }

    private static int[] fillOnedFromShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int size = 2 * (maxr - minr + maxc - minc);

        int[] oned = new int[size];

        int idx = 0;
        // lw
        for (int i = minr, j = minc; i <= maxr; i++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // bw
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // rw
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        //tw
        for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        return oned;
    }
}
