public class S541 {
    public String reverseStr(String s, int k) {
        if (k == 1) return s;
        StringBuilder result = new StringBuilder(), tmp;
        for (int i = 0; i < s.length(); i += k) {
            int j = Math.min(s.length(), i + k);
            tmp = new StringBuilder(s.substring(i, j));
            if (i / k % 2 == 0) tmp.reverse();
            result.append(tmp);
        }
        return result.toString();
    }
}
