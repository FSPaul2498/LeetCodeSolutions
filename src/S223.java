public class S223 {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area = 0;
        area += (ax1 - ax2) * (ay1 - ay2);
        area += (bx1 - bx2) * (by1 - by2);

        if (ax1 > bx2) return area;
        if (ax2 < bx1) return area;
        if (ay1 > by2) return area;
        if (ay2 < by1) return area;

        int cx1 = Math.max(ax1, bx1);
        int cx2 = Math.min(ax2, bx2);
        int cy1 = Math.max(ay1, by1);
        int cy2 = Math.min(ay2, by2);
        area -= (cx1 - cx2) * (cy1 - cy2);

        return area;
    }
}
