import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S720 {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String result = "";
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                if (word.length() > result.length()) result = word;
                set.add(word);
            }
        }
        return result;
    }
}
