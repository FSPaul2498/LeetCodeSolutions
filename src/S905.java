public class S905 {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length, l = 0, r = len - 1;
        while (l < len && (nums[l] & 1) == 0) l++;
        while (r >= 0 && ((nums[r] & 1) == 1)) r--;
        while (l < r) {
            nums[l] ^= nums[r];
            nums[r] ^= nums[l];
            nums[l] ^= nums[r];
            while (l < len && (nums[l] & 1) == 0) l++;
            while (r >= 0 && (nums[r] & 1) == 1) r--;
        }
        return nums;
    }
}
