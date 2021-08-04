import java.util.Arrays;

public class S611 {
    public int triangleNumber(int[] nums) {
        int result = 0, n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            for (int a = i + 1, b = a + 1; a < n - 1; a++) {
                b = Math.max(b, a + 1);
                while (b < n && nums[b] - nums[a] < nums[i])
                    b++;
                result += b - a - 1;
            }
        }
        return result;
    }
}
