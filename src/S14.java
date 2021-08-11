import java.util.Arrays;

public class S14 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if (strs[0].isEmpty()) return "";
        int end = Math.min(strs[0].length(), strs[strs.length - 1].length()) - 1;
        for (int i = end; i >= 0; i--)
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i))
                end = i - 1;
        return strs[0].substring(0, end + 1);
    }
}
