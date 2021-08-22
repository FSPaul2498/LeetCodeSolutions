public class S26 {
    public int removeDuplicates(int[] nums) {
        int w = 0, n = nums.length;
        for (int r = 0; r < n; r++)
            if (nums[w] != nums[r]) nums[++w] = nums[r];
        return w + 1;
    }
}
