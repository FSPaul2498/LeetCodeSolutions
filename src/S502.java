import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class S502 {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length, pos = 0;
        int[][] table = new int[n][2];
        for (int i = 0; i < n; i++) {
            table[i][0] = capital[i];
            table[i][1] = profits[i];
        }
        Arrays.sort(table, Comparator.comparingInt(o -> o[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        while (k > 0) {
            while (pos < n && table[pos][0] <= w) {
                pq.add(table[pos][1]);
                pos++;
            }
            if (!pq.isEmpty()) w += pq.poll();
            else break;
            k--;
        }
        return w;
    }
}
