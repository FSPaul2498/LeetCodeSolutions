public class SOFII29 {
    public Node insert(Node head, int insertVal) {
        Node insert = new Node(insertVal);
        if (head == null) {
            insert.next = insert;
            return insert;
        }
        if (head.next == head) {
            head.next = insert;
            insert.next = head;
            return head;
        }
        Node curr = head, next = head.next;
        while (next != head) {
            if (insertVal >= curr.val && insertVal <= next.val) break;
            if (curr.val > next.val && (insertVal > curr.val || insertVal < next.val)) break;
            curr = curr.next;
            next = next.next;
        }
        curr.next = insert;
        insert.next = next;
        return head;
    }
}
