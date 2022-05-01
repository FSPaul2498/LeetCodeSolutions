import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S1305 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        addElements(root1);
        addElements(root2);
        Collections.sort(result);
        return result;
    }

    public void addElements(TreeNode root) {
        if (root == null) return;
        result.add(root.val);
        addElements(root.left);
        addElements(root.right);
    }
}
