import java.util.*;

public class S1606 {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        PriorityQueue<Integer> available = new PriorityQueue<>(Comparator.comparingInt(a -> a));
        for (int i = 0; i < k; i++) {
            available.offer(i);
        }
        PriorityQueue<int[]> busy = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int[] requests = new int[k];
        for (int i = 0; i < arrival.length; i++) {
            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i]) {
                int id = busy.peek()[1];
                busy.poll();
                available.offer(i + ((id - i) % k + k) % k);
            }
            if (available.isEmpty()) continue;
            int server = available.poll() % k;
            requests[server]++;
            busy.offer(new int[]{arrival[i] + load[i], server});
        }
        int maxRequest = -1;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (requests[i] > maxRequest) {
                maxRequest = requests[i];
                result.clear();
            }
            if (requests[i] == maxRequest) {
                result.add(i);
            }
        }
        return result;
    }
}
