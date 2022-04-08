import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class S429 {
    public List<List<Integer>> levelOrder(NaryTreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<NaryTreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < cnt; i++) {
                NaryTreeNode cur = queue.poll();
                assert cur != null;
                level.add(cur.val);
                for (NaryTreeNode child : cur.children) {
                    queue.offer(child);
                }
            }
            result.add(level);
        }
        return result;
    }
}
