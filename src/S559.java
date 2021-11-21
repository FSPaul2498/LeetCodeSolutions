import java.util.List;

public class S559 {
    public int maxDepth(NaryTreeNode root) {
        if (root == null) return 0;
        int maxChildDepth = 0;
        List<NaryTreeNode> children = root.children;
        for (NaryTreeNode child : children)
            maxChildDepth = Math.max(maxChildDepth, maxDepth(child));
        return maxChildDepth + 1;
    }
}
