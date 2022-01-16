public class S382 {
    ListNode head;

    public S382(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        int i = 1, ans = 0;
        ListNode node = head;
        while (node != null) {
            if ((int) (Math.random() * i) == 0) ans = node.val;
            node = node.next;
            i++;
        }
        return ans;
    }
}
