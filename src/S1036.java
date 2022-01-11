import java.util.*;

public class S1036 {
    static final int BOUNDARY = 1000000;
    static final int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        if (blocked.length < 2) {
            return true;
        }
        // 离散化
        TreeSet<Integer> rows = new TreeSet<>();
        TreeSet<Integer> columns = new TreeSet<>();
        for (int[] pos : blocked) {
            rows.add(pos[0]);
            columns.add(pos[1]);
        }
        rows.add(source[0]);
        rows.add(target[0]);
        columns.add(source[1]);
        columns.add(target[1]);

        Map<Integer, Integer> rMapping = new HashMap<>();
        Map<Integer, Integer> cMapping = new HashMap<>();

        int rId = Discretization(rows, rMapping);
        int cId = Discretization(columns, cMapping);

        int[][] grid = new int[rId + 1][cId + 1];
        for (int[] pos : blocked) {
            int x = pos[0], y = pos[1];
            grid[rMapping.get(x)][cMapping.get(y)] = 1;
        }

        int sx = rMapping.get(source[0]), sy = cMapping.get(source[1]);
        int tx = rMapping.get(target[0]), ty = cMapping.get(target[1]);

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sx, sy});
        grid[sx][sy] = 1;
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int x = arr[0], y = arr[1];
            for (int d = 0; d < 4; ++d) {
                int nx = x + dirs[d][0], ny = y + dirs[d][1];
                if (nx >= 0 && nx <= rId && ny >= 0 && ny <= cId && grid[nx][ny] != 1) {
                    if (nx == tx && ny == ty) {
                        return true;
                    }
                    queue.offer(new int[]{nx, ny});
                    grid[nx][ny] = 1;
                }
            }
        }
        return false;
    }

    private int Discretization(TreeSet<Integer> TreeSet, Map<Integer, Integer> Mapping) {
        int first = TreeSet.first();
        int id = (first == 0 ? 0 : 1);
        Mapping.put(first, id);
        int prev = first;
        for (int now : TreeSet) {
            if (now == first) {
                continue;
            }
            id += (now == prev + 1 ? 1 : 2);
            Mapping.put(now, id);
            prev = now;
        }
        if (prev != BOUNDARY - 1) {
            id++;
        }
        return id;
    }
}
