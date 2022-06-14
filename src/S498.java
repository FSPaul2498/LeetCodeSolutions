public class S498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length, t = m * n;
        int x = 0, y = 0;
        int[] diagonal = new int[t];
        for (int i = 0; i < t; i++) {
            diagonal[i] = mat[x][y];
            if (((x + y) & 1) == 0) {
                if (y == n - 1) x++;
                else if (x == 0) y++;
                else {
                    x--;
                    y++;
                }
            } else {
                if (x == m - 1) y++;
                else if (y == 0) x++;
                else {
                    x++;
                    y--;
                }
            }
        }
        return diagonal;
    }
}
