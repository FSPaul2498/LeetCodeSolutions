import java.util.LinkedList;

public class S1765 {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length, n = isWater[0].length;
        int[][] map = new int[m][n];
        LinkedList<int[]> thisLevel, nextLevel = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    nextLevel.add(new int[]{i, j});
                    map[i][j] = 0;
                } else map[i][j] = -1;
            }
        }
        int[] dX = {-1, +0, +0, +1};
        int[] dY = {+0, -1, +1, +0};
        int h = 0;

        while (!nextLevel.isEmpty()) {
            thisLevel = nextLevel;
            nextLevel = new LinkedList<>();
            h++;
            while (!thisLevel.isEmpty()) {
                int[] tmp = thisLevel.pop();
                int x = tmp[0], y = tmp[1];
                for (int i = 0; i < 4; i++) {
                    int nX = x + dX[i], nY = y + dY[i];
                    if (nX >= 0 && nX < m && nY >= 0 && nY < n && map[nX][nY] == -1) {
                        map[nX][nY] = h;
                        nextLevel.add(new int[]{nX, nY});
                    }
                }
            }
        }
        return map;
    }
}
