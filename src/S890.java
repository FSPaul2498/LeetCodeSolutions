import java.util.ArrayList;
import java.util.List;

public class S890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int len = pattern.length();
        List<String> result = new ArrayList<>();
        for (String word : words) {
            int[] p2w = new int[26];
            int[] w2p = new int[26];
            int i = 0;
            for (; i < len; i++) {
                char p = pattern.charAt(i), w = word.charAt(i);
                if (p2w[p - 'a'] == 0) p2w[p - 'a'] = w;
                else if (p2w[p - 'a'] != w) break;
                if (w2p[w - 'a'] == 0) w2p[w - 'a'] = p;
                else if (w2p[w - 'a'] != p) break;
            }
            if (i == len) result.add(word);
        }
        return result;
    }
}
