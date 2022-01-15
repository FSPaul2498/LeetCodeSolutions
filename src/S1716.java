public class S1716 {
    public int totalMoney(int n) {
        int w = n / 7, d = n % 7;
        return (w * (7 * w + 49) + d * (d + 1)) / 2 + d * w;
    }
}
