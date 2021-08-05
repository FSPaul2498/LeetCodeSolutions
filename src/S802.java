import java.util.ArrayList;
import java.util.List;

public class S802 {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] status = new int[n];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if ((status[i] = dfs(graph, status, i)) == -1)
                result.add(i);
        return result;
    }

    int dfs(int[][] graph, int[] status, int pos) {
        if (graph[pos].length == 0)
            return -1;
        if (status[pos] < 0)
            return -1;
        if (status[pos] > 0)
            return 2;
        status[pos] = 1;
        for (int j : graph[pos])
            if (dfs(graph, status, j) == 2)
                return status[j] = 2;
        return status[pos] = -1;
    }
}
