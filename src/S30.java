import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class S30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        HashMap<String, Integer> target = new HashMap<>();
        for (String word : words) mapAdd(target, word);
        int wordLen = words[0].length(), wordNum = words.length;
        for (int start = 0; start < wordLen; start++) {
            int ptrL = start, ptrR = ptrL + wordLen * wordNum, pos = ptrL;
            if (ptrR > s.length()) break;
            HashMap<String, Integer> window = new HashMap<>();
            while (pos < ptrR) {
                mapAdd(window, s.substring(pos, pos + wordLen));
                pos += wordLen;
            }
            if (target.equals(window)) result.add(ptrL);
            while (pos + wordLen <= s.length()) {
                mapDel(window, s.substring(ptrL, ptrL + wordLen));
                mapAdd(window, s.substring(pos, pos + wordLen));
                ptrL += wordLen;
                pos += wordLen;
                if (target.equals(window)) result.add(ptrL);
            }
        }
        return result;
    }

    void mapAdd(HashMap<String, Integer> map, String word) {
        if (!map.containsKey(word)) map.put(word, 1);
        else map.replace(word, map.get(word) + 1);
    }

    void mapDel(HashMap<String, Integer> map, String word) {
        if (map.get(word) == 1) map.remove(word);
        else map.replace(word, map.get(word) - 1);
    }
}
