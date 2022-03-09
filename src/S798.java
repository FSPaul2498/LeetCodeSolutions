public class S798 {
    public int bestRotation(int[] nums) {
        int len = nums.length;
        int[] diffs = new int[len];
        for (int i = 0; i < len; i++) {
            int low = (i + 1) % len;
            int high = (i - nums[i] + len + 1) % len;
            diffs[low]++;
            diffs[high]--;
            if (low >= high) diffs[0]++;
        }
        int bestIndex = 0, maxScore = 0, score = 0;
        for (int i = 0; i < len; i++) {
            score += diffs[i];
            if (score > maxScore) {
                bestIndex = i;
                maxScore = score;
            }
        }
        return bestIndex;
    }
}
