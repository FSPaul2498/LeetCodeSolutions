import java.util.*;

public class S819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        String maxWord = "";
        int maxTimes = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : paragraph.toCharArray()) {
            if (Character.isLetter(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                if (sb.length() > 0) {
                    String word = sb.toString();
                    if (!set.contains(word)) {
                        int times = map.getOrDefault(word, 0) + 1;
                        map.put(word, times);
                        if (times > maxTimes) {
                            maxWord = word;
                            maxTimes = times;
                        }
                    }
                    sb = new StringBuilder();
                }
            }
        }
        if (sb.length() > 0) {
            String word = sb.toString();
            if (!set.contains(word)) {
                int times = map.getOrDefault(word, 0) + 1;
                map.put(word, times);
                if (times > maxTimes) {
                    maxWord = word;
                }
            }
        }
        return maxWord;
    }
}
