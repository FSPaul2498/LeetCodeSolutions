public class S482 {
    public String licenseKeyFormatting(String s, int k) {
        char[] sChar = s.toCharArray();
        int cnt = 0;
        for (char ch : sChar)
            if (ch != '-') cnt++;
        StringBuilder sb = new StringBuilder();
        for (char ch : sChar) {
            if (ch == '-') continue;
            if (ch > 96) sb.append((char) (ch - 32));
            else sb.append(ch);
            cnt--;
            if (cnt > 0 && cnt % k == 0) sb.append('-');
        }
        return sb.toString();
    }
}
