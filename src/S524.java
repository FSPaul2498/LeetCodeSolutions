import java.util.List;

public class S524 {
    public String findLongestWord(String s, List<String> dictionary) {
        int lenS = s.length();
        String result = "";
        for (String dict : dictionary) {
            int lenD = dict.length(), idxS = 0, idxD = 0;
            while (idxS < lenS && idxD < lenD) {
                if (s.charAt(idxS) == dict.charAt(idxD)) idxD++;
                idxS++;
            }
            if (idxD == lenD) {
                if (lenD > result.length()) result = dict;
                else if (lenD == result.length() && result.compareTo(dict) > 0) result = dict;
            }
        }
        return result;
    }
}
