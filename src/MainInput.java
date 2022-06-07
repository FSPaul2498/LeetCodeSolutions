// Author BaiXu
// LeetCode Solutions
// Main Input Class

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
            case 47:
                run47();
                break;
            case 58:
                run58();
                break;
            case 66:
                run66();
                break;
            case 68:
                run68();
                break;
            case 71:
                run71();
                break;
            case 89:
                run89();
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
            case 172:
                run172();
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
            case 219:
                run219();
                break;
            case 223:
                run223();
                break;
            case 229:
                run229();
                break;
            case 230:
                run230();
                break;
            case 233:
                run233();
                break;
            case 237:
                run237();
                break;
            case 240:
                run240();
                break;
            case 258:
                run258();
                break;
            case 260:
                run260();
                break;
            case 268:
                run268();
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
            case 299:
                run299();
                break;
            case 301:
                run301();
                break;
            case 306:
                run306();
                break;
            case 307:
                run307();
                break;
            case 310:
                run310();
                break;
            case 313:
                run313();
                break;
            case 318:
                run318();
                break;
            case 319:
                run319();
                break;
            case 326:
                run326();
                break;
            case 334:
                run334();
                break;
            case 335:
                run335();
                break;
            case 345:
                run345();
                break;
            case 352:
                run352();
                break;
            case 357:
                run357();
                break;
            case 367:
                run367();
                break;
            case 371:
                run371();
                break;
            case 372:
                run372();
                break;
            case 373:
                run373();
                break;
            case 375:
                run375();
                break;
            case 380:
                run380();
                break;
            case 382:
                run382();
                break;
            case 383:
                run383();
                break;
            case 384:
                run384();
                break;
            case 385:
                run385();
                break;
            case 386:
                run386();
                break;
            case 388:
                run388();
                break;
            case 390:
                run390();
                break;
            case 391:
                run391();
                break;
            case 393:
                run393();
                break;
            case 396:
                run396();
                break;
            case 397:
                run397();
                break;
            case 398:
                run398();
                break;
            case 400:
                run400();
                break;
            case 405:
                run405();
                break;
            case 407:
                run407();
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
            case 417:
                run417();
                break;
            case 419:
                run419();
                break;
            case 420:
                run420();
                break;
            case 423:
                run423();
                break;
            case 427:
                run427();
                break;
            case 429:
                run429();
                break;
            case 430:
                run430();
                break;
            case 432:
                run432();
                break;
            case 433:
                run433();
                break;
            case 434:
                run434();
                break;
            case 436:
                run436();
                break;
            case 437:
                run437();
                break;
            case 438:
                run438();
                break;
            case 440:
                run440();
                break;
            case 441:
                run441();
                break;
            case 442:
                run442();
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
            case 449:
                run449();
                break;
            case 450:
                run450();
                break;
            case 453:
                run453();
                break;
            case 457:
                run457();
                break;
            case 458:
                run458();
                break;
            case 462:
                run462();
                break;
            case 464:
                run464();
                break;
            case 467:
                run467();
                break;
            case 468:
                run468();
                break;
            case 470:
                run470();
                break;
            case 472:
                run472();
                break;
            case 473:
                run473();
                break;
            case 475:
                run475();
                break;
            case 476:
                run476();
                break;
            case 478:
                run478();
                break;
            case 479:
                run479();
                break;
            case 482:
                run482();
                break;
            case 488:
                run488();
                break;
            case 492:
                run492();
                break;
            case 495:
                run495();
                break;
            case 496:
                run496();
                break;
            case 500:
                run500();
                break;
            case 502:
                run502();
                break;
            case 504:
                run504();
                break;
            case 506:
                run506();
                break;
            case 507:
                run507();
                break;
            case 516:
                run516();
                break;
            case 517:
                run517();
                break;
            case 519:
                run519();
                break;
            case 520:
                run520();
                break;
            case 521:
                run521();
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
            case 537:
                run537();
                break;
            case 539:
                run539();
                break;
            case 540:
                run540();
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
            case 553:
                run553();
                break;
            case 559:
                run559();
                break;
            case 563:
                run563();
                break;
            case 564:
                run564();
                break;
            case 575:
                run575();
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
            case 587:
                run587();
                break;
            case 589:
                run589();
                break;
            case 590:
                run590();
                break;
            case 591:
                run591();
                break;
            case 594:
                run594();
                break;
            case 598:
                run598();
                break;
            case 599:
                run599();
                break;
            case 600:
                run600();
                break;
            case 606:
                run606();
                break;
            case 611:
                run611();
                break;
            case 629:
                run629();
                break;
            case 630:
                run630();
                break;
            case 638:
                run638();
                break;
            case 639:
                run639();
                break;
            case 650:
                run650();
                break;
            case 653:
                run653();
                break;
            case 661:
                run661();
                break;
            case 668:
                run668();
                break;
            case 673:
                run673();
                break;
            case 675:
                run675();
                break;
            case 677:
                run677();
                break;
            case 678:
                run678();
                break;
            case 682:
                run682();
                break;
            case 686:
                run686();
                break;
            case 688:
                run688();
                break;
            case 689:
                run689();
                break;
            case 691:
                run691();
                break;
            case 693:
                run693();
                break;
            case 699:
                run699();
                break;
            case 700:
                run700();
                break;
            case 704:
                run704();
                break;
            case 709:
                run709();
                break;
            case 713:
                run713();
                break;
            case 717:
                run717();
                break;
            case 720:
                run720();
                break;
            case 725:
                run725();
                break;
            case 728:
                run728();
                break;
            case 732:
                run732();
                break;
            case 743:
                run743();
                break;
            case 744:
                run744();
                break;
            case 747:
                run747();
                break;
            case 748:
                run748();
                break;
            case 762:
                run762();
                break;
            case 780:
                run780();
                break;
            case 786:
                run786();
                break;
            case 787:
                run787();
                break;
            case 789:
                run789();
                break;
            case 794:
                run794();
                break;
            case 796:
                run796();
                break;
            case 797:
                run797();
                break;
            case 798:
                run798();
                break;
            case 802:
                run802();
                break;
            case 804:
                run804();
                break;
            case 806:
                run806();
                break;
            case 807:
                run807();
                break;
            case 812:
                run812();
                break;
            case 819:
                run819();
                break;
            case 821:
                run821();
                break;
            case 824:
                run824();
                break;
            case 825:
                run825();
                break;
            case 829:
                run829();
                break;
            case 838:
                run838();
                break;
            case 846:
                run846();
                break;
            case 847:
                run847();
                break;
            case 851:
                run851();
                break;
            case 859:
                run859();
                break;
            case 868:
                run868();
                break;
            case 869:
                run869();
                break;
            case 875:
                run875();
                break;
            case 881:
                run881();
                break;
            case 883:
                run883();
                break;
            case 884:
                run884();
                break;
            case 905:
                run905();
                break;
            case 908:
                run908();
                break;
            case 911:
                run911();
                break;
            case 913:
                run913();
                break;
            case 917:
                run917();
                break;
            case 929:
                run929();
                break;
            case 933:
                run933();
                break;
            case 937:
                run937();
                break;
            case 942:
                run942();
                break;
            case 944:
                run944();
                break;
            case 953:
                run953();
                break;
            case 954:
                run954();
                break;
            case 961:
                run961();
                break;
            case 965:
                run965();
                break;
            case 969:
                run969();
                break;
            case 997:
                run997();
                break;
            case 1001:
                run1001();
                break;
            case 1005:
                run1005();
                break;
            case 1009:
                run1009();
                break;
            case 1020:
                run1020();
                break;
            case 1021:
                run1021();
                break;
            case 1022:
                run1022();
                break;
            case 1034:
                run1034();
                break;
            case 1036:
                run1036();
                break;
            case 1044:
                run1044();
                break;
            case 1078:
                run1078();
                break;
            case 1109:
                run1109();
                break;
            case 1137:
                run1137();
                break;
            case 1154:
                run1154();
                break;
            case 1185:
                run1185();
                break;
            case 1189:
                run1189();
                break;
            case 1218:
                run1218();
                break;
            case 1219:
                run1219();
                break;
            case 1220:
                run1220();
                break;
            case 1221:
                run1221();
                break;
            case 1305:
                run1305();
                break;
            case 1332:
                run1332();
                break;
            case 1337:
                run1337();
                break;
            case 1342:
                run1342();
                break;
            case 1345:
                run1345();
                break;
            case 1380:
                run1380();
                break;
            case 1405:
                run1405();
                break;
            case 1414:
                run1414();
                break;
            case 1436:
                run1436();
                break;
            case 1446:
                run1446();
                break;
            case 1447:
                run1447();
                break;
            case 1480:
                run1480();
                break;
            case 1518:
                run1518();
                break;
            case 1576:
                run1576();
                break;
            case 1583:
                run1583();
                break;
            case 1588:
                run1588();
                break;
            case 1601:
                run1601();
                break;
            case 1606:
                run1606();
                break;
            case 1609:
                run1609();
                break;
            case 1610:
                run1610();
                break;
            case 1614:
                run1614();
                break;
            case 1629:
                run1629();
                break;
            case 1646:
                run1646();
                break;
            case 1672:
                run1672();
                break;
            case 1688:
                run1688();
                break;
            case 1705:
                run1705();
                break;
            case 1706:
                run1706();
                break;
            case 1716:
                run1716();
                break;
            case 1719:
                run1719();
                break;
            case 1725:
                run1725();
                break;
            case 1728:
                run1728();
                break;
            case 1748:
                run1748();
                break;
            case 1763:
                run1763();
                break;
            case 1765:
                run1765();
                break;
            case 1791:
                run1791();
                break;
            case 1816:
                run1816();
                break;
            case 1823:
                run1823();
                break;
            case 1894:
                run1894();
                break;
            case 1984:
                run1984();
                break;
            case 1994:
                run1994();
                break;
            case 1995:
                run1995();
                break;
            case 1996:
                run1996();
                break;
            case 2000:
                run2000();
                break;
            case 2006:
                run2006();
                break;
            case 2013:
                run2013();
                break;
            case 2016:
                run2016();
                break;
            case 2022:
                run2022();
                break;
            case 2024:
                run2024();
                break;
            case 2028:
                run2028();
                break;
            case 2029:
                run2029();
                break;
            case 2034:
                run2034();
                break;
            case 2038:
                run2038();
                break;
            case 2039:
                run2039();
                break;
            case 2043:
                run2043();
                break;
            case 2044:
                run2044();
                break;
            case 2045:
                run2045();
                break;
            case 2047:
                run2047();
                break;
            case 2049:
                run2049();
                break;
            case 2055:
                run2055();
                break;
            case 2100:
                run2100();
                break;
            case 2104:
                run2104();
                break;
            // 1XXXX for LCP & LCS
            // LCP 01 -> 10001 -> LCP01
            // LCS 01 -> 11001 -> LCS01
            case 10001:
                break;
            // 2XXXX for JianZhi Offer (II)
            // 剑指 Offer 01 -> 20001 -> OF1
            // 剑指 Offer II 001 -> 21001 -> OFII1
            case 20010:
                runOF10();
                break;
            case 20022:
                runOF22();
                break;
            case 21069:
                runOFII69();
                break;
            case 21114:
                runOFII114();
                break;
            // 3XXXX for Case Interview
            // 面试题 01.01 -> 30101 -> CI0101
            case 30105:
                runCI0105();
                break;
            case 30406:
                runCI0406();
                break;
            case 31711:
                runCI1711();
                break;
            case 31714:
                runCI1714();
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

    static void run47() {
        int[] nums = {1, 1, 2};
        S47 run = new S47();
        List<List<Integer>> result = run.permuteUnique(nums);
        print(result);
    }

    static void run58() {
        String s = "Hello World";
        S58 run = new S58();
        int result = run.lengthOfLastWord(s);
        print(result);
    }

    static void run66() {
        int[] digits = {1, 2, 3};
        S66 run = new S66();
        int[] result = run.plusOne(digits);
        print(result);
    }

    static void run68() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        S68 run = new S68();
        List<String> result = run.fullJustify(words, maxWidth);
        print(result);
    }

    static void run71() {
        String path = "/home/";
        S71 run = new S71();
        String result = run.simplifyPath(path);
        print(result);
    }

    static void run89() {
        int s = 2;
        S89 run = new S89();
        List<Integer> result = run.grayCode(s);
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

    static void run172() {
        int n = 3;
        S172 run = new S172();
        int result = run.trailingZeroes(n);
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

    static void run219() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        S219 run = new S219();
        boolean result = run.containsNearbyDuplicate(nums, k);
        print(result);
    }

    static void run223() {
        int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
        S223 run = new S223();
        int result = run.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
        print(result);
    }

    static void run229() {
        int[] nums = {3, 2, 3};
        S229 run = new S229();
        List<Integer> result = run.majorityElement(nums);
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

    static void run237() {
        int[] nums = {4, 5, 1, 9};
        int nodeIdx = 1;
        ListNode head = ListNode.makeList(nums);
        ListNode node = head;
        for (int i = 0; i < nodeIdx; i++) node = node.next;
        S237 run = new S237();
        run.deleteNode(node);
        print(head);
    }

    static void run240() {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        S240 run = new S240();
        boolean result = run.searchMatrix(matrix, target);
        print(result);
    }

    static void run258() {
        int num = 38;
        S258 run = new S258();
        int result = run.addDigits(num);
        print(result);
    }

    static void run260() {
        int[] nums = {1, 2, 1, 3, 2, 5};
        S260 run = new S260();
        int[] result = run.singleNumber(nums);
        print(result);
    }

    static void run268() {
        int[] nums = {3, 0, 1};
        S268 run = new S268();
        int result = run.missingNumber(nums);
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

    static void run299() {
        String secret = "1807", guess = "7810";
        S299 run = new S299();
        String result = run.getHint(secret, guess);
        print(result);
    }

    static void run301() {
        String s = "()())()";
        S301 run = new S301();
        List<String> result = run.removeInvalidParentheses(s);
        print(result);
    }

    static void run306() {
        String num = "112358";
        S306 run = new S306();
        boolean result = run.isAdditiveNumber(num);
        print(result);
    }

    static void run307() {
        NumArray run = new NumArray(new int[]{1, 3, 5});
        print(run.sumRange(0, 2));
        run.update(1, 2);
        print(run.sumRange(0, 2));
    }

    static void run310() {
        int n = 4;
        int[][] edges = {{1, 0}, {1, 2}, {1, 3}};
        S310 run = new S310();
        List<Integer> result = run.findMinHeightTrees(n, edges);
        print(result);
    }

    static void run313() {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        S313 run = new S313();
        int result = run.nthSuperUglyNumber(n, primes);
        print(result);
    }

    static void run318() {
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        S318 run = new S318();
        int result = run.maxProduct(words);
        print(result);
    }

    static void run319() {
        int n = 3;
        S319 run = new S319();
        int result = run.bulbSwitch(n);
        print(result);
    }

    static void run326() {
        int n = 27;
        S326 run = new S326();
        boolean result = run.isPowerOfThree(n);
        print(result);
    }

    static void run334() {
        int[] nums = {1, 2, 3, 4, 5};
        S334 run = new S334();
        boolean result = run.increasingTriplet(nums);
        print(result);
    }

    static void run335() {
        int[] distance = {2, 1, 1, 2};
        S335 run = new S335();
        boolean result = run.isSelfCrossing(distance);
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

    static void run357() {
        int n = 2;
        S357 run = new S357();
        int result = run.countNumbersWithUniqueDigits(n);
        print(result);
    }

    static void run367() {
        int num = 16;
        S367 run = new S367();
        boolean result = run.isPerfectSquare(num);
        print(result);
    }

    static void run371() {
        int a = 1, b = 2;
        S371 run = new S371();
        int result = run.getSum(a, b);
        print(result);
    }

    static void run372() {
        int a = 2;
        int[] b = {3};
        S372 run = new S372();
        int result = run.superPow(a, b);
        print(result);
    }

    static void run373() {
        int[] nums1 = {1, 7, 11}, nums2 = {2, 4, 6};
        int k = 3;
        S373 run = new S373();
        List<List<Integer>> result = run.kSmallestPairs(nums1, nums2, k);
        print(result);
    }

    static void run375() {
        int n = 10;
        S375 run = new S375();
        int result = run.getMoneyAmount(n);
        print(result);
    }

    static void run380() {
        RandomizedSet run = new RandomizedSet();
        print(run.insert(1));
        print(run.remove(2));
        print(run.insert(2));
        print(run.getRandom());
        print(run.remove(1));
        print(run.insert(2));
        print(run.getRandom());
    }

    static void run382() {
        int[] nums = {1, 2, 3};
        ListNode head = ListNode.makeList(nums);
        S382 run = new S382(head);
        print(run.getRandom());
        print(run.getRandom());
        print(run.getRandom());
        print(run.getRandom());
        print(run.getRandom());
    }

    static void run383() {
        String ransomNote = "a", magazine = "b";
        S383 run = new S383();
        boolean result = run.canConstruct(ransomNote, magazine);
        print(result);
    }

    static void run384() {
        int[] nums = {1, 2, 3};
        S384 run = new S384(nums);
        print(run.shuffle());
        print(run.reset());
        print(run.shuffle());
    }

    static void run385() {
        // Test Env Print Function Not Ready
        String s = "324";
        S385 run = new S385();
        NestedInteger result = run.deserialize(s);
        print("Test Env Print Function Not Ready");
    }

    static void run386() {
        int n = 13;
        S386 run = new S386();
        List<Integer> result = run.lexicalOrder(n);
        print(result);
    }

    static void run388() {
        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        S388 run = new S388();
        int result = run.lengthLongestPath(input);
        print(result);
    }

    static void run390() {
        int n = 9;
        S390 run = new S390();
        int result = run.lastRemaining(n);
        print(result);
    }

    static void run391() {
        int[][] rectangles = {{1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}};
        S391 run = new S391();
        boolean result = run.isRectangleCover(rectangles);
        print(result);
    }

    static void run393() {
        int[] data = {197, 130, 1};
        S393 run = new S393();
        boolean result = run.validUtf8(data);
        print(result);
    }

    static void run396() {
        int[] nums = {4, 3, 2, 6};
        S396 run = new S396();
        int result = run.maxRotateFunction(nums);
        print(result);
    }

    static void run397() {
        int n = 8;
        S397 run = new S397();
        int result = run.integerReplacement(n);
        print(result);
    }

    static void run398() {
        int[] nums = new int[]{1, 2, 3, 3, 3};
        S398 run = new S398(nums);
        print(run.pick(3));
        print(run.pick(1));
    }

    static void run400() {
        int n = 3;
        S400 run = new S400();
        int result = run.findNthDigit(n);
        print(result);
    }

    static void run405() {
        int num = 26;
        S405 run = new S405();
        String result = run.toHex(num);
        print(result);
    }

    static void run407() {
        int[][] heightMap = {{1, 4, 3, 1, 3, 2}, {3, 2, 1, 3, 2, 4}, {2, 3, 3, 2, 3, 1}};
        S407 run = new S407();
        int result = run.trapRainWater(heightMap);
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

    static void run417() {
        int[][] heights = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        S417 run = new S417();
        List<List<Integer>> result = run.pacificAtlantic(heights);
        print(result);
    }

    static void run419() {
        char[][] board = {{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}};
        S419 run = new S419();
        int result = run.countBattleships(board);
        print(result);
    }

    static void run420() {
        String password = "a";
        S420 run = new S420();
        int result = run.strongPasswordChecker(password);
        print(result);
    }

    static void run423() {
        String s = "owoztneoer";
        S423 run = new S423();
        String result = run.originalDigits(s);
        print(result);
    }

    static void run427() {
        // Test Env Print Function Not Ready
        int[][] grid = {{1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}};
        S427 run = new S427();
        QuadTreeNode result = run.construct(grid);
        print("Test Env Print Function Not Ready");
    }

    static void run429() {
        String line = "[1,null,3,2,4,null,5,6]";
        S429 run = new S429();
        NaryTreeNode root = NaryTreeNode.stringToTreeNode(line);
        List<List<Integer>> result = run.levelOrder(root);
        print(result);
    }

    static void run430() {
        // Test Env Sample Not Ready
        S430 run = new S430();
        Node result = run.flatten(new Node(0));
        print("Test Env Sample Not Ready");
    }

    static void run432() {
        AllOne run = new AllOne();
        run.inc("hello");
        run.inc("hello");
        print(run.getMaxKey());
        print(run.getMinKey());
        run.inc("leet");
        print(run.getMaxKey());
        print(run.getMinKey());
    }

    static void run433() {
        String start = "AACCGGTT", end = "AACCGGTA";
        String[] bank = {"AACCGGTA"};
        S433 run = new S433();
        int result = run.minMutation(start, end, bank);
        print(result);
    }

    static void run434() {
        String s = "Hello, my name is John";
        S434 run = new S434();
        int result = run.countSegments(s);
        print(result);
    }

    static void run436() {
        int[][] intervals = {{1, 2}};
        S436 run = new S436();
        int[] result = run.findRightInterval(intervals);
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

    static void run438() {
        String s = "cbaebabacd", p = "abc";
        S438 run = new S438();
        List<Integer> result = run.findAnagrams(s, p);
        print(result);
    }

    static void run440() {
        int n = 13, k = 2;
        S440 run = new S440();
        int result = run.findKthNumber(n, k);
        print(result);
    }

    static void run441() {
        int n = 5;
        S441 run = new S441();
        int result = run.arrangeCoins(n);
        print(result);
    }

    static void run442() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        S442 run = new S442();
        List<Integer> result = run.findDuplicates(nums);
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

    static void run449() {
        String line = "1, 3, 2";
        Codec run = new Codec();
        TreeNode deserialized = run.deserialize(line);
        String serialized = run.serialize(deserialized);
        print(serialized);
    }

    static void run450() {
        TreeNode root = TreeNode.stringToTreeNode("[5,3,6,2,4,null,7]");
        int key = 3;
        S450 run = new S450();
        TreeNode result = run.deleteNode(root, key);
        print(TreeNode.treeNodeToString(result));
    }

    static void run453() {
        int[] nums = {1, 2, 3};
        S453 run = new S453();
        int result = run.minMoves(nums);
        print(result);
    }

    static void run457() {
        int[] nums = {2, -1, 1, 2, 2};
        S457 run = new S457();
        boolean result = run.circularArrayLoop(nums);
        print(result);
    }

    static void run458() {
        int buckets = 1000, minutesToDie = 15, minutesToTest = 60;
        S458 run = new S458();
        int result = run.poorPigs(buckets, minutesToDie, minutesToTest);
        print(result);
    }

    static void run462() {
        int[] nums = {1, 2, 3};
        S462 run = new S462();
        int result = run.minMoves2(nums);
        print(result);
    }

    static void run464() {
        int maxChoosableInteger = 10, desiredTotal = 11;
        S464 run = new S464();
        boolean result = run.canIWin(maxChoosableInteger, desiredTotal);
        print(result);
    }

    static void run467() {
        String p = "a";
        S467 run = new S467();
        int result = run.findSubstringInWraproundString(p);
        print(result);
    }

    static void run468() {
        String queryIP = "172.16.254.1";
        S468 run = new S468();
        String result = run.validIPAddress(queryIP);
        print(result);
    }

    static void run470() {
        S470 run = new S470();
        int[] result = new int[10];
        for (int i = 0; i < 10000; i++)
            result[run.rand10() - 1]++;
        print(result);
    }

    static void run472() {
        String[] words = {"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"};
        S472 run = new S472();
        List<String> result = run.findAllConcatenatedWordsInADict(words);
        print(result);
    }

    static void run473() {
        int[] matchsticks = {1, 1, 2, 2, 2};
        S473 run = new S473();
        boolean result = run.makesquare(matchsticks);
        print(result);
    }

    static void run475() {
        int[] houses = {1, 2, 3}, heaters = {2};
        S475 run = new S475();
        int result = run.findRadius(houses, heaters);
        print(result);
    }

    static void run476() {
        int num = 5;
        S476 run = new S476();
        int result = run.findComplement(num);
        print(result);
    }

    static void run478() {
        S478 run = new S478(1.0, 0.0, 0.0);
        print(run.randPoint());
        print(run.randPoint());
        print(run.randPoint());
    }

    static void run479() {
        int n = 5;
        S479 run = new S479();
        int result = run.largestPalindrome(n);
        print(result);
    }

    static void run482() {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        S482 run = new S482();
        String result = run.licenseKeyFormatting(s, k);
        print(result);
    }

    static void run488() {
        String board = "WRRBBW", hand = "RB";
        S488 run = new S488();
        int result = run.findMinStep(board, hand);
        print(result);
    }

    static void run492() {
        int area = 4;
        S492 run = new S492();
        int[] result = run.constructRectangle(area);
        print(result);
    }

    static void run495() {
        int[] timeSeries = {1, 4};
        int duration = 2;
        S495 run = new S495();
        int result = run.findPoisonedDuration(timeSeries, duration);
        print(result);
    }

    static void run496() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        S496 run = new S496();
        int[] result = run.nextGreaterElement(nums1, nums2);
        print(result);
    }

    static void run500() {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        S500 run = new S500();
        String[] result = run.findWords(words);
        print(result);
    }

    static void run502() {
        int k = 2, w = 0;
        int[] profits = {1, 2, 3}, capital = {0, 1, 1};
        S502 run = new S502();
        int result = run.findMaximizedCapital(k, w, profits, capital);
        print(result);
    }

    static void run504() {
        int num = 100;
        S504 run = new S504();
        String result = run.convertToBase7(num);
        print(result);
    }

    static void run506() {
        int[] score = {5, 4, 3, 2, 1};
        S506 run = new S506();
        String[] result = run.findRelativeRanks(score);
        print(result);
    }

    static void run507() {
        int num = 28;
        S507 run = new S507();
        boolean result = run.checkPerfectNumber(num);
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

    static void run519() {
        S519 run = new S519(3, 1);
        print(run.flip());
        print(run.flip());
        print(run.flip());
        run.reset();
        print(run.flip());
    }

    static void run520() {
        String word = "USA";
        S520 run = new S520();
        boolean result = run.detectCapitalUse(word);
        print(result);
    }

    static void run521() {
        String a = "aba", b = "cdc";
        S521 run = new S521();
        int result = run.findLUSlength(a, b);
        print(result);
    }

    static void run524() {
        String s = "abpcplea";
        String[] dict = {"ale", "apple", "monkey", "plea"};
        List<String> dictionary = new ArrayList<>(List.of(dict));
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

    static void run537() {
        String num1 = "1+1i", num2 = "1+1i";
        S537 run = new S537();
        String result = run.complexNumberMultiply(num1, num2);
        print(result);
    }

    static void run539() {
        String[] tp = {"23:59", "00:00"};
        List<String> timePoints = new ArrayList<>(List.of(tp));
        S539 run = new S539();
        int result = run.findMinDifference(timePoints);
        print(result);
    }

    static void run540() {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        S540 run = new S540();
        int result = run.singleNonDuplicate(nums);
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

    static void run553() {
        int[] nums = {1000, 100, 10, 2};
        S553 run = new S553();
        String result = run.optimalDivision(nums);
        print(result);
    }

    static void run559() {
        String line = "[1,null,3,2,4,null,5,6]";
        S559 run = new S559();
        NaryTreeNode root = NaryTreeNode.stringToTreeNode(line);
        int result = run.maxDepth(root);
        print(result);
    }

    static void run563() {
        String line = "[1,2,3]";
        S563 run = new S563();
        TreeNode root = TreeNode.stringToTreeNode(line);
        int result = run.findTilt(root);
        print(result);
    }

    static void run564() {
        String n = "123";
        S564 run = new S564();
        String result = run.nearestPalindromic(n);
        print(result);
    }

    static void run575() {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        S575 run = new S575();
        int result = run.distributeCandies(candyType);
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

    static void run587() {
        int[][] trees = {{1, 1}, {2, 2}, {2, 0}, {2, 4}, {3, 3}, {4, 2}};
        S587 run = new S587();
        int[][] result = run.outerTrees(trees);
        print(result);
    }

    static void run589() {
        String line = "[1,null,3,2,4,null,5,6]";
        S589 run = new S589();
        NaryTreeNode root = NaryTreeNode.stringToTreeNode(line);
        List<Integer> result = run.preorder(root);
        print(result);
    }

    static void run590() {
        String line = "[1,null,3,2,4,null,5,6]";
        S590 run = new S590();
        NaryTreeNode root = NaryTreeNode.stringToTreeNode(line);
        List<Integer> result = run.postorder(root);
        print(result);
    }

    static void run591() {
        String code = "<DIV>This is the first line <![CDATA[<div>]]></DIV>";
        S591 run = new S591();
        boolean result = run.isValid(code);
        print(result);
    }

    static void run594() {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        S594 run = new S594();
        int result = run.findLHS(nums);
        print(result);
    }

    static void run598() {
        int m = 3, n = 3;
        int[][] ops = {{2, 2}, {3, 3}};
        S598 run = new S598();
        int result = run.maxCount(m, n, ops);
        print(result);
    }

    static void run599() {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"}, list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        S599 run = new S599();
        String[] result = run.findRestaurant(list1, list2);
        print(result);
    }

    static void run600() {
        int n = 5;
        S600 run = new S600();
        int result = run.findIntegers(n);
        print(result);
    }

    static void run606() {
        String line = "[1,2,3,4]";
        TreeNode root = TreeNode.stringToTreeNode(line);
        S606 run = new S606();
        String result = run.tree2str(root);
        print(result);
    }

    static void run611() {
        int[] nums = {2, 2, 3, 4};
        S611 run = new S611();
        int result = run.triangleNumber(nums);
        print(result);
    }

    static void run629() {
        int n = 3, k = 0;
        S629 run = new S629();
        int result = run.kInversePairs(n, k);
        print(result);
    }

    static void run630() {
        int[][] courses = {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        S630 run = new S630();
        int result = run.scheduleCourse(courses);
        print(result);
    }

    static void run638() {
        List<Integer> price = toArrayList(new int[]{2, 5});
        List<List<Integer>> special = to2DArrayList(new int[][]{{3, 0, 5}, {1, 2, 10}});
        List<Integer> needs = toArrayList(new int[]{3, 2});
        S638 run = new S638();
        int result = run.shoppingOffers(price, special, needs);
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

    static void run653() {
        String line = "[5,3,6,2,4,null,7]";
        int k = 9;
        TreeNode root = TreeNode.stringToTreeNode(line);
        S653 run = new S653();
        boolean result = run.findTarget(root, k);
        print(result);
    }

    static void run661() {
        int[][] img = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        S661 run = new S661();
        int[][] result = run.imageSmoother(img);
        print(result);
    }

    static void run668() {
        int m = 3, n = 3, k = 5;
        S668 run = new S668();
        int result = run.findKthNumber(m, n, k);
        print(result);
    }

    static void run673() {
        int[] nums = {1, 3, 5, 4, 7};
        S673 run = new S673();
        int result = run.findNumberOfLIS(nums);
        print(result);
    }

    static void run675() {
        List<List<Integer>> forest = to2DArrayList(new int[][]{{1, 2, 3}, {0, 0, 4}, {7, 6, 5}});
        S675 run = new S675();
        int result = run.cutOffTree(forest);
        print(result);
    }

    static void run677() {
        MapSum run = new MapSum();
        run.insert("apple", 3);
        print(run.sum("ap"));
        run.insert("app", 2);
        print(run.sum("ap"));
    }

    static void run678() {
        String s = "()";
        S678 run = new S678();
        boolean result = run.checkValidString(s);
        print(result);
    }

    static void run682() {
        String[] ops = {"5", "2", "C", "D", "+"};
        S682 run = new S682();
        int result = run.calPoints(ops);
        print(result);
    }

    static void run686() {
        String a = "abcd", b = "cdabcdab";
        S686 run = new S686();
        int result = run.repeatedStringMatch(a, b);
        print(result);
    }

    static void run688() {
        int n = 3, k = 2, row = 0, column = 0;
        S688 run = new S688();
        double result = run.knightProbability(n, k, row, column);
        print(result);
    }

    static void run689() {
        int[] nums = {1, 2, 1, 2, 6, 7, 5, 1};
        int k = 2;
        S689 run = new S689();
        int[] result = run.maxSumOfThreeSubarrays(nums, k);
        print(result);
    }

    static void run691() {
        String[] stickers = {"with", "example", "science"};
        String target = "thehat";
        S691 run = new S691();
        int result = run.minStickers(stickers, target);
        print(result);
    }

    static void run693() {
        int n = 5;
        S693 run = new S693();
        boolean result = run.hasAlternatingBits(n);
        print(result);
    }

    static void run699() {
        int[][] positions = {{1, 2}, {2, 3}, {6, 1}};
        S699 run = new S699();
        List<Integer> result = run.fallingSquares(positions);
        print(result);
    }

    static void run700() {
        String line = "[4,2,7,1,3]";
        S700 run = new S700();
        TreeNode root = TreeNode.stringToTreeNode(line);
        TreeNode result = run.searchBST(root, 2);
        print(result == null ? "null" : String.valueOf(result.val));
    }

    static void run704() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        S704 run = new S704();
        int result = run.search(nums, target);
        print(result);
    }

    static void run709() {
        String s = "Hello";
        S709 run = new S709();
        String result = run.toLowerCase(s);
        print(result);
    }

    static void run713() {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        S713 run = new S713();
        int result = run.numSubarrayProductLessThanK(nums, k);
        print(result);
    }

    static void run717() {
        int[] bits = {1, 0, 0};
        S717 run = new S717();
        boolean result = run.isOneBitCharacter(bits);
        print(result);
    }

    static void run720() {
        String[] words = {"w", "wo", "wor", "worl", "world"};
        S720 run = new S720();
        String result = run.longestWord(words);
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

    static void run728() {
        int left = 1, right = 22;
        S728 run = new S728();
        List<Integer> result = run.selfDividingNumbers(left, right);
        print(result);
    }

    static void run732() {
        MyCalendarThree run = new MyCalendarThree();
        print(run.book(10, 20));
        print(run.book(50, 60));
        print(run.book(10, 40));
        print(run.book(5, 15));
        print(run.book(5, 10));
        print(run.book(25, 55));
    }

    static void run743() {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4, k = 2;
        S743 run = new S743();
        int result = run.networkDelayTime(times, n, k);
        print(result);
    }

    static void run744() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        S744 run = new S744();
        char result = run.nextGreatestLetter(letters, target);
        print(result);
    }

    static void run747() {
        int[] nums = {3, 6, 1, 0};
        S747 run = new S747();
        int result = run.dominantIndex(nums);
        print(result);
    }

    static void run748() {
        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        S748 run = new S748();
        String result = run.shortestCompletingWord(licensePlate, words);
        print(result);
    }

    static void run762() {
        int left = 6, right = 10;
        S762 run = new S762();
        int result = run.countPrimeSetBits(left, right);
        print(result);
    }

    static void run780() {
        int sx = 1, sy = 1, tx = 3, ty = 5;
        S780 run = new S780();
        boolean result = run.reachingPoints(sx, sy, tx, ty);
        print(result);
    }

    static void run786() {
        int[] arr = {1, 2, 3, 5};
        int k = 9;
        S786 run = new S786();
        int[] result = run.kthSmallestPrimeFraction(arr, k);
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

    static void run794() {
        String[] board = {"O  ", "   ", "   "};
        S794 run = new S794();
        boolean result = run.validTicTacToe(board);
        print(result);
    }

    static void run796() {
        String s = "abcde", goal = "cdeab";
        S796 run = new S796();
        boolean result = run.rotateString(s, goal);
        print(result);
    }

    static void run797() {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        S797 run = new S797();
        List<List<Integer>> result = run.allPathsSourceTarget(graph);
        print(result);
    }

    static void run798() {
        int[] nums = {2, 3, 1, 4, 0};
        S798 run = new S798();
        int result = run.bestRotation(nums);
        print(result);
    }

    static void run802() {
        int[][] graph = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        S802 run = new S802();
        List<Integer> result = run.eventualSafeNodes(graph);
        print(result);
    }

    static void run804() {
        String[] words = {"gin", "zen", "gig", "msg"};
        S804 run = new S804();
        int result = run.uniqueMorseRepresentations(words);
        print(result);
    }

    static void run806() {
        int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        S806 run = new S806();
        int[] result = run.numberOfLines(widths, s);
        print(result);
    }

    static void run807() {
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        S807 run = new S807();
        int result = run.maxIncreaseKeepingSkyline(grid);
        print(result);
    }

    static void run812() {
        int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        S812 run = new S812();
        double result = run.largestTriangleArea(points);
        print(result);
    }

    static void run819() {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        S819 run = new S819();
        String result = run.mostCommonWord(paragraph, banned);
        print(result);
    }

    static void run821() {
        String s = "loveleetcode";
        char c = 'e';
        S821 run = new S821();
        int[] result = run.shortestToChar(s, c);
        print(result);
    }

    static void run824() {
        String sentence = "I speak Goat Latin";
        S824 run = new S824();
        String result = run.toGoatLatin(sentence);
        print(result);
    }

    static void run825() {
        int[] ages = {16, 16};
        S825 run = new S825();
        int result = run.numFriendRequests(ages);
        print(result);
    }

    static void run829() {
        int n = 5;
        S829 run = new S829();
        int result = run.consecutiveNumbersSum(n);
        print(result);
    }

    static void run838() {
        String dominoes = "RR.L";
        S838 run = new S838();
        String result = run.pushDominoes(dominoes);
        print(result);
    }

    static void run846() {
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        S846 run = new S846();
        boolean result = run.isNStraightHand(hand, groupSize);
        print(result);
    }

    static void run847() {
        int[][] graph = {{1, 2, 3}, {0}, {0}, {0}};
        S847 run = new S847();
        int result = run.shortestPathLength(graph);
        print(result);
    }

    static void run851() {
        int[][] richer = {{1, 0}, {2, 1}, {3, 1}, {3, 7}, {4, 3}, {5, 3}, {6, 3}};
        int[] quiet = {3, 2, 5, 4, 6, 1, 7, 0};
        S851 run = new S851();
        int[] result = run.loudAndRich(richer, quiet);
        print(result);
    }

    static void run859() {
        String s = "ab", goal = "ba";
        S859 run = new S859();
        boolean result = run.buddyStrings(s, goal);
        print(result);
    }

    static void run868() {
        int n = 22;
        S868 run = new S868();
        int result = run.binaryGap(n);
        print(result);
    }

    static void run869() {
        int n = 1;
        S869 run = new S869();
        boolean result = run.reorderedPowerOf2(n);
        print(result);
    }

    static void run875() {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        S875 run = new S875();
        int result = run.minEatingSpeed(piles, h);
        print(result);
    }

    static void run881() {
        int[] people = {1, 2};
        int limit = 3;
        S881 run = new S881();
        int result = run.numRescueBoats(people, limit);
        print(result);
    }

    static void run883() {
        int[][] grid = {{1, 2}, {3, 4}};
        S883 run = new S883();
        int result = run.projectionArea(grid);
        print(result);
    }

    static void run884() {
        String s1 = "this apple is sweet", s2 = "this apple is sour";
        S884 run = new S884();
        String[] result = run.uncommonFromSentences(s1, s2);
        print(result);
    }

    static void run905() {
        int[] nums = {3, 1, 2, 4};
        S905 run = new S905();
        int[] result = run.sortArrayByParity(nums);
        print(result);
    }

    static void run908() {
        int[] nums = {1};
        int k = 0;
        S908 run = new S908();
        int result = run.smallestRangeI(nums, k);
        print(result);
    }

    static void run911() {
        int[] persons = {0, 1, 1, 0, 0, 1, 0}, times = {0, 5, 10, 15, 20, 25, 30};
        TopVotedCandidate run = new TopVotedCandidate(persons, times);
        print(run.q(3));
        print(run.q(12));
        print(run.q(25));
        print(run.q(15));
        print(run.q(24));
        print(run.q(8));
    }

    static void run913() {
        int[][] graph = {{2, 5}, {3}, {0, 4, 5}, {1, 4, 5}, {2, 3}, {0, 2, 3}};
        S913 run = new S913();
        int result = run.catMouseGame(graph);
        print(result);
    }

    static void run917() {
        String s = "ab-cd";
        S917 run = new S917();
        String result = run.reverseOnlyLetters(s);
        print(result);
    }

    static void run929() {
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        S929 run = new S929();
        int result = run.numUniqueEmails(emails);
        print(result);
    }

    static void run933() {
        RecentCounter run = new RecentCounter();
        print(run.ping(1));
        print(run.ping(100));
        print(run.ping(3001));
        print(run.ping(3002));
    }

    static void run937() {
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        S937 run = new S937();
        String[] result = run.reorderLogFiles(logs);
        print(result);
    }

    static void run942() {
        String s = "IDID";
        S942 run = new S942();
        int[] result = run.diStringMatch(s);
        print(result);
    }

    static void run944() {
        String[] strs = {"cba", "daf", "ghi"};
        S944 run = new S944();
        int result = run.minDeletionSize(strs);
        print(result);
    }

    static void run953() {
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        S953 run = new S953();
        boolean result = run.isAlienSorted(words, order);
        print(result);
    }

    static void run954() {
        int[] arr = {3, 1, 3, 6};
        S954 run = new S954();
        boolean result = run.canReorderDoubled(arr);
        print(result);
    }

    static void run961() {
        int[] nums = {1, 2, 3, 3};
        S961 run = new S961();
        int result = run.repeatedNTimes(nums);
        print(result);
    }

    static void run965() {
        String line = "[1,1,1,1,1,null,1]";
        TreeNode root = TreeNode.stringToTreeNode(line);
        S965 run = new S965();
        boolean result = run.isUnivalTree(root);
        print(result);
    }

    static void run969() {
        int[] arr = {3, 2, 4, 1};
        S969 run = new S969();
        List<Integer> result = run.pancakeSort(arr);
        print(result);
    }

    static void run997() {
        int n = 2;
        int[][] trust = {{1, 2}};
        S997 run = new S997();
        int result = run.findJudge(n, trust);
        print(result);
    }

    static void run1001() {
        int n = 5;
        int[][] lamps = {{0, 0}, {4, 4}}, queries = {{1, 1}, {1, 1}};
        S1001 run = new S1001();
        int[] result = run.gridIllumination(n, lamps, queries);
        print(result);
    }

    static void run1005() {
        int[] nums = {4, 2, 3};
        int k = 1;
        S1005 run = new S1005();
        int result = run.largestSumAfterKNegations(nums, k);
        print(result);
    }

    static void run1009() {
        int n = 5;
        S1009 run = new S1009();
        int result = run.bitwiseComplement(n);
        print(result);
    }

    static void run1020() {
        int[][] grid = {{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        S1020 run = new S1020();
        int result = run.numEnclaves(grid);
        print(result);
    }

    static void run1021() {
        String s = "(()())(())";
        S1021 run = new S1021();
        String result = run.removeOuterParentheses(s);
        print(result);
    }

    static void run1022() {
        TreeNode root = TreeNode.stringToTreeNode("[1,0,1,0,1,0,1]");
        S1022 run = new S1022();
        int result = run.sumRootToLeaf(root);
        print(result);
    }

    static void run1034() {
        int[][] grid = {{1, 1}, {1, 2}};
        int row = 0, col = 0, color = 3;
        S1034 run = new S1034();
        int[][] result = run.colorBorder(grid, row, col, color);
        print(result);
    }

    static void run1036() {
        int[][] blocked = {{0, 1}, {1, 0}};
        int[] source = {0, 0}, target = {0, 2};
        S1036 run = new S1036();
        boolean result = run.isEscapePossible(blocked, source, target);
        print(result);
    }

    static void run1044() {
        String s = "banana";
        S1044 run = new S1044();
        String result = run.longestDupSubstring(s);
        print(result);
    }

    static void run1078() {
        String text = "alice is a good girl she is a good student", first = "a", second = "good";
        S1078 run = new S1078();
        String[] result = run.findOcurrences(text, first, second);
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

    static void run1154() {
        String date = "2019-01-09";
        S1154 run = new S1154();
        int result = run.dayOfYear(date);
        print(result);
    }

    static void run1185() {
        int day = 31, month = 8, year = 2019;
        S1185 run = new S1185();
        String result = run.dayOfTheWeek(day, month, year);
        print(result);
    }

    static void run1189() {
        String text = "nlaebolko";
        S1189 run = new S1189();
        int result = run.maxNumberOfBalloons(text);
        print(result);
    }

    static void run1218() {
        int[] arr = {1, 2, 3, 4};
        int difference = 4;
        S1218 run = new S1218();
        int result = run.longestSubsequence(arr, difference);
        print(result);
    }

    static void run1219() {
        int[][] grid = {{0, 6, 0}, {5, 8, 7}, {0, 9, 0}};
        S1219 run = new S1219();
        int result = run.getMaximumGold(grid);
        print(result);
    }

    static void run1220() {
        int n = 1;
        S1220 run = new S1220();
        int result = run.countVowelPermutation(n);
        print(result);
    }

    static void run1221() {
        String s = "RLRRLLRLRL";
        S1221 run = new S1221();
        int result = run.balancedStringSplit(s);
        print(result);
    }

    static void run1305() {
        String line1 = "[2,1,4]", line2 = "[1,0,3]";
        TreeNode root1 = TreeNode.stringToTreeNode(line1);
        TreeNode root2 = TreeNode.stringToTreeNode(line2);
        S1305 run = new S1305();
        List<Integer> result = run.getAllElements(root1, root2);
        print(result);
    }

    static void run1332() {
        String s = "ababa";
        S1332 run = new S1332();
        int result = run.removePalindromeSub(s);
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

    static void run1342() {
        int num = 14;
        S1342 run = new S1342();
        int result = run.numberOfSteps(num);
        print(result);
    }

    static void run1345() {
        int[] arr = {100, -23, -23, 404, 100, 23, 23, 23, 3, 404};
        S1345 run = new S1345();
        int result = run.minJumps(arr);
        print(result);
    }

    static void run1380() {
        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        S1380 run = new S1380();
        List<Integer> result = run.luckyNumbers(matrix);
        print(result);
    }

    static void run1405() {
        int a = 1, b = 1, c = 7;
        S1405 run = new S1405();
        String result = run.longestDiverseString(a, b, c);
        print(result);
    }

    static void run1414() {
        int k = 7;
        S1414 run = new S1414();
        int result = run.findMinFibonacciNumbers(k);
        print(result);
    }

    static void run1436() {
        // Test Env Sample Not Ready
        List<List<String>> paths = new ArrayList<>();
        S1436 run = new S1436();
        String result = run.destCity(paths);
        print("Test Env Sample Not Ready");
    }

    static void run1446() {
        String s = "leetcode";
        S1446 run = new S1446();
        int result = run.maxPower(s);
        print(result);
    }

    static void run1447() {
        int n = 2;
        S1447 run = new S1447();
        List<String> result = run.simplifiedFractions(n);
        print(result);
    }

    static void run1480() {
        int[] nums = {1, 2, 3, 4};
        S1480 run = new S1480();
        int[] result = run.runningSum(nums);
        print(result);
    }

    static void run1518() {
        int numBottles = 9, numExchange = 3;
        S1518 run = new S1518();
        int result = run.numWaterBottles(numBottles, numExchange);
        print(result);
    }

    static void run1576() {
        String s = "?zs";
        S1576 run = new S1576();
        String result = run.modifyString(s);
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

    static void run1601() {
        int n = 5;
        int[][] requests = {{0, 1}, {1, 0}, {0, 1}, {1, 2}, {2, 0}, {3, 4}};
        S1601 run = new S1601();
        int result = run.maximumRequests(n, requests);
        print(result);
    }

    static void run1606() {
        int k = 3;
        int[] arrival = {1, 2, 3, 4, 5}, load = {5, 2, 3, 3, 3};
        S1606 run = new S1606();
        List<Integer> result = run.busiestServers(k, arrival, load);
        print(result);
    }

    static void run1609() {
        String line = "[1,10,4,3,null,7,9,12,8,6,null,null,2]";
        TreeNode root = TreeNode.stringToTreeNode(line);
        S1609 run = new S1609();
        boolean result = run.isEvenOddTree(root);
        print(result);
    }

    static void run1610() {
        int[][] ps = {{2, 1}, {2, 2}, {3, 3}};
        List<List<Integer>> points = to2DArrayList(ps);
        int angle = 90;
        int[] loc = {1, 1};
        List<Integer> location = toArrayList(loc);
        S1610 run = new S1610();
        int result = run.visiblePoints(points, angle, location);
        print(result);
    }

    static void run1614() {
        String s = "(1+(2*3)+((8)/4))+1";
        S1614 run = new S1614();
        int result = run.maxDepth(s);
        print(result);
    }

    static void run1629() {
        int[] releaseTimes = {9, 29, 49, 50};
        String keysPressed = "cbcd";
        S1629 run = new S1629();
        char result = run.slowestKey(releaseTimes, keysPressed);
        print(result);
    }

    static void run1646() {
        int n = 7;
        S1646 run = new S1646();
        int result = run.getMaximumGenerated(n);
        print(result);
    }

    static void run1672() {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        S1672 run = new S1672();
        int result = run.maximumWealth(accounts);
        print(result);
    }

    static void run1688() {
        int n = 7;
        S1688 run = new S1688();
        int result = run.numberOfMatches(n);
        print(result);
    }

    static void run1705() {
        int[] apples = {1, 2, 3, 5, 2}, days = {3, 2, 1, 4, 2};
        S1705 run = new S1705();
        int result = run.eatenApples(apples, days);
        print(result);
    }

    static void run1706() {
        int[][] grid = {{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1, -1, -1, -1, -1}};
        S1706 run = new S1706();
        int[] result = run.findBall(grid);
        print(result);
    }

    static void run1716() {
        int n = 4;
        S1716 run = new S1716();
        int result = run.totalMoney(n);
        print(result);
    }

    static void run1719() {
        int[][] pairs = {{1, 2}, {2, 3}};
        S1719 run = new S1719();
        int result = run.checkWays(pairs);
        print(result);
    }

    static void run1725() {
        int[][] rectangles = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};
        S1725 run = new S1725();
        int result = run.countGoodRectangles(rectangles);
        print(result);
    }

    static void run1728() {
        String[] grid = {"####F", "#C...", "M...."};
        int catJump = 1, mouseJump = 2;
        S1728 run = new S1728();
        boolean result = run.canMouseWin(grid, catJump, mouseJump);
        print(result);
    }

    static void run1748() {
        int[] nums = {1, 2, 3, 2};
        S1748 run = new S1748();
        int result = run.sumOfUnique(nums);
        print(result);
    }

    static void run1763() {
        String s = "YazaAay";
        S1763 run = new S1763();
        String result = run.longestNiceSubstring(s);
        print(result);
    }

    static void run1765() {
        int[][] isWater = {{0, 1}, {0, 0}};
        S1765 run = new S1765();
        int[][] result = run.highestPeak(isWater);
        print(result);
    }

    static void run1791() {
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};
        S1791 run = new S1791();
        int result = run.findCenter(edges);
        print(result);
    }

    static void run1816() {
        String s = "Hello how are you Contestant";
        int k = 4;
        S1816 run = new S1816();
        String result = run.truncateSentence(s, k);
        print(result);
    }

    static void run1823() {
        int n = 5, k = 2;
        S1823 run = new S1823();
        int result = run.findTheWinner(n, k);
        print(result);
    }

    static void run1894() {
        int[] chalk = {5, 1, 5};
        int k = 22;
        S1894 run = new S1894();
        int result = run.chalkReplacer(chalk, k);
        print(result);
    }

    static void run1984() {
        int[] nums = {90};
        int k = 1;
        S1984 run = new S1984();
        int result = run.minimumDifference(nums, k);
        print(result);
    }

    static void run1994() {
        int[] nums = {1, 2, 3, 4};
        S1994 run = new S1994();
        int result = run.numberOfGoodSubsets(nums);
        print(result);
    }

    static void run1995() {
        int[] nums = {1, 2, 3, 6};
        S1995 run = new S1995();
        int result = run.countQuadruplets(nums);
        print(result);
    }

    static void run1996() {
        int[][] properties = {{5, 5}, {6, 3}, {3, 6}};
        S1996 run = new S1996();
        int result = run.numberOfWeakCharacters(properties);
        print(result);
    }

    static void run2000() {
        String word = "abcdefd";
        char ch = 'd';
        S2000 run = new S2000();
        String result = run.reversePrefix(word, ch);
        print(result);
    }

    static void run2006() {
        int[] nums = {1, 2, 2, 1};
        int k = 1;
        S2006 run = new S2006();
        int result = run.countKDifference(nums, k);
        print(result);
    }

    static void run2013() {
        DetectSquares run = new DetectSquares();
        run.add(new int[]{3, 10});
        run.add(new int[]{11, 2});
        run.add(new int[]{3, 2});
        print(run.count(new int[]{11, 10}));
        print(run.count(new int[]{14, 8}));
        run.add(new int[]{11, 2});
        print(run.count(new int[]{11, 10}));
    }

    static void run2016() {
        int[] nums = {7, 1, 5, 4};
        S2016 run = new S2016();
        int result = run.maximumDifference(nums);
        print(result);
    }

    static void run2022() {
        int[] original = {1, 2, 3, 4};
        int m = 2, n = 2;
        S2022 run = new S2022();
        int[][] result = run.construct2DArray(original, m, n);
        print(result);
    }

    static void run2024() {
        String answerKey = "TTFF";
        int k = 2;
        S2024 run = new S2024();
        int result = run.maxConsecutiveAnswers(answerKey, k);
        print(result);
    }

    static void run2028() {
        int[] rolls = {3, 2, 4, 3};
        int mean = 4, n = 2;
        S2028 run = new S2028();
        int[] result = run.missingRolls(rolls, mean, n);
        print(result);
    }

    static void run2029() {
        int[] stones = {2, 1};
        S2029 run = new S2029();
        boolean result = run.stoneGameIX(stones);
        print(result);
    }

    static void run2034() {
        StockPrice run = new StockPrice();
        run.update(1, 10);
        run.update(2, 5);
        print(run.current());
        print(run.maximum());
        run.update(1, 3);
        print(run.maximum());
        run.update(4, 2);
        print(run.minimum());
    }

    static void run2038() {
        String colors = "AAABABB";
        S2038 run = new S2038();
        boolean result = run.winnerOfGame(colors);
        print(result);
    }

    static void run2039() {
        int[][] edges = {{0, 1}, {1, 2}};
        int[] patience = {0, 2, 1};
        S2039 run = new S2039();
        int result = run.networkBecomesIdle(edges, patience);
        print(result);
    }

    static void run2043() {
        long[] balance = {10, 100, 20, 50, 30};
        Bank run = new Bank(balance);
        print(run.withdraw(3, 10));
        print(run.transfer(5, 1, 20));
        print(run.deposit(5, 20));
        print(run.transfer(3, 4, 15));
        print(run.withdraw(10, 50));
    }

    static void run2044() {
        int[] nums = {3, 1};
        S2044 run = new S2044();
        int result = run.countMaxOrSubsets(nums);
        print(result);
    }

    static void run2045() {
        int n = 5, time = 3, change = 5;
        int[][] edges = {{1, 2}, {1, 3}, {1, 4}, {3, 4}, {4, 5}};
        S2045 run = new S2045();
        int result = run.secondMinimum(n, edges, time, change);
        print(result);
    }

    static void run2047() {
        String sentence = "cat and  dog";
        S2047 run = new S2047();
        int result = run.countValidWords(sentence);
        print(result);
    }

    static void run2049() {
        int[] parents = {-1, 2, 0, 2, 0};
        S2049 run = new S2049();
        int result = run.countHighestScoreNodes(parents);
        print(result);
    }

    static void run2055() {
        String s = "**|**|***|";
        int[][] queries = {{2, 5}, {5, 9}};
        S2055 run = new S2055();
        int[] result = run.platesBetweenCandles(s, queries);
        print(result);
    }

    static void run2100() {
        int[] security = {5, 3, 3, 3, 5, 6, 2};
        int time = 2;
        S2100 run = new S2100();
        List<Integer> result = run.goodDaysToRobBank(security, time);
        print(result);
    }

    static void run2104() {
        int[] nums = {1, 2, 3};
        S2104 run = new S2104();
        long result = run.subArrayRanges(nums);
        print(result);
    }

    static void runOF10() {
        int n = 2;
        SOF10 run = new SOF10();
        int result = run.fib(n);
        print(result);
    }

    static void runOF22() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        ListNode head = ListNode.makeList(nums);
        SOF22 run = new SOF22();
        ListNode result = run.getKthFromEnd(head, k);
        print(result);
    }

    static void runOFII69() {
        int[] arr = {0, 1, 0};
        SOFII69 run = new SOFII69();
        int result = run.peakIndexInMountainArray(arr);
        print(result);
    }

    static void runOFII114() {
        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};
        SOFII114 run = new SOFII114();
        String result = run.alienOrder(words);
        print(result);
    }

    static void runCI0105() {
        String first = "pale", second = "ple";
        SCI0105 run = new SCI0105();
        boolean result = run.oneEditAway(first, second);
        print(result);
    }

    static void runCI0406() {
        String line = "[2,1,3]";
        TreeNode root = TreeNode.stringToTreeNode(line);
        assert root != null;
        TreeNode p = root.left;
        SCI0406 run = new SCI0406();
        TreeNode result = run.inorderSuccessor(root, p);
        print(result == null ? "null" : String.valueOf(result.val));
    }

    static void runCI1711() {
        String[] words = {"I", "am", "a", "student", "from", "a", "university", "in", "a", "city"};
        String word1 = "a", word2 = "student";
        SCI1711 run = new SCI1711();
        int result = run.findClosest(words, word1, word2);
        print(result);
    }

    static void runCI1714() {
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
        int k = 4;
        SCI1714 run = new SCI1714();
        int[] result = run.smallestK(arr, k);
        print(result);
    }

    // Common Datatypes Converter
    static List<Integer> toArrayList(int[] input) {
        return Arrays.stream(input).boxed().collect(Collectors.toList());
    }

    static List<List<Integer>> to2DArrayList(int[][] input) {
        List<List<Integer>> output = new ArrayList<>(input.length);
        for (int[] i : input) output.add(toArrayList(i));
        return output;
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

    static void print(double[] input) {
        print(Arrays.toString(input));
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

    static void print(String[] input) {
        print(Arrays.toString(input));
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
