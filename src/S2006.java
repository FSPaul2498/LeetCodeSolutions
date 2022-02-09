import java.util.HashMap;
import java.util.Map;

public class S2006 {
    public int countKDifference(int[] nums, int k) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            result += map.getOrDefault(num - k, 0) + map.getOrDefault(num + k, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return result;
    }
}
