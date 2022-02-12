import java.util.LinkedList;

public class S1020 {
    public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        LinkedList<int[]> thisLevel, nextLevel = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) nextLevel.add(new int[]{i, 0});
            if (grid[i][n - 1] == 1) nextLevel.add(new int[]{i, n - 1});
        }
        for (int j = 1; j < n - 1; j++) {
            if (grid[0][j] == 1) nextLevel.add(new int[]{0, j});
            if (grid[m - 1][j] == 1) nextLevel.add(new int[]{m - 1, j});
        }

        int[] dX = {-1, +0, +0, +1};
        int[] dY = {+0, -1, +1, +0};
        while (!nextLevel.isEmpty()) {
            thisLevel = nextLevel;
            nextLevel = new LinkedList<>();
            while (!thisLevel.isEmpty()) {
                int[] tmp = thisLevel.pop();
                int x = tmp[0], y = tmp[1];
                grid[x][y] = 0;
                for (int i = 0; i < 4; i++) {
                    int nX = x + dX[i], nY = y + dY[i];
                    if (nX >= 0 && nX < m && nY >= 0 && nY < n && grid[nX][nY] == 1) {
                        grid[nX][nY] = 0;
                        nextLevel.add(new int[]{nX, nY});
                    }
                }
            }
        }

        int cnt = 0;
        for (int[] row : grid) {
            for (int i : row) {
                if (i == 1) cnt++;
            }
        }
        return cnt;
    }
}
