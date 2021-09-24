public class S430 {
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    Node dfs(Node head) {
        Node thisLast = head;
        while (head != null) {
            if (head.child != null) {
                Node childLast = dfs(head.child);
                if (head.next != null) {
                    childLast.next = head.next;
                    head.next.prev = childLast;
                }
                head.next = head.child;
                head.child.prev = head;
                head.child = null;
                head = childLast;
            }
            thisLast = head;
            head = head.next;
        }
        return thisLast;
    }
}
