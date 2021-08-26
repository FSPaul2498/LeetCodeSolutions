public class S32 {
    public int longestValidParentheses(String s) {
        int result = 0, cntL = 0, cntR = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') cntL++;
            else cntR++;
            if (cntL == cntR) result = Math.max(result, cntL + cntR);
            else if (cntL < cntR) cntL = cntR = 0;
        }
        cntL = cntR = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') cntR++;
            else cntL++;
            if (cntL == cntR) result = Math.max(result, cntL + cntR);
            else if (cntL > cntR) cntL = cntR = 0;
        }
        return result;
    }
}
