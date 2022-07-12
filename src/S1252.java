public class S1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[] mm = new int[m];
        int[] nn = new int[n];
        for (int[] idx : indices) {
            mm[idx[0]]++;
            nn[idx[1]]++;
        }
        int cnt = 0;
        for (int a : mm) {
            for (int b : nn) {
                if ((a + b) % 2 == 1) cnt++;
            }
        }
        return cnt;
    }
}
