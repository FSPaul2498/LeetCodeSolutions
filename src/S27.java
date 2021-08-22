public class S27 {
    public int removeElement(int[] nums, int val) {
        int w = 0, n = nums.length;
        for (int r = 0; r < n; r++)
            if (nums[r] != val) nums[w++] = nums[r];
        return w;
    }
}
