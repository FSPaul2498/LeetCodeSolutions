import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class S39 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int pos = 0; pos < candidates.length; pos++)
            if (dfs(candidates, pos, 0, target, new Stack<>())) break;
        return result;
    }

    boolean dfs(int[] candidates, int pos, int sum, int target, Stack<Integer> path) {
        sum += candidates[pos];
        if (sum > target) return true;
        path.push(candidates[pos]);
        if (sum == target) {
            result.add(new ArrayList<>(path));
            path.pop();
            return true;
        }
        for (; pos < candidates.length; pos++)
            if (dfs(candidates, pos, sum, target, path)) break;
        path.pop();
        return false;
    }
}
