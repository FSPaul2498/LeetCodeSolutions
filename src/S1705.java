import java.util.Comparator;
import java.util.PriorityQueue;

public class S1705 {
    public int eatenApples(int[] apples, int[] days) {
        int eaten = 0, n = apples.length, day = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        while (day < n) {
            while (!pq.isEmpty() && pq.peek()[0] <= day) pq.poll();
            if (apples[day] > 0) pq.offer(new int[]{day + days[day], apples[day]});
            if (!pq.isEmpty()) {
                int[] arr = pq.peek();
                arr[1]--;
                if (arr[1] == 0) pq.poll();
                eaten++;
            }
            day++;
        }
        while (!pq.isEmpty()) {
            while (!pq.isEmpty() && pq.peek()[0] <= day) pq.poll();
            if (pq.isEmpty()) break;
            int[] arr = pq.poll();
            int curr = Math.min(arr[0] - day, arr[1]);
            eaten += curr;
            day += curr;
        }
        return eaten;
    }
}
