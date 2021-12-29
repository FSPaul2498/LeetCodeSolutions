import java.util.HashMap;
import java.util.Map;

public class S1995 {
    public int countQuadruplets(int[] nums) {
        int n = nums.length, result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int b = n - 3; b >= 1; b--) {
            for (int d = b + 2; d < n; d++)
                map.put(nums[d] - nums[b + 1], map.getOrDefault(nums[d] - nums[b + 1], 0) + 1);
            for (int a = 0; a < b; a++)
                result += map.getOrDefault(nums[a] + nums[b], 0);
        }
        return result;
    }
}
