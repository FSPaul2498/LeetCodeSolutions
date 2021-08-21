public class S206 {
    public ListNode reverseList(ListNode head) {
        ListNode before = null, next;
        while (head != null) {
            next = head.next;
            head.next = before;
            before = head;
            head = next;
        }
        System.gc();
        return before;
    }
}
