public class S58 {
    public int lengthOfLastWord(String s) {
        int result = 0, i = s.length() - 1;
        while (s.charAt(i) == ' ') i--;
        for (; i >= 0 && s.charAt(i) != ' '; i--) result++;
        return result;
    }
}
