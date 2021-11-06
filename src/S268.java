public class S268 {
    public int missingNumber(int[] nums) {
        int result = nums.length * (nums.length + 1) / 2;
        for (int num : nums) result -= num;
        return result;
    }
}
