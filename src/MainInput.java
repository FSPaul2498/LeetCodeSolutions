// Author BaiXu
// LeetCode Solutions
// Main Input Class
// Questions and Examples Index

import java.util.Arrays;

public class MainInput {
    public static void main(String[] args) {
        int option;
        try {
            option = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            option = 0;
        }
        print("Solve Question #" + option);
        switch (option) {
            case 1:
                // Q1. 两数之和
                // two-sum
                run1();
                break;
            case 1337:
                // Q1337. 矩阵中战斗力最弱的 K 行
                // the-k-weakest-rows-in-a-matrix
                run1337();
                break;
            default:
                print("Wrong Question Num");
        }
    }

    static void run0() {
        /*
         This is a Method Template
         Initialize Variables
         S0 run = new S0();
         int result = run.methods();
         print(result);
        */
    }

    static void run1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        S1 run = new S1();
        int[] result = run.twoSum(nums, target);
        print(result);
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

    static void print(String input) {
        System.out.println(input);
    }
}
