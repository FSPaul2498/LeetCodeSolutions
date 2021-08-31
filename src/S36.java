import java.util.HashSet;

public class S36 {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for (char[] row : board) {
            for (char ch : row) {
                if (ch == '.') continue;
                if (set.contains(ch)) return false;
                set.add(ch);
            }
            set = new HashSet<>();
        }

        for (int column = 0; column < 9; column++) {
            for (int row = 0; row < 9; row++) {
                char ch = board[row][column];
                if (ch == '.') continue;
                if (set.contains(ch)) return false;
                set.add(ch);
            }
            set = new HashSet<>();
        }

        int[][] pos = {{1, 1}, {1, 4}, {1, 7}, {4, 1}, {4, 4}, {4, 7}, {7, 1}, {7, 4}, {7, 7}};
        int[][] vec = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

        for (int[] p : pos) {
            for (int[] v : vec) {
                char ch = board[p[0] + v[0]][p[1] + v[1]];
                if (ch == '.') continue;
                if (set.contains(ch)) return false;
                set.add(ch);
            }
            set = new HashSet<>();
        }

        return true;
    }
}
