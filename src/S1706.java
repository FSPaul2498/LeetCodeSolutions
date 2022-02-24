public class S1706 {
    public int[] findBall(int[][] grid) {
        int n = grid[0].length;
        int[] answer = new int[n];
        for (int ball = 0; ball < n; ball++) {
            int pos = ball;
            for (int[] h : grid) {
                if (h[pos] == 1) {
                    if (pos + 1 > n - 1 || h[pos + 1] == -1) {
                        pos = -1;
                        break;
                    } else pos++;
                } else {
                    if (pos - 1 < 0 || h[pos - 1] == 1) {
                        pos = -1;
                        break;
                    } else pos--;
                }
            }
            answer[ball] = pos;
        }
        return answer;
    }
}
