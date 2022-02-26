public class S2016 {
    public int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE, maxDiff = -1;
        for (int i : nums) {
            if (i <= min) min = i;
            else maxDiff = Math.max(maxDiff, i - min);
        }
        return maxDiff;
    }
}
