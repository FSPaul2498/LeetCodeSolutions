import java.util.*;

class AllOne {
    Map<String, Integer> s2i = new HashMap<>();
    TreeMap<Integer, Set<String>> i2s = new TreeMap<>();

    public AllOne() {
    }

    public void inc(String key) {
        int origin = s2i.getOrDefault(key, 0);
        moveKey(key, origin, +1);
    }

    public void dec(String key) {
        int origin = s2i.getOrDefault(key, 0);
        moveKey(key, origin, -1);
    }

    public String getMaxKey() {
        if (s2i.size() == 0) return "";
        return i2s.get(i2s.lastKey()).iterator().next();
    }

    public String getMinKey() {
        if (s2i.size() == 0) return "";
        return i2s.get(i2s.firstKey()).iterator().next();
    }

    private void moveKey(String key, int origin, int offset) {
        int dest = origin + offset;
        if (dest == 0) s2i.remove(key);
        else s2i.put(key, dest);

        if (dest > 0) {
            i2s.putIfAbsent(dest, new HashSet<>());
            i2s.get(dest).add(key);
        }
        if (origin > 0) {
            if (i2s.get(origin).size() == 1) i2s.remove(origin);
            else i2s.get(origin).remove(key);
        }
    }
}
