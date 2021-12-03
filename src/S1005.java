import java.util.Arrays;

public class S1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length, sum = 0;
        for (int i = 0; i < len && k > 0; i++, k--) {
            if (nums[i] <= 0) nums[i] = -nums[i];
            else break;
        }
        if (k > 0) {
            Arrays.sort(nums);
            if ((k & 1) == 1) nums[0] = -nums[0];
        }
        for (int x : nums) sum += x;
        return sum;
    }
}
