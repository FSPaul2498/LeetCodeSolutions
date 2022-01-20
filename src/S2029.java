public class S2029 {
    public boolean stoneGameIX(int[] stones) {
        int[] sn = new int[3];
        for (int s : stones) {
            sn[s % 3]++;
        }
        if (sn[0] % 2 == 0) return sn[1] != 0 && sn[2] != 0;
        return sn[1] - sn[2] > 2 || sn[2] - sn[1] > 2;
    }
}
