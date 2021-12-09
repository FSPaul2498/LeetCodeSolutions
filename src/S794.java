public class S794 {
    public boolean validTicTacToe(String[] board) {
        char[][] t = {board[0].toCharArray(), board[1].toCharArray(), board[2].toCharArray()};
        boolean winX = winner(t, 'X'), winO = winner(t, 'O');
        if (winX && winO) return false;
        int cntX = 0, cntO = 0;
        for (char[] tt : t) {
            for (char ch : tt) {
                if (ch == 'X') cntX++;
                else if (ch == 'O') cntO++;
            }
        }
        if (winX) return cntX - cntO == 1;
        else if (winO) return cntX - cntO == 0;
        else return cntX - cntO <= 1 && cntX - cntO >= 0;
    }

    boolean winner(char[][] t, char ch) {
        if (t[0][0] == ch && t[0][1] == ch && t[0][2] == ch) return true;
        if (t[1][0] == ch && t[1][1] == ch && t[1][2] == ch) return true;
        if (t[2][0] == ch && t[2][1] == ch && t[2][2] == ch) return true;
        if (t[0][0] == ch && t[1][0] == ch && t[2][0] == ch) return true;
        if (t[0][1] == ch && t[1][1] == ch && t[2][1] == ch) return true;
        if (t[0][2] == ch && t[1][2] == ch && t[2][2] == ch) return true;
        if (t[0][0] == ch && t[1][1] == ch && t[2][2] == ch) return true;
        return t[0][2] == ch && t[1][1] == ch && t[2][0] == ch;
    }
}
