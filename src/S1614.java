public class S1614 {
    public int maxDepth(String s) {
        int layer = 0, max = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                layer++;
                if (layer > max) max = layer;
            }
            if (ch == ')') layer--;
        }
        return max;
    }
}
