public class S397 {
    public int integerReplacement(int n) {
        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                steps++;
                n /= 2;
            } else if (n == 3) {
                steps += 2;
                n = 1;
            } else if (n % 4 == 1) {
                steps += 2;
                n /= 2;
            } else {
                steps += 2;
                n = n / 2 + 1;
            }
        }
        return steps;
    }
}
