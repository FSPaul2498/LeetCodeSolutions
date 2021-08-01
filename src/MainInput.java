// Author BaiXu
// LeetCode Solutions
// Main Input Class
// Questions and Examples Index

import java.util.Arrays;

public class MainInput {
    public static void main(String[] args) {
        // Q1337. 矩阵中战斗力最弱的 K 行
        // the-k-weakest-rows-in-a-matrix
        run1337();
    }

    static void run1337() {
        int[][] mat = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        int k = 3;
        S1337 run = new S1337();
        int[] result = run.kWeakestRows(mat, k);
        print(result);
    }

    // Simplify System.out.println
    static void print(int input) {
        System.out.println(input);
    }

    static void print(int[] input) {
        System.out.println(Arrays.toString(input));
    }
}
