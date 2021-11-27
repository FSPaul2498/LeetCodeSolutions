import java.util.HashMap;
import java.util.Map;

public class S519 {
    Map<Integer, Integer> map = new HashMap<>();
    int rest, m, n;

    public S519(int m, int n) {
        this.m = m;
        this.n = n;
        rest = m * n;
    }

    public int[] flip() {
        int rand = (int) (Math.random() * rest--);
        int tRand = map.getOrDefault(rand, rand);
        map.put(rand, map.getOrDefault(rest, rest));
        return new int[]{tRand / n, tRand % n};
    }

    public void reset() {
        map.clear();
        rest = m * n;
    }
}
