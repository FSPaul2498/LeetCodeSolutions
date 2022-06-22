import java.util.ArrayDeque;
import java.util.Queue;

public class S513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int value = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            value = node.val;
            if (node.right != null) queue.offer(node.right);
            if (node.left != null) queue.offer(node.left);
        }
        return value;
    }
}
