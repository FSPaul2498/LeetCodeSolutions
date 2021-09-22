public class S725 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int total = 0;
        ListNode curr = head;
        while (curr != null) {
            total++;
            curr = curr.next;
        }

        if (total <= k) {
            for (int i = 0; i < total; i++) {
                result[i] = head;
                head = head.next;
                result[i].next = null;
            }
            return result;
        }

        result[0] = head;
        int wide = total / k - 1, addition = total % k + 1;
        ListNode next = head;
        for (int i = 1; i < k; i++) {
            curr = next;
            for (int j = 0; j < wide; j++) curr = curr.next;
            if (i < addition) curr = curr.next;
            result[i] = curr.next;
            next = curr.next;
            curr.next = null;
        }
        return result;
    }
}
