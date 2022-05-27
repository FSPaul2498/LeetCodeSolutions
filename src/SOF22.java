public class SOF22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode result = head;
        while (k > 1) {
            head = head.next;
            k--;
        }
        while (head.next != null) {
            head = head.next;
            result = result.next;
        }
        return result;
    }
}
