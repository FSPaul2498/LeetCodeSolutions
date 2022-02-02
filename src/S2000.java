public class S2000 {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);
        if (i == -1) return word;
        StringBuilder sb = new StringBuilder(word.substring(0, i + 1));
        sb.reverse();
        sb.append(word.substring(i + 1));
        return sb.toString();
    }
}
