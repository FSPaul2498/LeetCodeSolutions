public class S829 {
    public int consecutiveNumbersSum(int n) {
        n *= 2;
        int cnt = 0;
        for (int k = 1; k * k < n; k++) {
            if (n % k != 0) continue;
            if ((n / k - (k - 1)) % 2 == 0) cnt++;
        }
        return cnt;
    }
}
