public class S162 {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
        int l = 1, r = nums.length - 1, m = 0;
        while (l < r) {
            m = (l + r) / 2;
            if (nums[m] > nums[m - 1] && nums[m] > nums[m + 1]) return m;
            if (nums[m] > nums[m - 1]) l = m;
            else r = m;
        }
        return m;
    }
}
