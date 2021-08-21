public class S443 {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        int cnt = 1;
        for (int i = 1, n = chars.length; i < n; i++) {
            if (chars[i] == chars[i - 1]) cnt++;
            else {
                if (cnt > 1) {
                    sb.append(cnt);
                    cnt = 1;
                }
                sb.append(chars[i]);
            }
        }
        if (cnt > 1) sb.append(cnt);
        sb.getChars(0, sb.length(), chars, 0);
        return sb.length();
    }
}
