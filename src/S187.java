import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class S187 {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int n = s.length();
        if (n < 11) return result;
        for (int i = 0; i <= n - 10; i++) {
            String str = s.substring(i, i + 10);
            if (!result.contains(str)) {
                if (map.containsKey(str)) result.add(str);
                else map.put(str, 1);
            }
        }
        return result;
    }
}
