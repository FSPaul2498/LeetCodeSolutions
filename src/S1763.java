public class S1763 {
    public String longestNiceSubstring(String s) {
        int len = s.length(), maxPos = 0, maxLen = 0;
        for (int i = 0; i < len; i++) {
            int lower = 0;
            int upper = 0;
            for (int j = i; j < len; j++) {
                if (Character.isLowerCase(s.charAt(j)))
                    lower |= 1 << (s.charAt(j) - 'a');
                else
                    upper |= 1 << (s.charAt(j) - 'A');
                if (lower == upper && j - i + 1 > maxLen) {
                    maxPos = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(maxPos, maxPos + maxLen);
    }
}
