public class S1576 {
    public String modifyString(String s) {
        char[] sc = s.toCharArray();
        if (sc[0] == '?') sc[0] = 'a';
        int n = s.length();
        for (int i = 1; i < n; i++) {
            if (sc[i] == '?') sc[i] = (char) ('a' + (sc[i - 1] - 'a' + 1) % 26);
            else if (sc[i] == sc[i - 1]) sc[i - 1] = (char) ('a' + (sc[i - 1] - 'a' + 1) % 26);
        }
        return String.valueOf(sc);
    }
}
