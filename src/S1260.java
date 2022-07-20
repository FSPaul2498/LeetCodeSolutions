import java.util.ArrayList;
import java.util.List;

public class S1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        k %= m * n;
        List<Integer> all = new ArrayList<>(m * n + k);
        for (int[] g : grid) {
            for (int x : g) {
                all.add(x);
            }
        }
        all.addAll(0, all.subList(n * m - k, n * m));
        List<List<Integer>> shifted = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            shifted.add(all.subList(n * i, n * (i + 1)));
        }
        return shifted;
    }
}
