// Author BaiXu
// LeetCode Solutions
// Main Input Class

import java.util.Arrays;
import java.util.List;

public class MainInput {
    public static void main(String[] args) {
        int option;
        try {
            option = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            option = 0;
        }
        print("Solve Problem #" + option);
        switch (option) {
            case 1:
                run1();
                break;
            case 2:
                run2();
                break;
            case 3:
                run3();
                break;
            case 4:
                run4();
                break;
            case 5:
                run5();
                break;
            case 6:
                run6();
                break;
            case 7:
                run7();
                break;
            case 8:
                run8();
                break;
            case 9:
                run9();
                break;
            case 10:
                run10();
                break;
            case 11:
                run11();
                break;
            case 313:
                run313();
                break;
            case 457:
                run457();
                break;
            case 581:
                run581();
                break;
            case 611:
                run611();
                break;
            case 743:
                run743();
                break;
            case 802:
                run802();
                break;
            case 847:
                run847();
                break;
            case 1137:
                run1137();
                break;
            case 1337:
                run1337();
                break;
            default:
                print("Wrong Problem Num");
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

    static void run4() {
        int[] nums1 = {1, 3}, nums2 = {2};
        S4 run = new S4();
        double result = run.findMedianSortedArrays(nums1, nums2);
        print(result);
    }

    static void run5() {
        String s = "babad";
        S5 run = new S5();
        String result = run.longestPalindrome(s);
        print(result);
    }

    static void run6() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        S6 run = new S6();
        String result = run.convert(s, numRows);
        print(result);
    }

    static void run7() {
        int x = 123;
        S7 run = new S7();
        int result = run.reverse(x);
        print(result);
    }

    static void run8() {
        String x = "42";
        S8 run = new S8();
        int result = run.myAtoi(x);
        print(result);
    }

    static void run9() {
        int x = 121;
        S9 run = new S9();
        boolean result = run.isPalindrome(x);
        print(result);
    }

    static void run10() {
        String s = "aa", p = "a";
        S10 run = new S10();
        boolean result = run.isMatch(s, p);
        print(result);
    }

    static void run11() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        S11 run = new S11();
        int result = run.maxArea(height);
        print(result);
    }

    static void run313() {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        S313 run = new S313();
        int result = run.nthSuperUglyNumber(n, primes);
        print(result);
    }

    static void run457() {
        int[] nums = {2, -1, 1, 2, 2};
        S457 run = new S457();
        boolean result = run.circularArrayLoop(nums);
        print(result);
    }

    static void run581() {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        S581 run = new S581();
        int result = run.findUnsortedSubarray(nums);
        print(result);
    }

    static void run611() {
        int[] nums = {2, 2, 3, 4};
        S611 run = new S611();
        int result = run.triangleNumber(nums);
        print(result);
    }

    static void run743() {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4, k = 2;
        S743 run = new S743();
        int result = run.networkDelayTime(times, n, k);
        print(result);
    }

    static void run802() {
        int[][] graph = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        S802 run = new S802();
        List<Integer> result = run.eventualSafeNodes(graph);
        print(result);
    }

    static void run847() {
        int[][] graph = {{1, 2, 3}, {0}, {0}, {0}};
        S847 run = new S847();
        int result = run.shortestPathLength(graph);
        print(result);
    }

    static void run1137() {
        int n = 4;
        S1137 run = new S1137();
        int result = run.tribonacci(n);
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
    static void print(boolean input) {
        System.out.println(input);
    }

    static void print(int input) {
        System.out.println(input);
    }

    static void print(int[] input) {
        System.out.println(Arrays.toString(input));
    }

    static void print(double input) {
        System.out.println(input);
    }

    static void print(String input) {
        System.out.println(input);
    }

    static void print(List<Integer> input) {
        System.out.println(input);
    }

    static void print(ListNode head) {
        for (ListNode now = head; now != null; now = now.next)
            System.out.print(now.val + " ");
    }
}
