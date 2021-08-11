public class S446 {
    public int numberOfArithmeticSlices(int[] nums) {
        int result = 0, n = nums.length;
        int[][] dp = new int[n][n];
        for (int j = n - 2; j > 0; j--) {
            for (int i = j - 1; i >= 0; i--) {
                long diff = (long) nums[j] - nums[i];
                int cnt = 0;
                for (int k = j + 1; k < n; k++)
                    if ((long) nums[k] - nums[j] == diff)
                        cnt += dp[j][k] + 1;
                result += cnt;
                dp[i][j] = cnt;
            }
        }
        return result;
    }
}
