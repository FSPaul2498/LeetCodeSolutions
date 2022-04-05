public class S762 {
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
        for (int i = left; i <= right; i++) {
            cnt += 665772 >> Integer.bitCount(i) & 1;
        }
        return cnt;
    }
}
