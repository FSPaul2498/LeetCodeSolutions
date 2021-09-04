public class SJZ10 {
    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 0;
        while (n > 1) {
            c = (a + b) % 1000000007;
            a = b;
            b = c;
            n--;
        }
        return c;
    }
}
