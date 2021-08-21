public class S25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) return head;
        ListNode result = new ListNode(-1, head);
        ListNode startF, endR = result;
        while (true) {
            startF = endR;
            for (int cnt = 0; cnt < k && endR != null; cnt++)
                endR = endR.next;
            if (endR == null) break;
            ListNode startR = startF.next, endF = endR.next, now = startR, before = null, next;
            while (now != endF) {
                next = now.next;
                now.next = before;
                before = now;
                now = next;
            }
            startF.next = endR;
            startR.next = endF;
            endR = startR;
        }
        return result.next;
    }
}
