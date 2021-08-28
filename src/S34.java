public class S34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums.length == 0) return result;
        if (target < nums[0]) return result;
        if (target > nums[nums.length - 1]) return result;
        int l = 0, r = nums.length - 1, c = 0;
        while (l <= r) {
            c = (r - l) / 2 + l;
            if (target == nums[c]) break;
            if (target < nums[c]) r = c - 1;
            else l = c + 1;
        }
        if (target != nums[c]) return result;

        l = 0;
        r = c;
        while (l <= r) {
            result[0] = (r - l) / 2 + l;
            if (nums[result[0]] < target) l = result[0] + 1;
            else r = result[0] - 1;
        }
        if (nums[result[0]] < target) result[0]++;

        l = c;
        r = nums.length - 1;
        while (l <= r) {
            result[1] = (r - l) / 2 + l;
            if (target < nums[result[1]]) r = result[1] - 1;
            else l = result[1] + 1;
        }
        if (target < nums[result[1]]) result[1]--;

        return result;
    }
}
