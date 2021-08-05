public class S7 {
    public int reverse(int x) {
        // 2^31-1=2147483647, -2^31=-2147483648
        int result = 0;
        while (x != 0) {
            if (result > 214748364 || result < -214748364) return 0;
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return result;
    }
}
