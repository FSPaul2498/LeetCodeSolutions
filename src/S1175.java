public class S1175 {
    public int numPrimeArrangements(int n) {
        if (n == 1) return 1;
        final int MOD = 1000000007;
        int[] primesLT100 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int[] preSum = new int[101];
        for (int prime : primesLT100) preSum[prime] = 1;
        for (int i = 1; i < 101; i++) preSum[i] += preSum[i - 1];
        long[] factorials = new long[80];
        factorials[1] = 1;
        for (int i = 2; i < 80; i++) factorials[i] = factorials[i - 1] * i % MOD;
        return (int) (factorials[preSum[n]] * factorials[n - preSum[n]] % MOD);
    }
}
