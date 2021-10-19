// Author BaiXu
// LeetCode Solutions
// Main Input Class

import java.util.ArrayList;
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
            case 38:
                run38();
                break;
            case 39:
                run39();
                break;
            case 40:
                run40();
                break;
            case 41:
                run41();
                break;
            case 42:
                run42();
                break;
            case 43:
                run43();
                break;
            case 44:
                run44();
                break;
            case 45:
                run45();
                break;
            case 46:
                run46();
                break;
            case 58:
                run58();
                break;
            case 68:
                run68();
                break;
            case 162:
                run162();
                break;
            case 165:
                run165();
                break;
            case 166:
                run166();
                break;
            case 187:
                run187();
                break;
            case 206:
                run206();
                break;
            case 211:
                run211();
                break;
            case 212:
                run212();
                break;
            case 223:
                run223();
                break;
            case 230:
                run230();
                break;
            case 233:
                run233();
                break;
            case 273:
                run273();
                break;
            case 282:
                run282();
                break;
            case 284:
                run284();
                break;
            case 292:
                run292();
                break;
            case 295:
                run295();
                break;
            case 313:
                run313();
                break;
            case 326:
                run326();
                break;
            case 345:
                run345();
                break;
            case 352:
                run352();
                break;
            case 371:
                run371();
                break;
            case 405:
                run405();
                break;
            case 412:
                run412();
                break;
            case 413:
                run413();
                break;
            case 414:
                run414();
                break;
            case 430:
                run430();
                break;
            case 434:
                run434();
                break;
            case 437:
                run437();
                break;
            case 441:
                run441();
                break;
            case 443:
                run443();
                break;
            case 446:
                run446();
                break;
            case 447:
                run447();
                break;
            case 457:
                run457();
                break;
            case 470:
                run470();
                break;
            case 476:
                run476();
                break;
            case 482:
                run482();
                break;
            case 502:
                run502();
                break;
            case 516:
                run516();
                break;
            case 517:
                run517();
                break;
            case 524:
                run524();
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
            case 583:
                run583();
                break;
            case 600:
                run600();
                break;
            case 611:
                run611();
                break;
            case 639:
                run639();
                break;
            case 650:
                run650();
                break;
            case 673:
                run673();
                break;
            case 678:
                run678();
                break;
            case 704:
                run704();
                break;
            case 725:
                run725();
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
            case 1009:
                run1009();
                break;
            case 1109:
                run1109();
                break;
            case 1137:
                run1137();
                break;
            case 1221:
                run1221();
                break;
            case 1337:
                run1337();
                break;
            case 1436:
                run1436();
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
            case 1894:
                run1894();
                break;
            // 1XXXX for LCP & LCS
            // LCP 01 -> 10001 -> LCP01
            // LCS 01 -> 11001 -> LCS01
            case 10001:
                break;
            // 2XXXX for JianZhi Offer
            // 剑指 Offer 01 -> 20001 -> JZ1
            // 剑指 Offer II 001 -> 21001 -> JZII1
            case 20010:
                runJZ10();
                break;
            case 20022:
                runJZ22();
                break;
            case 21069:
                runJZII69();
                break;
            // 3XXXX for Interview Questions
            // 面试题 01.01 -> 30101 -> MS0101
            case 31714:
                runMS1714();
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

    static void run38() {
        int n = 15;
        S38 run = new S38();
        String result = run.countAndSay(n);
        print(result);
    }

    static void run39() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        S39 run = new S39();
        List<List<Integer>> result = run.combinationSum(candidates, target);
        print(result);
    }

    static void run40() {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        S40 run = new S40();
        List<List<Integer>> result = run.combinationSum2(candidates, target);
        print(result);
    }

    static void run41() {
        int[] nums = {1, 2, 0};
        S41 run = new S41();
        int result = run.firstMissingPositive(nums);
        print(result);
    }

    static void run42() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        S42 run = new S42();
        int result = run.trap(height);
        print(result);
    }

    static void run43() {
        String num1 = "2", num2 = "3";
        S43 run = new S43();
        String result = run.multiply(num1, num2);
        print(result);
    }

    static void run44() {
        String s = "aa", p = "a";
        S44 run = new S44();
        boolean result = run.isMatch(s, p);
        print(result);
    }

    static void run45() {
        int[] nums = {2, 3, 1, 1, 4};
        S45 run = new S45();
        int result = run.jump(nums);
        print(result);
    }

    static void run46() {
        int[] nums = {1, 2, 3};
        S46 run = new S46();
        List<List<Integer>> result = run.permute(nums);
        print(result);
    }

    static void run58() {
        String s = "Hello World";
        S58 run = new S58();
        int result = run.lengthOfLastWord(s);
        print(result);
    }

    static void run68() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        S68 run = new S68();
        List<String> result = run.fullJustify(words, maxWidth);
        print(result);
    }

    static void run162() {
        int[] nums = {1, 2, 3, 1};
        S162 run = new S162();
        int result = run.findPeakElement(nums);
        print(result);
    }

    static void run165() {
        String version1 = "1.01", version2 = "1.001";
        S165 run = new S165();
        int result = run.compareVersion(version1, version2);
        print(result);
    }

    static void run166() {
        int numerator = 1, denominator = 2;
        S166 run = new S166();
        String result = run.fractionToDecimal(numerator, denominator);
        print(result);
    }

    static void run187() {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        S187 run = new S187();
        List<String> result = run.findRepeatedDnaSequences(s);
        print(result);
    }

    static void run206() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = ListNode.makeList(nums);
        S206 run = new S206();
        ListNode result = run.reverseList(head);
        print(result);
    }

    static void run211() {
        WordDictionary run = new WordDictionary();
        run.addWord("bad");
        run.addWord("dad");
        run.addWord("mad");
        print(run.search("pad"));
        print(run.search("bad"));
        print(run.search(".ad"));
        print(run.search("b.."));
    }

    static void run212() {
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String[] words = {"oath", "pea", "eat", "rain"};
        S212 run = new S212();
        List<String> result = run.findWords(board, words);
        print(result);
    }

    static void run223() {
        int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
        S223 run = new S223();
        int result = run.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        print(result);
    }

    static void run230() {
        String line = "[3,1,4,null,2]";
        int k = 1;
        S230 run = new S230();
        TreeNode root = TreeNode.stringToTreeNode(line);
        int result = run.kthSmallest(root, k);
        print(result);
    }

    static void run233() {
        int n = 13;
        S233 run = new S233();
        int result = run.countDigitOne(n);
        print(result);
    }

    static void run273() {
        int num = 123;
        S273 run = new S273();
        String result = run.numberToWords(num);
        print(result);
    }

    static void run282() {
        String num = "123";
        int target = 6;
        S282 run = new S282();
        List<String> result = run.addOperators(num, target);
        print(result);
    }

    static void run284() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        PeekingIterator run = new PeekingIterator(al.iterator());
        print(run.next());
        print(run.peek());
        print(run.next());
        print(run.next());
        print(run.hasNext());
    }

    static void run292() {
        int n = 4;
        S292 run = new S292();
        boolean result = run.canWinNim(n);
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

    static void run326() {
        int n = 27;
        S326 run = new S326();
        boolean result = run.isPowerOfThree(n);
        print(result);
    }

    static void run345() {
        String s = "hello";
        S345 run = new S345();
        String result = run.reverseVowels(s);
        print(result);
    }

    static void run352() {
        SummaryRanges run = new SummaryRanges();
        run.addNum(1);
        print(run.getIntervals());
        run.addNum(3);
        print(run.getIntervals());
        run.addNum(7);
        print(run.getIntervals());
        run.addNum(2);
        print(run.getIntervals());
        run.addNum(6);
        print(run.getIntervals());
    }

    static void run371() {
        int a = 1, b = 2;
        S371 run = new S371();
        int result = run.getSum(a, b);
        print(result);
    }

    static void run405() {
        int num = 26;
        S405 run = new S405();
        String result = run.toHex(num);
        print(result);
    }

    static void run412() {
        int n = 15;
        S412 run = new S412();
        List<String> result = run.fizzBuzz(n);
        print(result);
    }

    static void run413() {
        int[] nums = {1, 2, 3, 4};
        S413 run = new S413();
        int result = run.numberOfArithmeticSlices(nums);
        print(result);
    }

    static void run414() {
        int[] nums = {3, 2, 1};
        S414 run = new S414();
        int result = run.thirdMax(nums);
        print(result);
    }

    static void run430() {
        // Test Env Sample Not Ready
        S430 run = new S430();
        Node result = run.flatten(new Node(0));
        print("Test Env Sample Not Ready");
    }

    static void run434() {
        String s = "Hello, my name is John";
        S434 run = new S434();
        int result = run.countSegments(s);
        print(result);
    }

    static void run437() {
        String line = "[10,5,-3,3,2,null,11,3,-2,null,1]";
        int targetSum = 8;
        S437 run = new S437();
        TreeNode root = TreeNode.stringToTreeNode(line);
        int result = run.pathSum(root, targetSum);
        print(result);
    }

    static void run441() {
        int n = 5;
        S441 run = new S441();
        int result = run.arrangeCoins(n);
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

    static void run447() {
        int[][] points = {{0, 0}, {1, 0}, {2, 0}};
        S447 run = new S447();
        int result = run.numberOfBoomerangs(points);
        print(result);
    }

    static void run457() {
        int[] nums = {2, -1, 1, 2, 2};
        S457 run = new S457();
        boolean result = run.circularArrayLoop(nums);
        print(result);
    }

    static void run470() {
        S470 run = new S470();
        int[] result = new int[10];
        for (int i = 0; i < 10000; i++)
            result[run.rand10() - 1]++;
        print(result);
    }

    static void run476() {
        int num = 5;
        S476 run = new S476();
        int result = run.findComplement(num);
        print(result);
    }

    static void run482() {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        S482 run = new S482();
        String result = run.licenseKeyFormatting(s, k);
        print(result);
    }

    static void run502() {
        int k = 2, w = 0;
        int[] profits = {1, 2, 3}, capital = {0, 1, 1};
        S502 run = new S502();
        int result = run.findMaximizedCapital(k, w, profits, capital);
        print(result);
    }

    static void run516() {
        String s = "bbbab";
        S516 run = new S516();
        int result = run.longestPalindromeSubseq(s);
        print(result);
    }

    static void run517() {
        int[] machines = {1, 0, 5};
        S517 run = new S517();
        int result = run.findMinMoves(machines);
        print(result);
    }

    static void run524() {
        String s = "abpcplea";
        String[] dict = {"ale", "apple", "monkey", "plea"};
        ArrayList<String> dictionary = new ArrayList<>(List.of(dict));
        S524 run = new S524();
        String result = run.findLongestWord(s, dictionary);
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

    static void run583() {
        String word1 = "sea", word2 = "eat";
        S583 run = new S583();
        int result = run.minDistance(word1, word2);
        print(result);
    }

    static void run600() {
        int n = 5;
        S600 run = new S600();
        int result = run.findIntegers(n);
        print(result);
    }

    static void run611() {
        int[] nums = {2, 2, 3, 4};
        S611 run = new S611();
        int result = run.triangleNumber(nums);
        print(result);
    }

    static void run639() {
        String s = "*";
        S639 run = new S639();
        int result = run.numDecodings(s);
        print(result);
    }

    static void run650() {
        int n = 3;
        S650 run = new S650();
        int result = run.minSteps(n);
        print(result);
    }

    static void run673() {
        int[] nums = {1, 3, 5, 4, 7};
        S673 run = new S673();
        int result = run.findNumberOfLIS(nums);
        print(result);
    }

    static void run678() {
        String s = "()";
        S678 run = new S678();
        boolean result = run.checkValidString(s);
        print(result);
    }

    static void run704() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        S704 run = new S704();
        int result = run.search(nums, target);
        print(result);
    }

    static void run725() {
        int[] nums = {1, 2, 3};
        int k = 5;
        ListNode head = ListNode.makeList(nums);
        S725 run = new S725();
        ListNode[] result = run.splitListToParts(head, k);
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

    static void run1009() {
        int n = 5;
        S1009 run = new S1009();
        int result = run.bitwiseComplement(n);
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

    static void run1221() {
        String s = "RLRRLLRLRL";
        S1221 run = new S1221();
        int result = run.balancedStringSplit(s);
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

    static void run1436() {
        // Test Env Sample Not Ready
        List<List<String>> paths = new ArrayList<>();
        S1436 run = new S1436();
        String result = run.destCity(paths);
        print("Test Env Sample Not Ready");
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

    static void run1894() {
        int[] chalk = {5, 1, 5};
        int k = 22;
        S1894 run = new S1894();
        int result = run.chalkReplacer(chalk, k);
        print(result);
    }

    static void runJZ10() {
        int n = 2;
        SJZ10 run = new SJZ10();
        int result = run.fib(n);
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

    static void runJZII69() {
        int[] arr = {0, 1, 0};
        SJZII69 run = new SJZII69();
        int result = run.peakIndexInMountainArray(arr);
        print(result);
    }

    static void runMS1714() {
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
        int k = 4;
        SMS1714 run = new SMS1714();
        int[] result = run.smallestK(arr, k);
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

    static void print(int[][] input) {
        for (int[] input2 : input) print(Arrays.toString(input2));
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

    static void print(ListNode[] input) {
        for (ListNode now : input) {
            System.out.print("[ ");
            print(now);
            System.out.println("]");
        }
    }
}
