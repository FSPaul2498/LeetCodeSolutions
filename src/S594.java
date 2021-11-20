import java.util.Arrays;

public class S594 {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, result = 0;
        for (int l = 0, r = 0; r < n; r++) {
            while (l < r && nums[r] - nums[l] > 1) l++;
            if (nums[r] - nums[l] == 1) result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
