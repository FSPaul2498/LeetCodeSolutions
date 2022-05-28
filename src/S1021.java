public class S1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int layer = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                layer++;
                if (layer != 1) sb.append(ch);
            } else {
                layer--;
                if (layer != 0) sb.append(ch);
            }
        }
        return sb.toString();
    }
}
