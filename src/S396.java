public class S396 {
    public int maxRotateFunction(int[] nums) {
        int len = nums.length, sum = 0, f = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            f += i * nums[i];
        }
        int result = f;
        for (int i = 1; i < len; i++) {
            f += sum - len * nums[len - i];
            result = Math.max(result, f);
        }
        return result;
    }
}
