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
            case 20:
                run20();
                break;
            case 21:
                run21();
                break;
            case 22:
                run22();
                break;
            case 23:
                run23();
                break;
            case 24:
                run24();
                break;
            case 25:
                run25();
                break;
            case 26:
                run26();
                break;
            case 27:
                run27();
                break;
            case 28:
                run28();
                break;
            case 29:
                run29();
                break;
            case 30:
                run30();
                break;
            case 31:
                run31();
                break;
            case 32:
                run32();
                break;
            case 33:
                run33();
                break;
            case 34:
                run34();
                break;
            case 35:
                run35();
                break;
            case 36:
                run36();
                break;
            case 37:
                run37();
                break;
            case 165:
                run165();
                break;
            case 206:
                run206();
                break;
            case 233:
                run233();
                break;
            case 295:
                run295();
                break;
            case 313:
                run313();
                break;
            case 345:
                run345();
                break;
            case 413:
                run413();
                break;
            case 443:
                run443();
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
            case 528:
                run528();
                break;
            case 541:
                run541();
                break;
            case 551:
                run551();
                break;
            case 552:
                run552();
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
            case 787:
                run787();
                break;
            case 789:
                run789();
                break;
            case 797:
                run797();
                break;
            case 802:
                run802();
                break;
            case 847:
                run847();
                break;
            case 881:
                run881();
                break;
            case 1109:
                run1109();
                break;
            case 1137:
                run1137();
                break;
            case 1337:
                run1337();
                break;
            case 1480:
                run1480();
                break;
            case 1583:
                run1583();
                break;
            case 1588:
                run1588();
                break;
            case 1646:
                run1646();
                break;
            case 10022:
                runJZ22();
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

    static void run20() {
        String s = "()";
        S20 run = new S20();
        boolean result = run.isValid(s);
        print(result);
    }

    static void run21() {
        int[] l1nums = {1, 2, 4}, l2nums = {1, 3, 4};
        ListNode l1 = ListNode.makeList(l1nums);
        ListNode l2 = ListNode.makeList(l2nums);
        S21 run = new S21();
        ListNode result = run.mergeTwoLists(l1, l2);
        print(result);
    }

    static void run22() {
        int n = 3;
        S22 run = new S22();
        List<String> result = run.generateParenthesis(n);
        print(result);
    }

    static void run23() {
        int[][] listsNums = {{1, 4, 5}, {1, 3, 4}, {2, 6}};
        ListNode[] lists = ListNode.makeList(listsNums);
        S23 run = new S23();
        ListNode result = run.mergeKLists(lists);
        print(result);
    }

    static void run24() {
        int[] nums = {1, 2, 3, 4};
        ListNode head = ListNode.makeList(nums);
        S24 run = new S24();
        ListNode result = run.swapPairs(head);
        print(result);
    }

    static void run25() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        ListNode head = ListNode.makeList(nums);
        S25 run = new S25();
        ListNode result = run.reverseKGroup(head, k);
        print(result);
    }

    static void run26() {
        int[] nums = {1, 1, 2};
        S26 run = new S26();
        int result = run.removeDuplicates(nums);
        print(result);
        print(nums);
    }

    static void run27() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        S27 run = new S27();
        int result = run.removeElement(nums, val);
        print(result);
        print(nums);
    }

    static void run28() {
        String haystack = "hello", needle = "ll";
        S28 run = new S28();
        int result = run.strStr(haystack, needle);
        print(result);
    }

    static void run29() {
        int dividend = 10, divisor = 3;
        S29 run = new S29();
        int result = run.divide(dividend, divisor);
        print(result);
    }

    static void run30() {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        S30 run = new S30();
        List<Integer> result = run.findSubstring(s, words);
        print(result);
    }

    static void run31() {
        int[] nums = {1, 2, 3};
        S31 run = new S31();
        run.nextPermutation(nums);
        print(nums);
    }

    static void run32() {
        String s = "(()";
        S32 run = new S32();
        int result = run.longestValidParentheses(s);
        print(result);
    }

    static void run33() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        S33 run = new S33();
        int result = run.search(nums, target);
        print(result);
    }

    static void run34() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        S34 run = new S34();
        int[] result = run.searchRange(nums, target);
        print(result);
    }

    static void run35() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        S35 run = new S35();
        int result = run.searchInsert(nums, target);
        print(result);
    }

    static void run36() {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        S36 run = new S36();
        boolean result = run.isValidSudoku(board);
        print(result);
    }

    static void run37() {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        S37 run = new S37();
        run.solveSudoku(board);
        print(board);
    }

    static void run165() {
        String version1 = "1.01", version2 = "1.001";
        S165 run = new S165();
        int result = run.compareVersion(version1, version2);
        print(result);
    }

    static void run206() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.makeList(nums);
        S206 run = new S206();
        ListNode result = run.reverseList(head);
        print(result);
    }

    static void run233() {
        int n = 13;
        S233 run = new S233();
        int result = run.countDigitOne(n);
        print(result);
    }

    static void run295() {
        S295 run = new S295();
        run.addNum(1);
        run.addNum(2);
        print(run.findMedian());
        run.addNum(3);
        print(run.findMedian());
    }

    static void run313() {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        S313 run = new S313();
        int result = run.nthSuperUglyNumber(n, primes);
        print(result);
    }

    static void run345() {
        String s = "hello";
        S345 run = new S345();
        String result = run.reverseVowels(s);
        print(result);
    }

    static void run413() {
        int[] nums = {1, 2, 3, 4};
        S413 run = new S413();
        int result = run.numberOfArithmeticSlices(nums);
        print(result);
    }

    static void run443() {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        S443 run = new S443();
        int result = run.compress(chars);
        print(result);
        print(chars);
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

    static void run528() {
        int[] w = {1, 1, 1, 1};
        S528 run = new S528(w);
        int[] result = new int[w.length];
        for (int i = 0; i < 10000; i++)
            result[run.pickIndex()]++;
        print(result);
    }

    static void run541() {
        String s = "abcdefg";
        int k = 2;
        S541 run = new S541();
        String result = run.reverseStr(s, k);
        print(result);
    }

    static void run551() {
        String s = "PPALLP";
        S551 run = new S551();
        boolean result = run.checkRecord(s);
        print(result);
    }

    static void run552() {
        int n = 2;
        S552 run = new S552();
        int result = run.checkRecord(n);
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

    static void run787() {
        int[][] edges = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int n = 3, src = 0, dst = 2, k = 1;
        S787 run = new S787();
        int result = run.findCheapestPrice(n, edges, src, dst, k);
        print(result);
    }

    static void run789() {
        int[][] ghosts = {{1, 0}, {0, 3}};
        int[] target = {0, 1};
        S789 run = new S789();
        boolean result = run.escapeGhosts(ghosts, target);
        print(result);
    }

    static void run797() {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        S797 run = new S797();
        List<List<Integer>> result = run.allPathsSourceTarget(graph);
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

    static void run881() {
        int[] people = {1, 2};
        int limit = 3;
        S881 run = new S881();
        int result = run.numRescueBoats(people, limit);
        print(result);
    }

    static void run1109() {
        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int n = 5;
        S1109 run = new S1109();
        int[] result = run.corpFlightBookings(bookings, n);
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

    static void run1480() {
        int[] nums = {1, 2, 3, 4};
        S1480 run = new S1480();
        int[] result = run.runningSum(nums);
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

    static void run1588() {
        int[] arr = {1, 4, 2, 5, 3};
        S1588 run = new S1588();
        int result = run.sumOddLengthSubarrays(arr);
        print(result);
    }

    static void run1646() {
        int n = 7;
        S1646 run = new S1646();
        int result = run.getMaximumGenerated(n);
        print(result);
    }

    static void runJZ22() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        ListNode head = ListNode.makeList(nums);
        SJZ22 run = new SJZ22();
        ListNode result = run.getKthFromEnd(head, k);
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
        print(Arrays.toString(input));
    }

    static void print(double input) {
        System.out.println(input);
    }

    static void print(char[] input) {
        print(Arrays.toString(input));
    }

    static void print(char[][] input) {
        for (char[] input2 : input) print(Arrays.toString(input2));
    }

    static void print(String input) {
        System.out.println(input);
    }

    static void print(List<?> input) {
        System.out.println(input);
    }

    static void print(ListNode head) {
        for (ListNode now = head; now != null; now = now.next) System.out.print(now.val + " ");
    }
}
