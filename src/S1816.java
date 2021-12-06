public class S1816 {
    public String truncateSentence(String s, int k) {
        int end = 0;
        while (k-- > 0) end = s.indexOf(' ', end + 1);
        return end == -1 ? s : s.substring(0, end);
    }
}
