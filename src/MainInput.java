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
            case 12:
                run12();
                break;
            case 13:
                run13();
                break;
            case 14:
                run14();
                break;
            case 15:
                run15();
                break;
            case 16:
                run16();
                break;
            case 17:
                run17();
                break;
            case 18:
                run18();
                break;
            case 19:
                run19();
                break;
            case 233:
                run233();
                break;
            case 313:
                run313();
                break;
            case 413:
                run413();
                break;
            case 446:
                run446();
                break;
            case 457:
                run457();
                break;
            case 516:
                run516();
                break;
            case 526:
                run526();
                break;
            case 576:
                run576();
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
            case 1583:
                run1583();
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
        ListNode l1 = ListNode.makeList(l1nums);
        ListNode l2 = ListNode.makeList(l2nums);
        S2 run = new S2();
        ListNode result = run.addTwoNumbers(l1, l2);
        print(result);
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

    static void run12() {
        int num = 3;
        S12 run = new S12();
        String result = run.intToRoman(num);
        print(result);
    }

    static void run13() {
        String s = "III";
        S13 run = new S13();
        int result = run.romanToInt(s);
        print(result);
    }

    static void run14() {
        String[] strs = {"flower", "flow", "flight"};
        S14 run = new S14();
        String result = run.longestCommonPrefix(strs);
        print(result);
    }

    static void run15() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        S15 run = new S15();
        List<List<Integer>> result = run.threeSum(nums);
        print(result);
    }

    static void run16() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        S16 run = new S16();
        int result = run.threeSumClosest(nums, target);
        print(result);
    }

    static void run17() {
        String digits = "23";
        S17 run = new S17();
        List<String> result = run.letterCombinations(digits);
        print(result);
    }

    static void run18() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        S18 run = new S18();
        List<List<Integer>> result = run.fourSum(nums, target);
        print(result);
    }

    static void run19() {
        int[] nums = {1, 2, 3, 4, 5};
        int n = 2;
        ListNode head = ListNode.makeList(nums);
        S19 run = new S19();
        ListNode result = run.removeNthFromEnd(head, n);
        print(result);
    }

    static void run233() {
        int n = 13;
        S233 run = new S233();
        int result = run.countDigitOne(n);
        print(result);
    }

    static void run313() {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        S313 run = new S313();
        int result = run.nthSuperUglyNumber(n, primes);
        print(result);
    }

    static void run413() {
        int[] nums = {1, 2, 3, 4};
        S413 run = new S413();
        int result = run.numberOfArithmeticSlices(nums);
        print(result);
    }

    static void run446() {
        int[] nums = {2, 4, 6, 8, 10};
        S446 run = new S446();
        int result = run.numberOfArithmeticSlices(nums);
        print(result);
    }

    static void run457() {
        int[] nums = {2, -1, 1, 2, 2};
        S457 run = new S457();
        boolean result = run.circularArrayLoop(nums);
        print(result);
    }

    static void run516() {
        String s = "bbbab";
        S516 run = new S516();
        int result = run.longestPalindromeSubseq(s);
        print(result);
    }

    static void run526() {
        int n = 15;
        S526 run = new S526();
        int result = run.countArrangement(n);
        print(result);
    }

    static void run576() {
        int m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0;
        S576 run = new S576();
        int result = run.findPaths(m, n, maxMove, startRow, startColumn);
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

    static void run1583() {
        int n = 4;
        int[][] preferences = {{1, 2, 3}, {3, 2, 0}, {3, 1, 0}, {1, 2, 0}};
        int[][] pairs = {{0, 1}, {2, 3}};
        S1583 run = new S1583();
        int result = run.unhappyFriends(n, preferences, pairs);
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

    static void print(List<?> input) {
        System.out.println(input);
    }

    static void print(ListNode head) {
        for (ListNode now = head; now != null; now = now.next)
            System.out.print(now.val + " ");
    }
}
