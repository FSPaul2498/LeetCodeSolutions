public class S2047 {
    public int countValidWords(String sentence) {
        int cnt = 0;
        for (String s : sentence.split(" ")) {
            if (isValid(s)) {
                cnt++;
            }
        }
        return cnt;
    }

    boolean isValid(String s) {
        int len = s.length();
        if (len == 0) return false;
        boolean haveHyphen = false;
        for (int i = 0; i < len; i++) {
            switch (s.charAt(i)) {
                case '!':
                case '.':
                case ',':
                    if (i != len - 1) return false;
                    break;
                case '-':
                    if (haveHyphen) return false;
                    else haveHyphen = true;
                    if (i == 0 || i == len - 1) return false;
                    if (s.charAt(i - 1) < 'a' || s.charAt(i - 1) > 'z') return false;
                    if (s.charAt(i + 1) < 'a' || s.charAt(i + 1) > 'z') return false;
                    break;
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    return false;
            }
        }
        return true;
    }
}
