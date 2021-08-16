public class S19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = new ListNode(0, head);
        dg(result, n);
        return result.next;
    }

    int dg(ListNode head, int n) {
        if (head.next == null) return 1;
        int tmp = dg(head.next, n);
        if (tmp == n) head.next = head.next.next;
        return tmp + 1;
    }
}
