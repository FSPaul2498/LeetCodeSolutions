public class S233 {
    public int countDigitOne(int n) {
        int result = 0, level = 1;
        while (n >= level) {
            int high = n / (level * 10);
            int low = n % (level * 10);
            result += high * level + Math.min(Math.max(low - level + 1, 0), level);
            level *= 10;
        }
        return result;
    }
}
