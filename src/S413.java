public class S413 {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;
        int len = 0, result = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) result += ++len;
            else len = 0;
        }
        return result;
    }
}
