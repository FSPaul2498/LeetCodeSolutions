public class S45 {
    public int jump(int[] nums) {
        int n = nums.length, result = 0, pos = 0;
        while (pos < n - 1) {
            int betterStep = 0, maxStep = nums[pos], maxReach = 0;
            if (pos + maxStep >= n - 1) {
                result++;
                break;
            }
            for (int tryStep = 1; tryStep <= maxStep; tryStep++) {
                if (nums[pos + tryStep] != 0 && tryStep + nums[pos + tryStep] >= maxReach) {
                    maxReach = tryStep + nums[pos + tryStep];
                    betterStep = tryStep;
                }
            }
            pos += betterStep;
            result++;
        }
        return result;
    }
}
