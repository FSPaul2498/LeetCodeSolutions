public class S11 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, result = 0;
        while (l < r) {
            int now = (r - l) * (height[l] < height[r] ? height[l++] : height[r--]);
            if (now > result) result = now;
        }
        return result;
    }
}
