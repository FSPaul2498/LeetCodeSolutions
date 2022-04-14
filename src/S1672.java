public class S1672 {
    public int maximumWealth(int[][] accounts) {
        int maxW = 0;
        for (int[] account : accounts) {
            int sumW = 0;
            for (int w : account) sumW += w;
            maxW = Math.max(maxW, sumW);
        }
        return maxW;
    }
}
