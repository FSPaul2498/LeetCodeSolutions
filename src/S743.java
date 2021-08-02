import java.util.*;

public class S743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] graph = new int[n + 1][n + 1];
        for (int[] row : graph)
            Arrays.fill(row, 100000);
        for (int[] row : times)
            graph[row[0]][row[1]] = row[2];
        int[] reachTime = new int[n + 1];
        Arrays.fill(reachTime, 100000);
        reachTime[k] = 0;
        boolean[] visited = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            int nearest = 0;
            for (int check = 1; check <= n; check++)
                if (!visited[check] && reachTime[check] < reachTime[nearest])
                    nearest = check;
            visited[nearest] = true;
            for (int update = 1; update <= n; update++)
                reachTime[update] = Math.min(reachTime[update], reachTime[nearest] + graph[nearest][update]);
        }
        int result = -1;
        for (int i = 1; i <= n; i++) {
            if (reachTime[i] == 100000) return -1;
            result = Math.max(reachTime[i], result);
        }
        return result;
    }
}
