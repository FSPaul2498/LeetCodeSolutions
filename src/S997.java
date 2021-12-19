public class S997 {
    public int findJudge(int n, int[][] trust) {
        int[] beTrusted = new int[n + 1];
        for (int[] t : trust) {
            beTrusted[t[0]]--;
            beTrusted[t[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (beTrusted[i] == n - 1) return i;
        }
        return -1;
    }
}
