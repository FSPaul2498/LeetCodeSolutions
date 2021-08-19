public class S345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        for (int n = chars.length, l = 0, r = n - 1; l < r; l++, r--) {
            while (l < n && notVowel(chars[l])) l++;
            while (r > 0 && notVowel(chars[r])) r--;
            if (l >= r) break;
            char tmp = chars[l];
            chars[l] = chars[r];
            chars[r] = tmp;
        }
        return new String(chars);
    }

    boolean notVowel(char c) {
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U';
    }
}
