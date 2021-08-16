public class S2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, temp = new ListNode();
        int digit = 0;
        while (l1 != null || l2 != null || digit != 0) {
            if (l1 != null) {
                digit += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                digit += l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode(digit % 10);
            temp = temp.next;
            if (head == null) head = temp;
            digit = digit / 10;
        }
        return head;
    }
}
