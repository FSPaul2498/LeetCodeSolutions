import java.util.HashMap;

public class S1583 {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int result = 0;
        int[][] priority = new int[n][n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - 1; j++)
                priority[i][preferences[i][j]] = j;
        for (int[] pair : pairs) {
            map.put(pair[0], pair[1]);
            map.put(pair[1], pair[0]);
        }
        for (int a = 0; a < n; a++) {
            int b = map.get(a);
            for (int c : preferences[a]) {
                if (c == b) break;
                int d = map.get(c);
                if (priority[c][a] < priority[c][d]) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
