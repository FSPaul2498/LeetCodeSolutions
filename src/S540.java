public class S540 {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = (r - l) / 2 + l;
            if (nums[m] == nums[m ^ 1]) l = m + 1;
            else r = m;
        }
        return nums[l];
    }
}
