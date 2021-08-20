public class S24 {
    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(-1, head), a = result, b, c;
        while (a.next != null && a.next.next != null) {
            b = a.next;
            c = b.next;
            a.next = c;
            b.next = c.next;
            c.next = b;
            a = b;
        }
        return result.next;
    }
}
