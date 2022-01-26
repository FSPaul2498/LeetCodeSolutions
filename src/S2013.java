class DetectSquares {
    int[][] table;

    public DetectSquares() {
        table = new int[1001][1001];
    }

    public void add(int[] point) {
        table[point[0]][point[1]]++;
    }

    public int count(int[] point) {
        int cnt = 0;
        int x = point[0], y = point[1];
        // Point A: (x, y)
        for (int ny = 0; ny < 1001; ny++) {
            // Point B: (x, ny)
            int d = Math.abs(ny - y);
            if (table[x][ny] > 0 && d > 0) {
                if (x - d >= 0) {
                    // Point C: (x - d, y)   Point D: (x - d, ny)
                    cnt += table[x][ny] * table[x - d][y] * table[x - d][ny];
                }
                if (x + d < 1001) {
                    // Point C: (x + d, y)   Point D: (x + d, ny)
                    cnt += table[x][ny] * table[x + d][y] * table[x + d][ny];
                }
            }
        }
        return cnt;
    }
}
