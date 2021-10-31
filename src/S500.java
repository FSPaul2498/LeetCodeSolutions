import java.util.ArrayList;
import java.util.List;

public class S500 {
    public String[] findWords(String[] words) {
        String strQ = "qwertyuiopQWERTYUIOP";
        String strA = "asdfghjklASDFGHJKL";
        String strZ = "zxcvbnmZXCVBNM";
        List<String> result = new ArrayList<>();
        for (String word : words) {
            int len = word.length();
            char first = word.charAt(0);
            int i = 1;
            if (strQ.indexOf(first) != -1) {
                for (; i < len; i++)
                    if (strQ.indexOf(word.charAt(i)) == -1) break;
                if (i == len) result.add(word);
            } else if (strA.indexOf(first) != -1) {
                for (; i < len; i++)
                    if (strA.indexOf(word.charAt(i)) == -1) break;
                if (i == len) result.add(word);
            } else {
                for (; i < len; i++)
                    if (strZ.indexOf(word.charAt(i)) == -1) break;
                if (i == len) result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}
