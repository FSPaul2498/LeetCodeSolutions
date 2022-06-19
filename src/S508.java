import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S508 {
    Map<Integer, Integer> map = new HashMap<>();
    int frequency = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        List<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == frequency) list.add(key);
        }
        int[] result = new int[list.size()];
        int i = 0;
        for (int k : list) {
            result[i++] = k;
        }
        return result;
    }

    public int dfs(TreeNode node) {
        if (node == null) return 0;
        int sum = node.val + dfs(node.left) + dfs(node.right);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        frequency = Math.max(frequency, map.get(sum));
        return sum;
    }
}
