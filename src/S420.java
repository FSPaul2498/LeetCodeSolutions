public class S420 {
    public int strongPasswordChecker(String password) {
        int n = password.length();
        int hasLower = 0, hasUpper = 0, hasDigit = 0;
        for (char ch:password.toCharArray()) {
            if (Character.isLowerCase(ch)) hasLower = 1;
            else if (Character.isUpperCase(ch)) hasUpper = 1;
            else if (Character.isDigit(ch)) hasDigit = 1;
        }
        int categories = hasLower + hasUpper + hasDigit;

        if (n < 6) return Math.max(6 - n, 3 - categories);
        else if (n <= 20) {
            int replace = 0,cnt = 0;
            char cur = '#';
            for (int i = 0; i < n; ++i) {
                char ch = password.charAt(i);
                if (ch == cur) {
                    ++cnt;
                } else {
                    replace += cnt / 3;
                    cnt = 1;
                    cur = ch;
                }
            }
            replace += cnt / 3;
            return Math.max(replace, 3 - categories);
        } else {
            int replace = 0, remove = n - 20, rm2 = 0, cnt = 0;
            char cur = '#';
            for (int i = 0; i < n; ++i) {
                char ch = password.charAt(i);
                if (ch == cur) {
                    ++cnt;
                } else {
                    if (remove > 0 && cnt >= 3) {
                        if (cnt % 3 == 0) {
                            --remove;
                            --replace;
                        } else if (cnt % 3 == 1) {
                            ++rm2;
                        }
                    }
                    replace += cnt / 3;
                    cnt = 1;
                    cur = ch;
                }
            }
            if (remove > 0 && cnt >= 3) {
                if (cnt % 3 == 0) {
                    --remove;
                    --replace;
                } else if (cnt % 3 == 1) {
                    ++rm2;
                }
            }
            replace += cnt / 3;
            int use2 = Math.min(Math.min(replace, rm2), remove / 2);
            replace -= use2;
            remove -= use2 * 2;
            int use3 = Math.min(replace, remove / 3);
            replace -= use3;
            return (n - 20) + Math.max(replace, 3 - categories);
        }
    }
}
