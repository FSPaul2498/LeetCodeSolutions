import java.util.HashSet;
import java.util.Set;

public class S804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] table = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (String s : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) sb.append(table[c - 'a']);
            set.add(sb.toString());
        }
        return set.size();
    }
}
