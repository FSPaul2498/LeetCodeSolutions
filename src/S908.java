public class S908 {
    public int smallestRangeI(int[] nums, int k) {
        int min = 10000, max = 0;
        for (int n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return Math.max(max - min - k - k, 0);
    }
}
