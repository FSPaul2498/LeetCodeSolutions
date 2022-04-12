public class S806 {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1, lastWidth = 0;
        for (char ch : s.toCharArray()) {
            int w = widths[ch - 'a'];
            lastWidth += w;
            if (lastWidth > 100) {
                lines++;
                lastWidth = w;
            }
        }
        return new int[]{lines, lastWidth};
    }
}
