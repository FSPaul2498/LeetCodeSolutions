public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static ListNode makeList(int[] source) {
        ListNode head = null, temp = new ListNode();
        for (int i : source) {
            temp.next = new ListNode(i);
            temp = temp.next;
            if (head == null) head = temp;
        }
        return head;
    }
}
