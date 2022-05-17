public class S953 {
    public boolean isAlienSorted(String[] words, String order) {
        int[] table = new int[26];
        for (int i = 0; i < 26; i++) {
            table[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            boolean sorted = false;
            String a = words[i - 1], b = words[i];
            for (int j = 0; j < a.length() && j < b.length(); j++) {
                int i1 = table[a.charAt(j) - 'a'], i2 = table[b.charAt(j) - 'a'];
                if (i1 > i2) {
                    return false;
                } else if (i1 < i2) {
                    sorted = true;
                    break;
                }
            }
            if (!sorted && a.length() > b.length()) {
                return false;
            }
        }
        return true;
    }
}
