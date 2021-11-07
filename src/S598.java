public class S598 {
    public int maxCount(int m, int n, int[][] ops) {
        int minA = m, minB = n;
        for (int[] op : ops) {
            minA = Math.min(op[0], minA);
            minB = Math.min(op[1], minB);
        }
        return minA * minB;
    }
}
