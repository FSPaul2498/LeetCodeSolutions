import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S438 {
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        List<Integer> result = new ArrayList<>();
        if (sLen < pLen) return result;
        int[] sCount = new int[26], pCount = new int[26];

        for (int i = 0; i < pLen; ++i) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(sCount, pCount)) result.add(0);

        for (int i = pLen; i < sLen; i++) {
            sCount[s.charAt(i - pLen) - 'a']--;
            sCount[s.charAt(i) - 'a']++;
            if (Arrays.equals(sCount, pCount)) result.add(i - pLen + 1);
        }
        return result;
    }
}
