import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class S797 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        dfs(graph, 0, graph.length - 1, new Stack<>());
        return result;
    }

    void dfs(int[][] graph, int now, int n, Stack<Integer> path) {
        path.add(now);
        if (now == n) {
            result.add(new ArrayList<>(path));
            path.pop();
            return;
        }
        for (int next : graph[now])
            dfs(graph, next, n, path);
        path.pop();
    }
}
