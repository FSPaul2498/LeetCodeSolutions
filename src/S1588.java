public class S1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length, result = 0;
        for (int i = 0; i < n; i++) {
            int l1 = (i + 1) / 2, r1 = (n - i) / 2;
            int l2 = i / 2, r2 = (n - i - 1) / 2;
            l2++;
            r2++;
            result += (l1 * r1 + l2 * r2) * arr[i];
        }
        return result;
    }
}
