public class S713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0 || k == 1) return 0;
        int len = nums.length, cnt = 0;
        for (int l = 0, r = 0, product = 1; r < len; r++) {
            product *= nums[r];
            while (product >= k) product /= nums[l++];
            cnt += r - l + 1;
        }
        return cnt;
    }
}
