public class S357 {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;
        int result = 10, mod = 9;
        for (int i = 0; i < n - 1; i++) {
            mod *= 9 - i;
            result += mod;
        }
        return result;
    }
}
