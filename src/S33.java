public class S33 {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, c;
        while (l <= r) {
            c = (r - l) / 2 + l;
            if (nums[c] == target) return c;
            if (nums[l] <= nums[c]) {
                if (nums[l] <= target && target < nums[c]) r = c - 1;
                else l = c + 1;
            } else {
                if (nums[c] < target && target <= nums[r]) l = c + 1;
                else r = c - 1;
            }
        }
        return -1;
    }
}
