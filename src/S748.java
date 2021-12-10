public class S748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] letters = new int[26];
        for (char ch : licensePlate.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') letters[ch - 'A']++;
            else if (ch >= 'a' && ch <= 'z') letters[ch - 'a']++;
        }
        String result = "";
        for (String word : words) {
            if (result.length() > 0 && result.length() <= word.length()) continue;
            int[] provider = new int[26];
            for (char ch : word.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') provider[ch - 'A']++;
                else if (ch >= 'a' && ch <= 'z') provider[ch - 'a']++;
            }
            int i = 0;
            for (; i < 26; i++) if (letters[i] > provider[i]) break;
            if (i == 26) result = word;
        }
        return result;
    }
}
