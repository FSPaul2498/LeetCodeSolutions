import java.util.LinkedList;
import java.util.List;

public class S590 {
    public List<Integer> postorder(NaryTreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;
        dfs(root, result);
        return result;
    }

    void dfs(NaryTreeNode root, List<Integer> result) {
        for (NaryTreeNode node : root.children) {
            dfs(node, result);
        }
        result.add(root.val);
    }
}
