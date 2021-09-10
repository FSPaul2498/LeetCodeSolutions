public class S42 {
    public int trap(int[] height) {
        int n = height.length, sumHeight = 0;
        int rightHeight = 0, rightArea = 0;
        for (int h : height) {
            sumHeight += h;
            rightHeight = Math.max(rightHeight, h);
            rightArea += rightHeight;
        }
        int leftHeight = 0, leftArea = 0;
        for (int i = n - 1; i >= 0; i--) {
            leftHeight = Math.max(leftHeight, height[i]);
            leftArea += leftHeight;
        }
        return rightArea + leftArea - n * rightHeight - sumHeight;
    }
}
