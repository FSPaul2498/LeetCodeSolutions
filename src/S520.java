public class S520 {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if (n < 2) return true;
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' && word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') {
            for (int i = 2; i < n; i++)
                if (word.charAt(i) >= 'a') return false;
        } else {
            for (int i = 1; i < n; i++)
                if (word.charAt(i) <= 'Z') return false;
        }
        return true;
    }
}
