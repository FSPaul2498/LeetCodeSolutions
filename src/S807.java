public class S807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rows = grid.length, cols = grid[0].length, sum = 0;
        int[] rowLine = new int[rows], colLine = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > rowLine[i]) rowLine[i] = grid[i][j];
                if (grid[i][j] > colLine[j]) colLine[j] = grid[i][j];
            }
        }
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum += Math.min(rowLine[i], colLine[j]) - grid[i][j];
        return sum;
    }
}
