import java.util.PriorityQueue;

public class S786 {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>
                ((x, y) -> arr[x[0]] * arr[y[1]] - arr[y[0]] * arr[x[1]]);
        for (int i = arr.length - 1; i > 0; i--)
            pq.offer(new int[]{0, i});
        for (int i = 1; i < k; i++) {
            int[] fraction = pq.poll();
            assert fraction != null;
            int x = fraction[0], y = fraction[1];
            if (x + 1 < y) pq.offer(new int[]{x + 1, y});
        }
        assert pq.peek() != null;
        return new int[]{arr[pq.peek()[0]], arr[pq.peek()[1]]};
    }
}
