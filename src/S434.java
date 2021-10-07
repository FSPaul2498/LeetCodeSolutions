public class S434 {
    public int countSegments(String s) {
        boolean inWord = false;
        int result = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ' ') inWord = false;
            else {
                if (!inWord) result++;
                inWord = true;
            }
        }
        return result;
    }
}
