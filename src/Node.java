public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    static Node makeList(int[] source) {
        Node temp = new Node(), head = temp;
        for (int i : source) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        return head.next;
    }

    static Node makeCircularList(int[] source) {
        Node temp = new Node(), head = temp;
        for (int i : source) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        temp.next = head.next;
        return head.next;
    }

    static Node[] makeList(int[][] source) {
        Node[] heads = new Node[source.length];
        for (int i = 0; i < source.length; i++)
            heads[i] = Node.makeList(source[i]);
        return heads;
    }
}
