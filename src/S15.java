import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > 0) return result;
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int target = -nums[k], l = k + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] > target) r--;
                else if (nums[l] + nums[r] < target) l++;
                else {
                    ArrayList<Integer> tmp = new ArrayList<>(3);
                    tmp.add(-target);
                    tmp.add(nums[l]);
                    tmp.add(nums[r]);
                    result.add(tmp);
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }
            }
        }
        return result;
    }
}
