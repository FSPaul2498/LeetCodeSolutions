public class S1137 {
    public int tribonacci(int n) {
        if (n <= 2) return n == 0 ? 0 : 1;
        int a = 0, b = 1, c = 1, tmp;
        while (n > 0) {
            tmp = a + b + c;
            a = b;
            b = c;
            c = tmp;
            n--;
        }
        return a;
    }
}
