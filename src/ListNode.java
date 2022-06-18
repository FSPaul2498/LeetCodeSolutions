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
        ListNode temp = new ListNode(), head = temp;
        for (int i : source) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return head.next;
    }

    static ListNode makeCircularList(int[] source) {
        ListNode temp = new ListNode(), head = temp;
        for (int i : source) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        temp.next = head.next;
        return head.next;
    }

    static ListNode[] makeList(int[][] source) {
        ListNode[] heads = new ListNode[source.length];
        for (int i = 0; i < source.length; i++)
            heads[i] = ListNode.makeList(source[i]);
        return heads;
    }
}
