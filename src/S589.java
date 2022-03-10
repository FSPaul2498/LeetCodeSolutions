import java.util.LinkedList;
import java.util.List;

public class S589 {
    public List<Integer> preorder(NaryTreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;
        dfs(root, result);
        return result;
    }

    void dfs(NaryTreeNode root, List<Integer> result) {
        result.add(root.val);
        for (NaryTreeNode node : root.children) {
            dfs(node, result);
        }
    }
}
