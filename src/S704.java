public class S704 {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length, mid;
        while (l < r) {
            mid = (r - l) / 2 + l;
            if (target == nums[mid]) return mid;
            if (target < nums[mid]) r = mid;
            else l = mid + 1;
        }
        return -1;
    }
}
