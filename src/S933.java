import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.add(t);
        while (requests.element() < t - 3000) {
            requests.remove();
        }
        return requests.size();
    }
}
