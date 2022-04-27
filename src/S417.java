import java.util.ArrayList;
import java.util.List;

public class S417 {
    int[][] heights, status;
    int[][] ds = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int m, n;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights = heights;
        this.m = heights.length;
        this.n = heights[0].length;
        status = new int[m][n];
        for (int i = 0; i < m; i++) {
            dfs(i, 0, 1);
            dfs(i, n - 1, 2);
        }
        for (int i = 1; i < n; i++) {
            dfs(0, i, 1);
            dfs(m - 1, n - i - 1, 2);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (status[i][j] == 3) {
                    List<Integer> cell = new ArrayList<>(2);
                    cell.add(i);
                    cell.add(j);
                    result.add(cell);
                }
            }
        }
        return result;
    }

    private void dfs(int x, int y, int mask) {
        if ((status[x][y] & mask) == mask) return;
        status[x][y] ^= mask;
        for (int[] d : ds) {
            int modX = x + d[0], modY = y + d[1];
            if (modX >= 0 && modX < m && modY >= 0 && modY < n) {
                if (heights[modX][modY] >= heights[x][y]) dfs(modX, modY, mask);
            }
        }
    }
}
