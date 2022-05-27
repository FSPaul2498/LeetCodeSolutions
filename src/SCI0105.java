public class SCI0105 {
    public boolean oneEditAway(String first, String second) {
        if (first.length() > second.length()) {
            String tmp = first;
            first = second;
            second = tmp;
        }
        int len1 = first.length(), len2 = second.length();
        if (len2 - len1 > 1) return false;
        if (len2 - len1 == 1) {
            boolean same = true;
            for (int i = 0, j = 0; i < len1; i++, j++) {
                if (first.charAt(i) != second.charAt(j)) {
                    if (same) {
                        same = false;
                        i--;
                    } else return false;
                }
            }
            return true;
        } else {
            if (first.equals(second)) return true;
            boolean same = true;
            for (int i = 0; i < len1; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    if (same) same = false;
                    else return false;
                }
            }
            return true;
        }
    }
}
