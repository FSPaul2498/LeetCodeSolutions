import java.util.PriorityQueue;

public class S871 {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int refueling = 0, prev = 0, fuel = startFuel;
        int n = stations.length;
        for (int i = 0; i <= n; i++) {
            int curr = i < n ? stations[i][0] : target;
            fuel -= curr - prev;
            while (fuel < 0 && !pq.isEmpty()) {
                fuel += pq.poll();
                refueling++;
            }
            if (fuel < 0) return -1;
            if (i < n) {
                pq.offer(stations[i][1]);
                prev = curr;
            }
        }
        return refueling;
    }
}
