import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class S851 {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        List<List<Integer>> g = new ArrayList<>(n);
        for (int i = 0; i < n; ++i)
            g.add(new ArrayList<>());
        int[] inDeg = new int[n];
        for (int[] r : richer) {
            g.get(r[0]).add(r[1]);
            inDeg[r[1]]++;
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i)
            ans[i] = i;
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; ++i)
            if (inDeg[i] == 0) q.offer(i);
        while (!q.isEmpty()) {
            int x = q.poll();
            for (int y : g.get(x)) {
                if (quiet[ans[x]] < quiet[ans[y]]) ans[y] = ans[x];
                if (--inDeg[y] == 0) q.offer(y);
            }
        }
        return ans;
    }
}
