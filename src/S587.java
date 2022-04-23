import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S587 {
    public int[][] outerTrees(int[][] trees) {
        int n = trees.length;
        if (n < 4) return trees;
        Arrays.sort(trees, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });
        List<Integer> hull = new ArrayList<>();
        boolean[] used = new boolean[n];
        hull.add(0);
        for (int i = 1; i < n; i++) {
            while (hull.size() > 1 && cross(trees[hull.get(hull.size() - 2)], trees[hull.get(hull.size() - 1)], trees[i]) < 0) {
                used[hull.get(hull.size() - 1)] = false;
                hull.remove(hull.size() - 1);
            }
            used[i] = true;
            hull.add(i);
        }
        int m = hull.size();
        for (int i = n - 2; i >= 0; i--) {
            if (!used[i]) {
                while (hull.size() > m && cross(trees[hull.get(hull.size() - 2)], trees[hull.get(hull.size() - 1)], trees[i]) < 0) {
                    used[hull.get(hull.size() - 1)] = false;
                    hull.remove(hull.size() - 1);
                }
                used[i] = true;
                hull.add(i);
            }
        }
        hull.remove(hull.size() - 1);
        int size = hull.size();
        int[][] res = new int[size][2];
        for (int i = 0; i < size; i++) {
            res[i] = trees[hull.get(i)];
        }
        return res;
    }

    public int cross(int[] p, int[] q, int[] r) {
        return (q[0] - p[0]) * (r[1] - q[1]) - (q[1] - p[1]) * (r[0] - q[0]);
    }
}