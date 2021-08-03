public class S581 {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length, left = n - 1, right = 0;
        int max = nums[0], min = nums[n - 1];
        for (int i = 1; i < n; i++) {
            if (nums[i] < max)
                right = i;
            max = Math.max(max, nums[i]);
            if (nums[n - 1 - i] > min)
                left = n - 1 - i;
            min = Math.min(min, nums[n - 1 - i]);
        }
        if (left >= right) return 0;
        return right - left + 1;
    }
}
