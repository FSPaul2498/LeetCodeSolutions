import java.util.ArrayDeque;
import java.util.Queue;

public class S1609 {
    public boolean isEvenOddTree(TreeNode root) {
        boolean isOdd = false;
        Queue<TreeNode> thisLevel = new ArrayDeque<>();
        thisLevel.add(root);
        while (!thisLevel.isEmpty()) {
            Queue<TreeNode> nextLevel = new ArrayDeque<>();
            int num = isOdd ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            while (!thisLevel.isEmpty()) {
                TreeNode thisNode = thisLevel.poll();
                if (thisNode.left != null) nextLevel.add(thisNode.left);
                if (thisNode.right != null) nextLevel.add(thisNode.right);
                if (isOdd && (thisNode.val % 2 != 0 || thisNode.val >= num)) return false;
                if (!isOdd && (thisNode.val % 2 == 0 || thisNode.val <= num)) return false;
                num = thisNode.val;
            }
            thisLevel = nextLevel;
            isOdd = !isOdd;
        }
        return true;
    }
}
