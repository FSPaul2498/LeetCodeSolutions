import java.util.Arrays;

public class S462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int standard = nums[nums.length / 2], sum = 0;
        for (int num : nums) {
            sum += Math.abs(num - standard);
        }
        return sum;
    }
}
