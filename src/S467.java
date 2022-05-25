import java.util.Arrays;

public class S467 {
    public int findSubstringInWraproundString(String p) {
        int[] dp = new int[26];
        dp[p.charAt(0) - 'a'] = 1;
        int sublen = 1;
        for (int i = 1; i < p.length(); i++) {
            int diff = p.charAt(i) - p.charAt(i - 1);
            if (diff == 1 || diff == -25) sublen++;
            else sublen = 1;
            if (sublen > dp[p.charAt(i) - 'a']) {
                dp[p.charAt(i) - 'a'] = sublen;
            }
        }
        return Arrays.stream(dp).sum();
    }
}
