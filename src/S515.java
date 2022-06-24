import java.util.ArrayList;
import java.util.List;

public class S515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        if (root == null) return values;
        List<TreeNode> nextRow = new ArrayList<>();
        nextRow.add(root);
        while (!nextRow.isEmpty()) {
            List<TreeNode> thisRow = nextRow;
            nextRow = new ArrayList<>();
            int maxValue = Integer.MIN_VALUE;
            for (TreeNode node : thisRow) {
                maxValue = Math.max(node.val, maxValue);
                if (node.left != null) nextRow.add(node.left);
                if (node.right != null) nextRow.add(node.right);
            }
            values.add(maxValue);
        }
        return values;
    }
}
