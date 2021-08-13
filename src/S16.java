import java.util.Arrays;

public class S16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE, result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int now = nums[i] + nums[l] + nums[r];
                if (now == target) return target;
                if (Math.abs(target - now) < diff) {
                    result = now;
                    diff = Math.abs(target - now);
                }
                if (now > target) r--;
                else l++;
            }
        }
        return result;
    }
}
