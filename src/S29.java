public class S29 {
    public int divide(int dividend, int divisor) {
        if (dividend == -2147483648 && divisor == -1) return 2147483647;
        if (dividend == 2147483647 && divisor == 1) return 2147483647;
        int result = 0;
        boolean isNeg = (dividend < 0 ^ divisor < 0);
        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);
        while (dividend <= divisor) {
            int d = divisor;
            int cnt = 1;
            while (dividend <= d && d >= -1073741824) {
                d = d << 1;
                cnt = cnt << 1;
            }
            if (dividend <= d) {
                dividend -= d;
                result += cnt;
            } else {
                dividend -= d >> 1;
                result += cnt >> 1;
            }
        }
        return isNeg ? -result : result;
    }
}
