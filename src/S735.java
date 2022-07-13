import java.util.ArrayDeque;
import java.util.Deque;

public class S735 {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int asteroid : asteroids) {
            if (queue.isEmpty() || asteroid > 0) queue.push(asteroid);
            else {
                while (true) {
                    if (queue.isEmpty() || queue.peek() < 0) {
                        queue.push(asteroid);
                        break;
                    }
                    int crash = queue.peek() + asteroid;
                    if (crash <= 0) queue.pop();
                    if (crash >= 0) break;
                }
            }
        }
        int[] result = new int[queue.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = queue.remove();
        }
        return result;
    }
}
