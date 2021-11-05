public class S1218 {
    public int longestSubsequence(int[] arr, int difference) {
        int[] dp = new int[50000];
        int result = 1;
        for (int x : arr) {
            x += 25000;
            dp[x] = dp[x - difference] + 1;
            if (dp[x] > result) result = dp[x];
        }
        return result;
    }
}
