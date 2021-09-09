public class S41 {
    public int firstMissingPositive(int[] nums) {
        for (int x : nums) check(nums, x);
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != i + 1) return i + 1;
        return nums.length + 1;
    }

    void check(int[] nums, int x) {
        if (x < 1 || x > nums.length || x == nums[x - 1]) return;
        int tmp = nums[x - 1];
        nums[x - 1] = x;
        check(nums, tmp);
    }
}
