import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class S40 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int pos = 0; pos < candidates.length; pos++) {
            if (pos > 0 && candidates[pos] == candidates[pos - 1]) continue;
            if (dfs(candidates, pos, 0, target, new Stack<>())) break;
        }
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
        for (int i = pos + 1; i < candidates.length; i++) {
            if (i > pos + 1 && candidates[i] == candidates[i - 1]) continue;
            if (dfs(candidates, i, sum, target, path)) break;
        }
        path.pop();
        return false;
    }
}
