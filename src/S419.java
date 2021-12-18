public class S419 {
    public int countBattleships(char[][] board) {
        int ships = 0, m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((board[i][j] == 'X') && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.')) {
                    ships++;
                }
            }
        }
        return ships;
    }
}
