import java.util.LinkedList;
import java.util.List;

public class S17 {
    public List<String> letterCombinations(String digits) {
        char[][] table = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'},
                {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        LinkedList<String> result = new LinkedList<>();
        if (digits.isEmpty()) return result;
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            int l = result.size();
            for (int j = 0; j < l; j++) {
                String tmp = result.poll();
                for (char ch : table[digits.charAt(i) - 48])
                    result.add(tmp + ch);
            }
        }
        return result;
    }
}
