import java.util.HashMap;
import java.util.Map;

class MapSum {
    Map<String, Integer> itemMap, prefixMap;

    public MapSum() {
        itemMap = new HashMap<>();
        prefixMap = new HashMap<>();
    }

    public void insert(String key, int val) {
        int diff = val - itemMap.getOrDefault(key, 0);
        itemMap.put(key, val);
        int len = key.length();
        for (int i = 1; i <= len; i++) {
            String prefix = key.substring(0, i);
            prefixMap.put(prefix, prefixMap.getOrDefault(prefix, 0) + diff);
        }
    }

    public int sum(String prefix) {
        return prefixMap.getOrDefault(prefix, 0);
    }
}
