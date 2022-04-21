public class S824 {
    public String toGoatLatin(String sentence) {
        String[] sp = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        int idx = 1;
        for (String word : sp) {
            char cap = word.charAt(0);
            if (isVowel(cap)) sb.append(word);
            else sb.append(word.substring(1)).append(cap);
            sb.append("ma").append("a".repeat(idx++)).append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
