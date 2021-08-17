public class S21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null, temp = new ListNode();
        while (l1 != null || l2 != null) {
            int val;
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    val = l1.val;
                    l1 = l1.next;
                } else {
                    val = l2.val;
                    l2 = l2.next;
                }
            } else if (l1 == null) {
                val = l2.val;
                l2 = l2.next;
            } else {
                val = l1.val;
                l1 = l1.next;
            }
            temp.next = new ListNode(val);
            temp = temp.next;
            if (head == null) head = temp;
        }
        return head;
    }
}
