import java.util.PriorityQueue;

public class S23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode temp = new ListNode(), head = temp;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (ListNode list : lists) {
            while (list != null) {
                pq.add(list.val);
                list = list.next;
            }
        }
        while (!pq.isEmpty()) {
            temp.next = new ListNode(pq.poll());
            temp = temp.next;
        }
        return head.next;
    }
}
