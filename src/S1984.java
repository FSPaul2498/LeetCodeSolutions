import java.util.Arrays;

public class S1984 {
    public int minimumDifference(int[] nums, int k) {
        int min = Integer.MAX_VALUE, len = nums.length - k;
        Arrays.sort(nums);
        for (int i = 0; i <= len; i++) {
            min = Math.min(min, nums[i + k - 1] - nums[i]);
        }
        return min;
    }
}
