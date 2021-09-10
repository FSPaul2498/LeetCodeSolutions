public class S1894 {
    public int chalkReplacer(int[] chalk, int k) {
        int sum = 0;
        for (int i : chalk) {
            sum += i;
            if (sum > k) break;
        }
        if (k >= sum) k = k % sum;
        for (int i = 0; i < chalk.length; i++) {
            k -= chalk[i];
            if (k < 0) return i;
        }
        return -1;
    }
}
