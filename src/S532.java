import java.util.HashMap;
import java.util.Map;

public class S532 {
    public int findPairs(int[] nums, int k) {
        int pairCnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        if (k > 0) {
            for (int key : map.keySet()) {
                if (map.containsKey(key + k)) pairCnt++;
            }
        } else {
            for (int value : map.values()) {
                if (value > 1) pairCnt++;
            }
        }
        return pairCnt;
    }
}
