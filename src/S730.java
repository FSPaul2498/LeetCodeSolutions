import java.util.Arrays;

public class S730 {
    public int countPalindromicSubsequences(String s) {
        final int MOD = 1000000007;
        int n = s.length();
        int[][] dp = new int[n][n];
        int[][] next = new int[n][4];
        int[][] pre = new int[n][4];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        int[] pos = new int[4];
        Arrays.fill(pos, -1);
        for (int i = 0; i < n; i++) {
            System.arraycopy(pos, 0, pre[i], 0, 4);
            pos[s.charAt(i) - 'a'] = i;
        }
        pos[0] = pos[1] = pos[2] = pos[3] = n;
        for (int i = n - 1; i >= 0; i--) {
            System.arraycopy(pos, 0, next[i], 0, 4);
            pos[s.charAt(i) - 'a'] = i;
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len <= n; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    int low = next[i][s.charAt(i) - 'a'];
                    int high = pre[j][s.charAt(i) - 'a'];
                    if (low > high) {
                        dp[i][j] = (2 + dp[i + 1][j - 1] * 2) % MOD;
                    } else if (low == high) {
                        dp[i][j] = (1 + dp[i + 1][j - 1] * 2) % MOD;
                    } else {
                        dp[i][j] = (dp[i + 1][j - 1] * 2 % MOD - dp[low + 1][high - 1] + MOD) % MOD;
                    }
                } else {
                    dp[i][j] = ((dp[i + 1][j] + dp[i][j - 1]) % MOD - dp[i + 1][j - 1] + MOD) % MOD;
                }
            }
        }
        return dp[0][n - 1];
    }
}
