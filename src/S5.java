public class S5 {
    String str, result = "";

    public String longestPalindrome(String s) {
        str = s;
        for (int i = 0; i < s.length(); i++) {
            check(i, i);
            check(i, i + 1);
        }
        return result;
    }

    void check(int left, int right) {
        while (left > -1 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        if (right - left - 1 > result.length())
            result = str.substring(left + 1, right);
    }
}
