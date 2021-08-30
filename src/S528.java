public class S528 {
    int[] data;
    int n, sum;

    public S528(int[] w) {
        data = w;
        n = data.length;
        for (int i = 1; i < n; i++) data[i] += data[i - 1];
        sum = data[n - 1];
    }

    public int pickIndex() {
        int t = (int) (Math.random() * sum + 1);
        int l = 0, r = n - 1, c = 0;
        while (l <= r) {
            c = (r - l) / 2 + l;
            if (l == r) return l;
            if (data[c] < t) l = c + 1;
            else r = c;
        }
        return c;
    }
}
