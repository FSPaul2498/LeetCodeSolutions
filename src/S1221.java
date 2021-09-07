public class S1221 {
    public int balancedStringSplit(String s) {
        int cnt = 0, result = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'L') cnt++;
            else cnt--;
            if (cnt == 0) result++;
        }
        return result;
    }
}
