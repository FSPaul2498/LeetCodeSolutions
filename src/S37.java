public class S37 {
    public void solveSudoku(char[][] board) {
        solveAt(board, 0, 0);
    }

    boolean solveAt(char[][] board, int x, int y) {
        if (y >= 9) {
            y = 0;
            x++;
            if (x >= 9) return true;
        }
        if (board[x][y] == '.') {
            for (int i = 1; i <= 9; i++) {
                if (isValid(board, x, y, i)) {
                    board[x][y] = (char) (i + 48);
                    if (solveAt(board, x, y + 1)) return true;
                }
            }
            board[x][y] = '.';
            return false;
        } else return solveAt(board, x, y + 1);
    }

    boolean isValid(char[][] board, int x, int y, int num) {
        num += 48;
        for (int column = 0; column < 9; column++) {
            char ch = board[x][column];
            if (ch == num) return false;
        }
        for (int row = 0; row < 9; row++) {
            char ch = board[row][y];
            if (ch == num) return false;
        }
        int[][] vec = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        x = x / 3 * 3 + 1;
        y = y / 3 * 3 + 1;
        for (int[] v : vec) {
            char ch = board[x + v[0]][y + v[1]];
            if (ch == num) return false;
        }
        return true;
    }
}
