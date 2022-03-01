import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S47 {
    boolean[] isUsed;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        isUsed = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        backtrack(nums, result, 0, perm);
        return result;
    }

    public void backtrack(int[] nums, List<List<Integer>> result, int idx, List<Integer> perm) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (isUsed[i] || (i > 0 && nums[i] == nums[i - 1] && !isUsed[i - 1])) {
                continue;
            }
            perm.add(nums[i]);
            isUsed[i] = true;
            backtrack(nums, result, idx + 1, perm);
            isUsed[i] = false;
            perm.remove(idx);
        }
    }
}
