import java.util.LinkedList;

public class S847 {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        LinkedList<int[]> list = new LinkedList<>();
        boolean[][] seen = new boolean[n][1 << n];
        for (int i = 0; i < n; ++i) {
            list.add(new int[]{i, 1 << i, 0});
            seen[i][1 << i] = true;
        }
        while (!list.isEmpty()) {
            int[] tuple = list.pop();
            int u = tuple[0], mask = tuple[1], dist = tuple[2];
            if (mask == (1 << n) - 1)
                return dist;
            for (int v : graph[u]) {
                int maskV = mask | (1 << v);
                if (!seen[v][maskV]) {
                    list.add(new int[]{v, maskV, dist + 1});
                    seen[v][maskV] = true;
                }
            }
        }
        return -1;
    }
}
