public class S10 {
    public boolean isMatch(String s, String p) {
        // return s.matches(p);
        int sLen = s.length(), pLen = p.length();
        boolean[][] dp = new boolean[sLen + 1][pLen + 1];
        dp[0][0] = true;
        for (int i = 0; i <= sLen; i++) {
            for (int j = 1; j <= pLen; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (!dp[i][j])
                        if (i != 0)
                            if (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')
                                dp[i][j] = dp[i - 1][j];
                } else {
                    if (i != 0)
                        if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')
                            dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[sLen][pLen];
    }
}
