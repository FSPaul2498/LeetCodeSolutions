public class S883 {
    public int projectionArea(int[][] grid) {
        int n = grid.length, xy = 0, yz = 0, zx = 0;
        for (int i = 0; i < n; i++) {
            int yzH = 0, zxH = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) xy++;
                yzH = Math.max(yzH, grid[i][j]);
                zxH = Math.max(zxH, grid[j][i]);
            }
            yz += yzH;
            zx += zxH;
        }
        return xy + yz + zx;
    }
}
