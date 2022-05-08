import java.util.ArrayList;
import java.util.List;

public class S442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);
            if (nums[x - 1] > 0) nums[x - 1] *= -1;
            else dup.add(x);
        }
        return dup;
    }
}
