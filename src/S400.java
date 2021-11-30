public class S400 {
    public int findNthDigit(int n) {
        int[] table = {0, 9, 90 * 2, 900 * 3, 9000 * 4, 90000 * 5, 900000 * 6, 9000000 * 7, 90000000 * 8, Integer.MAX_VALUE};
        int len = 0;
        while (n > table[len]) n -= table[len++];
        int num = (int) Math.pow(10, len - 1) + (n - 1) / len;
        int pos = len - (n - 1) % len;
        return num / (int) Math.pow(10, pos - 1) % 10;
    }
}
