public class S2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxOfChar(answerKey, k, 'T'), maxOfChar(answerKey, k, 'F'));
    }

    private int maxOfChar(String answerKey, int k, char ch) {
        int len = answerKey.length();
        int max = 0;
        for (int l = 0, r = 0, cnt = 0; r < len; r++) {
            if (answerKey.charAt(r) != ch) cnt++;
            while (cnt > k)
                if (answerKey.charAt(l++) != ch) cnt--;
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
