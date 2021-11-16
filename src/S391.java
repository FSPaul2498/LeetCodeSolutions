import java.util.HashSet;
import java.util.Set;

public class S391 {
    public boolean isRectangleCover(int[][] rectangles) {
        Set<Long> dots = new HashSet<>();
        long sumArea = 0;
        for (int[] rect : rectangles) {
            sumArea += (long) (rect[2] - rect[0]) * (rect[3] - rect[1]);
            long dot = (500000 + rect[0]) * 1000000L + 500000 + rect[1];
            if (!dots.add(dot)) dots.remove(dot);
            dot = (500000 + rect[2]) * 1000000L + 500000 + rect[3];
            if (!dots.add(dot)) dots.remove(dot);
            dot = (500000 + rect[0]) * 1000000L + 500000 + rect[3];
            if (!dots.add(dot)) dots.remove(dot);
            dot = (500000 + rect[2]) * 1000000L + 500000 + rect[1];
            if (!dots.add(dot)) dots.remove(dot);
        }
        if (dots.size() != 4) return false;
        long x = 1000000, y = 1000000, a = -1000000, b = -1000000;
        for (long dot : dots) {
            x = Math.min(x, dot / 1000000 - 500000);
            y = Math.min(y, dot % 1000000 - 500000);
            a = Math.max(a, dot / 1000000 - 500000);
            b = Math.max(b, dot % 1000000 - 500000);
        }
        long trueArea = (a - x) * (b - y);
        return sumArea == trueArea;
    }
}
