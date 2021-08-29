public class S35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        if (target <= nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;
        int l = 0, r = nums.length - 1, c = 0;
        while (l <= r) {
            c = (r - l) / 2 + l;
            if (target == nums[c]) return c;
            if (target < nums[c]) r = c - 1;
            else l = c + 1;
        }
        return target < nums[c] ? c : c + 1;
    }
}
