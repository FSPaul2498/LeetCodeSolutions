import java.util.*;

public class S710 {
    int range;
    Map<Integer, Integer> map;
    Random rand = new Random();

    public S710(int n, int[] blacklist) {
        range = n - blacklist.length;
        map = new HashMap<>();
        Set<Integer> offRange = new HashSet<>();
        for (int b : blacklist) {
            if (b >= range) offRange.add(b);
        }
        int target = range;
        for (int b : blacklist) {
            if (b < range) {
                while (offRange.contains(target)) target++;
                map.put(b, target++);
            }
        }
    }

    public int pick() {
        int r = rand.nextInt(range);
        return map.getOrDefault(r, r);
    }
}
