import java.util.ArrayDeque;
import java.util.Queue;

class CBTInserter {
    TreeNode root;
    Queue<TreeNode> leaves;

    public CBTInserter(TreeNode root) {
        this.root = root;
        leaves = new ArrayDeque<>();
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode n = nodes.poll();
            if (n.left != null) nodes.add(n.left);
            if (n.right != null) nodes.add(n.right);
            if (n.left == null || n.right == null) leaves.add(n);
        }
    }

    public int insert(int val) {
        TreeNode p = leaves.element();
        if (p.left == null) {
            p.left = new TreeNode(val);
            leaves.add(p.left);
        } else {
            p.right = new TreeNode(val);
            leaves.add(p.right);
            leaves.remove();
        }
        return p.val;
    }

    public TreeNode get_root() {
        return root;
    }
}
