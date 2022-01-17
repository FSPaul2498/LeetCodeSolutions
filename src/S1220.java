public class S1220 {
    public int countVowelPermutation(int n) {
        long MOD = 1000000007;
        long[] dp = new long[5], ndp = new long[5];
        for (int i = 0; i < 5; i++) {
            dp[i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            ndp[0] = (dp[1] + dp[2] + dp[4]) % MOD;
            ndp[1] = (dp[0] + dp[2]) % MOD;
            ndp[2] = (dp[1] + dp[3]) % MOD;
            ndp[3] = dp[2];
            ndp[4] = (dp[2] + dp[3]) % MOD;
            System.arraycopy(ndp, 0, dp, 0, 5);
        }
        long ans = 0;
        for (int i = 0; i < 5; i++) {
            ans = (ans + dp[i]) % MOD;
        }
        return (int) ans;
    }
}
