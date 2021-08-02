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
            case 2:
                // Q2. 两数相加
                // add-two-numbers
                run2();
                break;
            case 3:
                // Q3. 无重复字符的最长子串
                // longest-substring-without-repeating-characters
                run3();
                break;
            case 743:
                // Q743. 网络延迟时间
                // network-delay-time
                run743();
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

    static void run1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        S1 run = new S1();
        int[] result = run.twoSum(nums, target);
        print(result);
    }

    static void run2() {
        int[] l1nums = {2, 4, 3}, l2nums = {5, 6, 4};
        ListNode l1 = makeLinkedList(l1nums);
        ListNode l2 = makeLinkedList(l2nums);
        print(l1);
        print("");
        print(l2);
        print("");
        S2 run = new S2();
        ListNode result = run.addTwoNumbers(l1, l2);
        print(result);
    }

    static ListNode makeLinkedList(int[] source) {
        ListNode head = null, temp = new ListNode();
        for (int i : source) {
            temp.next = new ListNode(i);
            temp = temp.next;
            if (head == null) head = temp;
        }
        return head;
    }

    static void run3() {
        String s = "abcabcbb";
        S3 run = new S3();
        int result = run.lengthOfLongestSubstring(s);
        print(result);
    }

    static void run743() {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4, k = 2;
        S743 run = new S743();
        int result = run.networkDelayTime(times, n, k);
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

    static void print(ListNode head) {
        for (ListNode now = head; now != null; now = now.next)
            System.out.print(now.val + " ");
    }
}
