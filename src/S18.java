import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int a = 0; a < nums.length; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) continue;
            for (int b = a + 1; b < nums.length; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) continue;
                int l = b + 1, r = nums.length - 1;
                while (l < r) {
                    int now = nums[a] + nums[b] + nums[l] + nums[r];
                    if (now > target) r--;
                    else if (now < target) l++;
                    else {
                        ArrayList<Integer> tmp = new ArrayList<>(4);
                        tmp.add(nums[a]);
                        tmp.add(nums[b]);
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
        }
        return result;
    }
}
