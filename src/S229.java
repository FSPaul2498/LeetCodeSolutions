import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class S229 {
    public List<Integer> majorityElement(int[] nums) {
        int lmt = nums.length / 3 + 1;
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) == lmt) result.add(i);
        }
        return result;
    }
}
