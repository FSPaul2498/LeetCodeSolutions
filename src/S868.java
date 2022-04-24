public class S868 {
    public int binaryGap(int n) {
        int maxGap = 0, newGap = -32;
        while (n > 0) {
            if ((n & 1) == 1) {
                maxGap = Math.max(maxGap, newGap);
                newGap = 1;
            } else newGap++;
            n >>= 1;
        }
        return maxGap;
    }
}
