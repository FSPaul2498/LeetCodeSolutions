import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class S46 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            dfs(nums, nums.length, i, new Stack<>());
        return result;
    }

    void dfs(int[] nums, int n, int pos, Stack<Integer> path) {
        path.push(nums[pos]);
        nums[pos] += 100;
        if (path.size() >= n) {
            result.add(new ArrayList<>(path));
            path.pop();
            nums[pos] -= 100;
            return;
        }
        for (int i = 0; i < n; i++)
            if (nums[i] < 50)
                dfs(nums, nums.length, i, path);
        path.pop();
        nums[pos] -= 100;
    }
}
