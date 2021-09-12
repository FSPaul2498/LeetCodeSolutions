public class S678 {
    public boolean checkValidString(String s) {
        int min = 0, max = 0;
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                    min++;
                    max++;
                    break;
                case ')':
                    if (min > 0) min--;
                    max--;
                    break;
                case '*':
                    if (min > 0) min--;
                    max++;
                    break;
            }
            if (max < 0) return false;
        }
        return min == 0;
    }
}
