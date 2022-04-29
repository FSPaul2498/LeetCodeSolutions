public class S427 {
    public QuadTreeNode construct(int[][] grid) {
        return makeQNode(grid, 0, 0, grid.length);
    }

    private QuadTreeNode makeQNode(int[][] grid, int x, int y, int w) {
        int data = grid[x][y];
        boolean isLeaf = true;
        for (int i = x; i < x + w; i++) {
            for (int j = y; j < y + w; j++) {
                if (grid[i][j] != data) {
                    isLeaf = false;
                    break;
                }
            }
            if (!isLeaf) break;
        }
        if (isLeaf) {
            return new QuadTreeNode(data == 1, true);
        }
        return new QuadTreeNode(true, false,
                makeQNode(grid, x, y, w / 2),
                makeQNode(grid, x, y + w / 2, w / 2),
                makeQNode(grid, x + w / 2, y, w / 2),
                makeQNode(grid, x + w / 2, y + w / 2, w / 2)
        );
    }
}
