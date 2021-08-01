public class S1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int cnt = 0;
        int[] result = new int[k];
        boolean[] mark = new boolean[mat.length];
        for (int n = 0; n < mat[0].length; n++) {
            for (int m = 0; m < mat.length; m++) {
                if (!mark[m] && mat[m][n] == 0) {
                    mark[m] = true;
                    result[cnt] = m;
                    cnt++;
                    if (cnt >= k) return result;
                }
            }
        }
        for (int m = 0; m < mat.length; m++) {
            if (!mark[m] && mat[m][mat[0].length-1] == 1) {
                mark[m] = true;
                result[cnt] = m;
                cnt++;
                if (cnt >= k) return result;
            }
        }
        return result;
    }
}
