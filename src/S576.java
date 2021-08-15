import java.util.Arrays;

public class S576 {
    int[][][] mem = new int[52][52][52];
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, +1}};
    final int MD = 1000000007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        for (int[][] i : mem)
            for (int[] j : i)
                Arrays.fill(j, -1);
        return dfs(maxMove, startColumn + 1, startRow + 1, m, n);
    }

    int dfs(int steps, int x, int y, int m, int n) {
        if (x > n || x <= 0 || y > m || y <= 0)
            return 1;
        else if (steps == 0)
            return 0;
        for (int[] dir : dirs)
            if (mem[x + dir[0]][y + dir[1]][steps - 1] == -1)
                mem[x + dir[0]][y + dir[1]][steps - 1] = dfs(steps - 1, x + dir[0], y + dir[1], m, n);
        return (((mem[x - 1][y][steps - 1] + mem[x + 1][y][steps - 1]) % MD +
                mem[x][y - 1][steps - 1]) % MD +
                mem[x][y + 1][steps - 1]) % MD;
    }
}
