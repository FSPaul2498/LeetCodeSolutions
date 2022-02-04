public class S1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = -1, cnt = 0;
        for (int[] rect : rectangles) {
            int len = Math.min(rect[0], rect[1]);
            if (len == maxLen) cnt++;
            else if (len > maxLen) {
                maxLen = len;
                cnt = 1;
            }
        }
        return cnt;
    }
}
